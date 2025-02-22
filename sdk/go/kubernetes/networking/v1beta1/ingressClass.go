// Code generated by pulumigen DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package v1beta1

import (
	"context"
	"reflect"

	metav1 "github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes/meta/v1"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// IngressClass represents the class of the Ingress, referenced by the Ingress Spec. The `ingressclass.kubernetes.io/is-default-class` annotation can be used to indicate that an IngressClass should be considered default. When a single IngressClass resource has this annotation set to true, new Ingress resources without a class specified will be assigned this default class.
type IngressClass struct {
	pulumi.CustomResourceState

	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrOutput `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrOutput `pulumi:"kind"`
	// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata metav1.ObjectMetaPtrOutput `pulumi:"metadata"`
	// Spec is the desired state of the IngressClass. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
	Spec IngressClassSpecPtrOutput `pulumi:"spec"`
}

// NewIngressClass registers a new resource with the given unique name, arguments, and options.
func NewIngressClass(ctx *pulumi.Context,
	name string, args *IngressClassArgs, opts ...pulumi.ResourceOption) (*IngressClass, error) {
	if args == nil {
		args = &IngressClassArgs{}
	}

	args.ApiVersion = pulumi.StringPtr("networking.k8s.io/v1beta1")
	args.Kind = pulumi.StringPtr("IngressClass")
	aliases := pulumi.Aliases([]pulumi.Alias{
		{
			Type: pulumi.String("kubernetes:networking.k8s.io/v1:IngressClass"),
		},
	})
	opts = append(opts, aliases)
	var resource IngressClass
	err := ctx.RegisterResource("kubernetes:networking.k8s.io/v1beta1:IngressClass", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetIngressClass gets an existing IngressClass resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetIngressClass(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *IngressClassState, opts ...pulumi.ResourceOption) (*IngressClass, error) {
	var resource IngressClass
	err := ctx.ReadResource("kubernetes:networking.k8s.io/v1beta1:IngressClass", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering IngressClass resources.
type ingressClassState struct {
}

type IngressClassState struct {
}

func (IngressClassState) ElementType() reflect.Type {
	return reflect.TypeOf((*ingressClassState)(nil)).Elem()
}

type ingressClassArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion *string `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind *string `pulumi:"kind"`
	// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *metav1.ObjectMeta `pulumi:"metadata"`
	// Spec is the desired state of the IngressClass. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
	Spec *IngressClassSpec `pulumi:"spec"`
}

// The set of arguments for constructing a IngressClass resource.
type IngressClassArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrInput
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrInput
	// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata metav1.ObjectMetaPtrInput
	// Spec is the desired state of the IngressClass. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
	Spec IngressClassSpecPtrInput
}

func (IngressClassArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ingressClassArgs)(nil)).Elem()
}

type IngressClassInput interface {
	pulumi.Input

	ToIngressClassOutput() IngressClassOutput
	ToIngressClassOutputWithContext(ctx context.Context) IngressClassOutput
}

func (*IngressClass) ElementType() reflect.Type {
	return reflect.TypeOf((**IngressClass)(nil)).Elem()
}

func (i *IngressClass) ToIngressClassOutput() IngressClassOutput {
	return i.ToIngressClassOutputWithContext(context.Background())
}

func (i *IngressClass) ToIngressClassOutputWithContext(ctx context.Context) IngressClassOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IngressClassOutput)
}

// IngressClassArrayInput is an input type that accepts IngressClassArray and IngressClassArrayOutput values.
// You can construct a concrete instance of `IngressClassArrayInput` via:
//
//	IngressClassArray{ IngressClassArgs{...} }
type IngressClassArrayInput interface {
	pulumi.Input

	ToIngressClassArrayOutput() IngressClassArrayOutput
	ToIngressClassArrayOutputWithContext(context.Context) IngressClassArrayOutput
}

type IngressClassArray []IngressClassInput

func (IngressClassArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IngressClass)(nil)).Elem()
}

func (i IngressClassArray) ToIngressClassArrayOutput() IngressClassArrayOutput {
	return i.ToIngressClassArrayOutputWithContext(context.Background())
}

