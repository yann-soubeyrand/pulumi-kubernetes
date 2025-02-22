// Code generated by pulumigen DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package v1

import (
	"context"
	"reflect"

	metav1 "github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes/meta/v1"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Patch resources are used to modify existing Kubernetes resources by using
// Server-Side Apply updates. The name of the resource must be specified, but all other properties are optional. More than
// one patch may be applied to the same resource, and a random FieldManager name will be used for each Patch resource.
// Conflicts will result in an error by default, but can be forced using the "pulumi.com/patchForce" annotation. See the
// [Server-Side Apply Docs](https://www.pulumi.com/registry/packages/kubernetes/installation-configuration/#server-side-apply) for
// additional information about using Server-Side Apply to manage Kubernetes resources with Pulumi.
// LimitRange sets resource usage limits for each kind of resource in a Namespace.
type LimitRangePatch struct {
	pulumi.CustomResourceState

	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrOutput `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrOutput `pulumi:"kind"`
	// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata metav1.ObjectMetaPatchPtrOutput `pulumi:"metadata"`
	// Spec defines the limits enforced. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
	Spec LimitRangeSpecPatchPtrOutput `pulumi:"spec"`
}

// NewLimitRangePatch registers a new resource with the given unique name, arguments, and options.
func NewLimitRangePatch(ctx *pulumi.Context,
	name string, args *LimitRangePatchArgs, opts ...pulumi.ResourceOption) (*LimitRangePatch, error) {
	if args == nil {
		args = &LimitRangePatchArgs{}
	}

	args.ApiVersion = pulumi.StringPtr("v1")
	args.Kind = pulumi.StringPtr("LimitRange")
	var resource LimitRangePatch
	err := ctx.RegisterResource("kubernetes:core/v1:LimitRangePatch", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLimitRangePatch gets an existing LimitRangePatch resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLimitRangePatch(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LimitRangePatchState, opts ...pulumi.ResourceOption) (*LimitRangePatch, error) {
	var resource LimitRangePatch
	err := ctx.ReadResource("kubernetes:core/v1:LimitRangePatch", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LimitRangePatch resources.
type limitRangePatchState struct {
}

type LimitRangePatchState struct {
}

func (LimitRangePatchState) ElementType() reflect.Type {
	return reflect.TypeOf((*limitRangePatchState)(nil)).Elem()
}

type limitRangePatchArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion *string `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind *string `pulumi:"kind"`
	// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *metav1.ObjectMetaPatch `pulumi:"metadata"`
	// Spec defines the limits enforced. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
	Spec *LimitRangeSpecPatch `pulumi:"spec"`
}

// The set of arguments for constructing a LimitRangePatch resource.
type LimitRangePatchArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrInput
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrInput
	// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata metav1.ObjectMetaPatchPtrInput
	// Spec defines the limits enforced. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
	Spec LimitRangeSpecPatchPtrInput
}

func (LimitRangePatchArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*limitRangePatchArgs)(nil)).Elem()
}

type LimitRangePatchInput interface {
	pulumi.Input

	ToLimitRangePatchOutput() LimitRangePatchOutput
	ToLimitRangePatchOutputWithContext(ctx context.Context) LimitRangePatchOutput
}

func (*LimitRangePatch) ElementType() reflect.Type {
	return reflect.TypeOf((**LimitRangePatch)(nil)).Elem()
}

func (i *LimitRangePatch) ToLimitRangePatchOutput() LimitRangePatchOutput {
	return i.ToLimitRangePatchOutputWithContext(context.Background())
}

func (i *LimitRangePatch) ToLimitRangePatchOutputWithContext(ctx context.Context) LimitRangePatchOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LimitRangePatchOutput)
}

// LimitRangePatchArrayInput is an input type that accepts LimitRangePatchArray and LimitRangePatchArrayOutput values.
// You can construct a concrete instance of `LimitRangePatchArrayInput` via:
//
//	LimitRangePatchArray{ LimitRangePatchArgs{...} }
type LimitRangePatchArrayInput interface {
	pulumi.Input

	ToLimitRangePatchArrayOutput() LimitRangePatchArrayOutput
	ToLimitRangePatchArrayOutputWithContext(context.Context) LimitRangePatchArrayOutput
}

type LimitRangePatchArray []LimitRangePatchInput

func (LimitRangePatchArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LimitRangePatch)(nil)).Elem()
}

func (i LimitRangePatchArray) ToLimitRangePatchArrayOutput() LimitRangePatchArrayOutput {
	return i.ToLimitRangePatchArrayOutputWithContext(context.Background())
}

