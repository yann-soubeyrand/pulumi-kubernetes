//nolint:copylocks
package gomega

import (
	"errors"
	"fmt"
	"strings"

	. "github.com/onsi/gomega"
	. "github.com/onsi/gomega/gstruct"
	gomegatypes "github.com/onsi/gomega/types"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
	structpb "google.golang.org/protobuf/types/known/structpb"

	pulumirpc "github.com/pulumi/pulumi/sdk/v3/proto/go"
)

// ProtobufStruct matches a protobuf struct by decoding it to a map and then applying the given matcher.
func ProtobufStruct(matcher gomegatypes.GomegaMatcher) gomegatypes.GomegaMatcher {
	return WithTransform(func(actual structpb.Struct) (map[string]interface{}, error) {
		m := actual.AsMap()
		return m, nil
	}, matcher)
}

// Alias matches an Alias by name, type, and/or parent.
// The following option types are supported:
// - resource.URN - matches the parent URN
// - tokens.Type - matches the type
// - tokens.QName - matches the name
// - string - matches the name
func Alias(opts ...any) gomegatypes.GomegaMatcher {
	m := AliasMatcher{}
	for len(opts) > 0 {
		switch v := opts[0].(type) {
		case resource.URN:
			m.ParentURN = &v
		case tokens.Type:
			m.Type = &v
		case tokens.QName:
			m.Name = &v
		case string:
			q := tokens.QName(v)
			m.Name = &q
		default:
		}
		opts = opts[1:]
	}
	return &m
}

type AliasMatcher struct {
	Name      *tokens.QName
	Type      *tokens.Type
	ParentURN *resource.URN
	NoParent  *bool
}

var _ gomegatypes.GomegaMatcher = &AliasMatcher{}

func (matcher *AliasMatcher) Match(actual interface{}) (success bool, err error) {
	if alias, ok := actual.(*pulumirpc.Alias); ok {
		if matcher.Name != nil && alias.GetSpec().GetName() != string(*matcher.Name) {
			return false, nil
		}
		if matcher.Type != nil && alias.GetSpec().GetType() != string(*matcher.Type) {
			return false, nil
		}
		if matcher.ParentURN != nil && alias.GetSpec().GetParentUrn() != string(*matcher.ParentURN) {
			return false, nil
		}
		if matcher.NoParent != nil && alias.GetSpec().GetNoParent() != *matcher.NoParent {
			return false, nil
		}
		return true, nil
	}
	return false, fmt.Errorf("aliasNameMatcher matcher expects a *pulumirpc.Alias")
}

func (matcher *AliasMatcher) FailureMessage(actual interface{}) (message string) {
	var msg strings.Builder
	fmt.Fprintf(&msg, "Expected:\n\t%#v\nto have ", actual)
	if matcher.Name != nil {
		fmt.Fprintf(&msg, "name=%q", *matcher.Name)
	}
	if matcher.Type != nil {
		fmt.Fprintf(&msg, "type=%q", *matcher.Type)
	}
	if matcher.ParentURN != nil {
		fmt.Fprintf(&msg, "parentURN=%q", *matcher.ParentURN)
	}
	if matcher.NoParent != nil {
		fmt.Fprintf(&msg, "noParent=%t", *matcher.NoParent)
	}
	return msg.String()
}

func (matcher *AliasMatcher) NegatedFailureMessage(actual interface{}) (message string) {
	var msg strings.Builder
	fmt.Fprintf(&msg, "Expected:\n\t%#v\nto not have ", actual)
	if matcher.Name != nil {
		fmt.Fprintf(&msg, "name=%q", *matcher.Name)
	}
	if matcher.Type != nil {
		fmt.Fprintf(&msg, "type=%q", *matcher.Type)
	}
	if matcher.ParentURN != nil {
		fmt.Fprintf(&msg, "parentURN=%q", *matcher.ParentURN)
	}
	if matcher.NoParent != nil {
		fmt.Fprintf(&msg, "noParent=%t", *matcher.NoParent)
	}
	return msg.String()
}

func MatchValue(v gomegatypes.GomegaMatcher) gomegatypes.GomegaMatcher {
	return WithTransform(func(v resource.PropertyValue) (any, error) {
		return v.V, nil
	}, v)
}

func BeComputed() gomegatypes.GomegaMatcher {
	return Equal(resource.MakeComputed(resource.NewStringProperty("")))
}

type Props map[resource.PropertyKey]gomegatypes.GomegaMatcher

func MatchProps(options Options, props Props) gomegatypes.GomegaMatcher {
	keys := make(Keys, len(props))
	for p, v := range props {
		keys[p] = v
	}
	return &KeysMatcher{
		Keys:          keys,
		IgnoreExtras:  options&IgnoreExtras != 0,
		IgnoreMissing: options&IgnoreMissing != 0,
	}
}

func BeObject(matcher ...gomegatypes.GomegaMatcher) gomegatypes.GomegaMatcher {
	return WithTransform(func(v resource.PropertyValue) (resource.PropertyMap, error) {
		if !v.IsObject() {
			return nil, errors.New("expected property value of type 'object'")
		}
		return v.ObjectValue(), nil
	}, And(matcher...))
}

func MatchObject(options Options, props Props) gomegatypes.GomegaMatcher {
	return BeObject(MatchProps(options, props))
}

func BeSecret(matcher ...gomegatypes.GomegaMatcher) gomegatypes.GomegaMatcher {
	return WithTransform(func(v resource.PropertyValue) (resource.PropertyValue, error) {
		if !v.IsSecret() {
			return resource.PropertyValue{}, errors.New("expected property value of type 'secret'")
		}
		return v.SecretValue().Element, nil
	}, And(matcher...))
}

func MatchSecret(e gomegatypes.GomegaMatcher) gomegatypes.GomegaMatcher {
	return BeSecret(e)
}

func BeArray(matcher ...gomegatypes.GomegaMatcher) gomegatypes.GomegaMatcher {
	return WithTransform(func(v resource.PropertyValue) ([]resource.PropertyValue, error) {
		if !v.IsArray() {
			return nil, errors.New("expected property value of type 'array'")
		}
		return v.ArrayValue(), nil
	}, And(matcher...))
}

func MatchArrayValue(matcher gomegatypes.GomegaMatcher) gomegatypes.GomegaMatcher {
	return BeArray(matcher)
}