func (i IngressClassArray) ToIngressClassArrayOutputWithContext(ctx context.Context) IngressClassArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IngressClassArrayOutput)
}

// IngressClassMapInput is an input type that accepts IngressClassMap and IngressClassMapOutput values.
// You can construct a concrete instance of `IngressClassMapInput` via:
//
//	IngressClassMap{ "key": IngressClassArgs{...} }
type IngressClassMapInput interface {
	pulumi.Input

	ToIngressClassMapOutput() IngressClassMapOutput
	ToIngressClassMapOutputWithContext(context.Context) IngressClassMapOutput
}

type IngressClassMap map[string]IngressClassInput

func (IngressClassMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IngressClass)(nil)).Elem()
}

func (i IngressClassMap) ToIngressClassMapOutput() IngressClassMapOutput {
	return i.ToIngressClassMapOutputWithContext(context.Background())
}

func (i IngressClassMap) ToIngressClassMapOutputWithContext(ctx context.Context) IngressClassMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IngressClassMapOutput)
}

type IngressClassOutput struct{ *pulumi.OutputState }

func (IngressClassOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**IngressClass)(nil)).Elem()
}

func (o IngressClassOutput) ToIngressClassOutput() IngressClassOutput {
	return o
}

func (o IngressClassOutput) ToIngressClassOutputWithContext(ctx context.Context) IngressClassOutput {
	return o
}

// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
func (o IngressClassOutput) ApiVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *IngressClass) pulumi.StringPtrOutput { return v.ApiVersion }).(pulumi.StringPtrOutput)
}

// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
func (o IngressClassOutput) Kind() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *IngressClass) pulumi.StringPtrOutput { return v.Kind }).(pulumi.StringPtrOutput)
}

// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
func (o IngressClassOutput) Metadata() metav1.ObjectMetaPtrOutput {
	return o.ApplyT(func(v *IngressClass) metav1.ObjectMetaPtrOutput { return v.Metadata }).(metav1.ObjectMetaPtrOutput)
}

// Spec is the desired state of the IngressClass. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
func (o IngressClassOutput) Spec() IngressClassSpecPtrOutput {
	return o.ApplyT(func(v *IngressClass) IngressClassSpecPtrOutput { return v.Spec }).(IngressClassSpecPtrOutput)
}

type IngressClassArrayOutput struct{ *pulumi.OutputState }

func (IngressClassArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IngressClass)(nil)).Elem()
}

func (o IngressClassArrayOutput) ToIngressClassArrayOutput() IngressClassArrayOutput {
	return o
}

func (o IngressClassArrayOutput) ToIngressClassArrayOutputWithContext(ctx context.Context) IngressClassArrayOutput {
	return o
}

func (o IngressClassArrayOutput) Index(i pulumi.IntInput) IngressClassOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *IngressClass {
		return vs[0].([]*IngressClass)[vs[1].(int)]
	}).(IngressClassOutput)
}

type IngressClassMapOutput struct{ *pulumi.OutputState }

func (IngressClassMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IngressClass)(nil)).Elem()
}

func (o IngressClassMapOutput) ToIngressClassMapOutput() IngressClassMapOutput {
	return o
}

func (o IngressClassMapOutput) ToIngressClassMapOutputWithContext(ctx context.Context) IngressClassMapOutput {
	return o
}

func (o IngressClassMapOutput) MapIndex(k pulumi.StringInput) IngressClassOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *IngressClass {
		return vs[0].(map[string]*IngressClass)[vs[1].(string)]
	}).(IngressClassOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*IngressClassInput)(nil)).Elem(), &IngressClass{})
	pulumi.RegisterInputType(reflect.TypeOf((*IngressClassArrayInput)(nil)).Elem(), IngressClassArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*IngressClassMapInput)(nil)).Elem(), IngressClassMap{})
	pulumi.RegisterOutputType(IngressClassOutput{})
	pulumi.RegisterOutputType(IngressClassArrayOutput{})
	pulumi.RegisterOutputType(IngressClassMapOutput{})
}