func (i LimitRangePatchArray) ToLimitRangePatchArrayOutputWithContext(ctx context.Context) LimitRangePatchArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LimitRangePatchArrayOutput)
}

// LimitRangePatchMapInput is an input type that accepts LimitRangePatchMap and LimitRangePatchMapOutput values.
// You can construct a concrete instance of `LimitRangePatchMapInput` via:
//
//	LimitRangePatchMap{ "key": LimitRangePatchArgs{...} }
type LimitRangePatchMapInput interface {
	pulumi.Input

	ToLimitRangePatchMapOutput() LimitRangePatchMapOutput
	ToLimitRangePatchMapOutputWithContext(context.Context) LimitRangePatchMapOutput
}

type LimitRangePatchMap map[string]LimitRangePatchInput

func (LimitRangePatchMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LimitRangePatch)(nil)).Elem()
}

func (i LimitRangePatchMap) ToLimitRangePatchMapOutput() LimitRangePatchMapOutput {
	return i.ToLimitRangePatchMapOutputWithContext(context.Background())
}

func (i LimitRangePatchMap) ToLimitRangePatchMapOutputWithContext(ctx context.Context) LimitRangePatchMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LimitRangePatchMapOutput)
}

type LimitRangePatchOutput struct{ *pulumi.OutputState }

func (LimitRangePatchOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LimitRangePatch)(nil)).Elem()
}

func (o LimitRangePatchOutput) ToLimitRangePatchOutput() LimitRangePatchOutput {
	return o
}

func (o LimitRangePatchOutput) ToLimitRangePatchOutputWithContext(ctx context.Context) LimitRangePatchOutput {
	return o
}

// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
func (o LimitRangePatchOutput) ApiVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LimitRangePatch) pulumi.StringPtrOutput { return v.ApiVersion }).(pulumi.StringPtrOutput)
}

// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
func (o LimitRangePatchOutput) Kind() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LimitRangePatch) pulumi.StringPtrOutput { return v.Kind }).(pulumi.StringPtrOutput)
}

// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
func (o LimitRangePatchOutput) Metadata() metav1.ObjectMetaPatchPtrOutput {
	return o.ApplyT(func(v *LimitRangePatch) metav1.ObjectMetaPatchPtrOutput { return v.Metadata }).(metav1.ObjectMetaPatchPtrOutput)
}

// Spec defines the limits enforced. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
func (o LimitRangePatchOutput) Spec() LimitRangeSpecPatchPtrOutput {
	return o.ApplyT(func(v *LimitRangePatch) LimitRangeSpecPatchPtrOutput { return v.Spec }).(LimitRangeSpecPatchPtrOutput)
}

type LimitRangePatchArrayOutput struct{ *pulumi.OutputState }

func (LimitRangePatchArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LimitRangePatch)(nil)).Elem()
}

func (o LimitRangePatchArrayOutput) ToLimitRangePatchArrayOutput() LimitRangePatchArrayOutput {
	return o
}

func (o LimitRangePatchArrayOutput) ToLimitRangePatchArrayOutputWithContext(ctx context.Context) LimitRangePatchArrayOutput {
	return o
}

func (o LimitRangePatchArrayOutput) Index(i pulumi.IntInput) LimitRangePatchOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LimitRangePatch {
		return vs[0].([]*LimitRangePatch)[vs[1].(int)]
	}).(LimitRangePatchOutput)
}

type LimitRangePatchMapOutput struct{ *pulumi.OutputState }

func (LimitRangePatchMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LimitRangePatch)(nil)).Elem()
}

func (o LimitRangePatchMapOutput) ToLimitRangePatchMapOutput() LimitRangePatchMapOutput {
	return o
}

func (o LimitRangePatchMapOutput) ToLimitRangePatchMapOutputWithContext(ctx context.Context) LimitRangePatchMapOutput {
	return o
}

func (o LimitRangePatchMapOutput) MapIndex(k pulumi.StringInput) LimitRangePatchOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LimitRangePatch {
		return vs[0].(map[string]*LimitRangePatch)[vs[1].(string)]
	}).(LimitRangePatchOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LimitRangePatchInput)(nil)).Elem(), &LimitRangePatch{})
	pulumi.RegisterInputType(reflect.TypeOf((*LimitRangePatchArrayInput)(nil)).Elem(), LimitRangePatchArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LimitRangePatchMapInput)(nil)).Elem(), LimitRangePatchMap{})
	pulumi.RegisterOutputType(LimitRangePatchOutput{})
	pulumi.RegisterOutputType(LimitRangePatchArrayOutput{})
	pulumi.RegisterOutputType(LimitRangePatchMapOutput{})
}
