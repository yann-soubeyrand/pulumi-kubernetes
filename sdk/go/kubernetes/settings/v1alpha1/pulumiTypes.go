// Code generated by pulumigen DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package v1alpha1

import (
	"context"
	"reflect"

	corev1 "github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes/core/v1"
	metav1 "github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes/meta/v1"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// PodPreset is a policy resource that defines additional runtime requirements for a Pod.
type PodPresetType struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion *string `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind     *string            `pulumi:"kind"`
	Metadata *metav1.ObjectMeta `pulumi:"metadata"`
	Spec     *PodPresetSpec     `pulumi:"spec"`
}

// PodPresetTypeInput is an input type that accepts PodPresetTypeArgs and PodPresetTypeOutput values.
// You can construct a concrete instance of `PodPresetTypeInput` via:
//
//	PodPresetTypeArgs{...}
type PodPresetTypeInput interface {
	pulumi.Input

	ToPodPresetTypeOutput() PodPresetTypeOutput
	ToPodPresetTypeOutputWithContext(context.Context) PodPresetTypeOutput
}

// PodPreset is a policy resource that defines additional runtime requirements for a Pod.
type PodPresetTypeArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrInput `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind     pulumi.StringPtrInput     `pulumi:"kind"`
	Metadata metav1.ObjectMetaPtrInput `pulumi:"metadata"`
	Spec     PodPresetSpecPtrInput     `pulumi:"spec"`
}

func (PodPresetTypeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*PodPresetType)(nil)).Elem()
}

func (i PodPresetTypeArgs) ToPodPresetTypeOutput() PodPresetTypeOutput {
	return i.ToPodPresetTypeOutputWithContext(context.Background())
}

func (i PodPresetTypeArgs) ToPodPresetTypeOutputWithContext(ctx context.Context) PodPresetTypeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PodPresetTypeOutput)
}

// PodPresetTypeArrayInput is an input type that accepts PodPresetTypeArray and PodPresetTypeArrayOutput values.
// You can construct a concrete instance of `PodPresetTypeArrayInput` via:
//
//	PodPresetTypeArray{ PodPresetTypeArgs{...} }
type PodPresetTypeArrayInput interface {
	pulumi.Input

	ToPodPresetTypeArrayOutput() PodPresetTypeArrayOutput
	ToPodPresetTypeArrayOutputWithContext(context.Context) PodPresetTypeArrayOutput
}

type PodPresetTypeArray []PodPresetTypeInput

func (PodPresetTypeArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]PodPresetType)(nil)).Elem()
}

func (i PodPresetTypeArray) ToPodPresetTypeArrayOutput() PodPresetTypeArrayOutput {
	return i.ToPodPresetTypeArrayOutputWithContext(context.Background())
}

func (i PodPresetTypeArray) ToPodPresetTypeArrayOutputWithContext(ctx context.Context) PodPresetTypeArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PodPresetTypeArrayOutput)
}

// PodPreset is a policy resource that defines additional runtime requirements for a Pod.
type PodPresetTypeOutput struct{ *pulumi.OutputState }

func (PodPresetTypeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*PodPresetType)(nil)).Elem()
}

func (o PodPresetTypeOutput) ToPodPresetTypeOutput() PodPresetTypeOutput {
	return o
}

func (o PodPresetTypeOutput) ToPodPresetTypeOutputWithContext(ctx context.Context) PodPresetTypeOutput {
	return o
}

// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
func (o PodPresetTypeOutput) ApiVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v PodPresetType) *string { return v.ApiVersion }).(pulumi.StringPtrOutput)
}

// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
func (o PodPresetTypeOutput) Kind() pulumi.StringPtrOutput {
	return o.ApplyT(func(v PodPresetType) *string { return v.Kind }).(pulumi.StringPtrOutput)
}

func (o PodPresetTypeOutput) Metadata() metav1.ObjectMetaPtrOutput {
	return o.ApplyT(func(v PodPresetType) *metav1.ObjectMeta { return v.Metadata }).(metav1.ObjectMetaPtrOutput)
}

func (o PodPresetTypeOutput) Spec() PodPresetSpecPtrOutput {
	return o.ApplyT(func(v PodPresetType) *PodPresetSpec { return v.Spec }).(PodPresetSpecPtrOutput)
}

type PodPresetTypeArrayOutput struct{ *pulumi.OutputState }

func (PodPresetTypeArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]PodPresetType)(nil)).Elem()
}

func (o PodPresetTypeArrayOutput) ToPodPresetTypeArrayOutput() PodPresetTypeArrayOutput {
	return o
}

func (o PodPresetTypeArrayOutput) ToPodPresetTypeArrayOutputWithContext(ctx context.Context) PodPresetTypeArrayOutput {
	return o
}

func (o PodPresetTypeArrayOutput) Index(i pulumi.IntInput) PodPresetTypeOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) PodPresetType {
		return vs[0].([]PodPresetType)[vs[1].(int)]
	}).(PodPresetTypeOutput)
}

// PodPresetList is a list of PodPreset objects.
type PodPresetListType struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion *string `pulumi:"apiVersion"`
	// Items is a list of schema objects.
	Items []PodPresetType `pulumi:"items"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind *string `pulumi:"kind"`
	// Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *metav1.ListMeta `pulumi:"metadata"`
}

// PodPresetListTypeInput is an input type that accepts PodPresetListTypeArgs and PodPresetListTypeOutput values.
// You can construct a concrete instance of `PodPresetListTypeInput` via:
//
//	PodPresetListTypeArgs{...}
type PodPresetListTypeInput interface {
	pulumi.Input

	ToPodPresetListTypeOutput() PodPresetListTypeOutput
	ToPodPresetListTypeOutputWithContext(context.Context) PodPresetListTypeOutput
}

// PodPresetList is a list of PodPreset objects.
type PodPresetListTypeArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrInput `pulumi:"apiVersion"`
	// Items is a list of schema objects.
	Items PodPresetTypeArrayInput `pulumi:"items"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrInput `pulumi:"kind"`
	// Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata metav1.ListMetaPtrInput `pulumi:"metadata"`
}

func (PodPresetListTypeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*PodPresetListType)(nil)).Elem()
}

func (i PodPresetListTypeArgs) ToPodPresetListTypeOutput() PodPresetListTypeOutput {
	return i.ToPodPresetListTypeOutputWithContext(context.Background())
}

func (i PodPresetListTypeArgs) ToPodPresetListTypeOutputWithContext(ctx context.Context) PodPresetListTypeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PodPresetListTypeOutput)
}

// PodPresetList is a list of PodPreset objects.
type PodPresetListTypeOutput struct{ *pulumi.OutputState }

func (PodPresetListTypeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*PodPresetListType)(nil)).Elem()
}

func (o PodPresetListTypeOutput) ToPodPresetListTypeOutput() PodPresetListTypeOutput {
	return o
}

func (o PodPresetListTypeOutput) ToPodPresetListTypeOutputWithContext(ctx context.Context) PodPresetListTypeOutput {
	return o
}

// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
func (o PodPresetListTypeOutput) ApiVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v PodPresetListType) *string { return v.ApiVersion }).(pulumi.StringPtrOutput)
}

// Items is a list of schema objects.
func (o PodPresetListTypeOutput) Items() PodPresetTypeArrayOutput {
	return o.ApplyT(func(v PodPresetListType) []PodPresetType { return v.Items }).(PodPresetTypeArrayOutput)
}

// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
func (o PodPresetListTypeOutput) Kind() pulumi.StringPtrOutput {
	return o.ApplyT(func(v PodPresetListType) *string { return v.Kind }).(pulumi.StringPtrOutput)
}

// Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
func (o PodPresetListTypeOutput) Metadata() metav1.ListMetaPtrOutput {
	return o.ApplyT(func(v PodPresetListType) *metav1.ListMeta { return v.Metadata }).(metav1.ListMetaPtrOutput)
}

// PodPreset is a policy resource that defines additional runtime requirements for a Pod.
type PodPresetPatchType struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion *string `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind     *string                 `pulumi:"kind"`
	Metadata *metav1.ObjectMetaPatch `pulumi:"metadata"`
	Spec     *PodPresetSpecPatch     `pulumi:"spec"`
}

// PodPresetPatchTypeInput is an input type that accepts PodPresetPatchTypeArgs and PodPresetPatchTypeOutput values.
// You can construct a concrete instance of `PodPresetPatchTypeInput` via:
//
//	PodPresetPatchTypeArgs{...}
type PodPresetPatchTypeInput interface {
	pulumi.Input

	ToPodPresetPatchTypeOutput() PodPresetPatchTypeOutput
	ToPodPresetPatchTypeOutputWithContext(context.Context) PodPresetPatchTypeOutput
}

// PodPreset is a policy resource that defines additional runtime requirements for a Pod.
type PodPresetPatchTypeArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrInput `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind     pulumi.StringPtrInput          `pulumi:"kind"`
	Metadata metav1.ObjectMetaPatchPtrInput `pulumi:"metadata"`
	Spec     PodPresetSpecPatchPtrInput     `pulumi:"spec"`
}

func (PodPresetPatchTypeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*PodPresetPatchType)(nil)).Elem()
}

func (i PodPresetPatchTypeArgs) ToPodPresetPatchTypeOutput() PodPresetPatchTypeOutput {
	return i.ToPodPresetPatchTypeOutputWithContext(context.Background())
}

func (i PodPresetPatchTypeArgs) ToPodPresetPatchTypeOutputWithContext(ctx context.Context) PodPresetPatchTypeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PodPresetPatchTypeOutput)
}

// PodPreset is a policy resource that defines additional runtime requirements for a Pod.
type PodPresetPatchTypeOutput struct{ *pulumi.OutputState }

func (PodPresetPatchTypeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*PodPresetPatchType)(nil)).Elem()
}

func (o PodPresetPatchTypeOutput) ToPodPresetPatchTypeOutput() PodPresetPatchTypeOutput {
	return o
}

func (o PodPresetPatchTypeOutput) ToPodPresetPatchTypeOutputWithContext(ctx context.Context) PodPresetPatchTypeOutput {
	return o
}

// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
func (o PodPresetPatchTypeOutput) ApiVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v PodPresetPatchType) *string { return v.ApiVersion }).(pulumi.StringPtrOutput)
}

// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
func (o PodPresetPatchTypeOutput) Kind() pulumi.StringPtrOutput {
	return o.ApplyT(func(v PodPresetPatchType) *string { return v.Kind }).(pulumi.StringPtrOutput)
}

func (o PodPresetPatchTypeOutput) Metadata() metav1.ObjectMetaPatchPtrOutput {
	return o.ApplyT(func(v PodPresetPatchType) *metav1.ObjectMetaPatch { return v.Metadata }).(metav1.ObjectMetaPatchPtrOutput)
}

func (o PodPresetPatchTypeOutput) Spec() PodPresetSpecPatchPtrOutput {
	return o.ApplyT(func(v PodPresetPatchType) *PodPresetSpecPatch { return v.Spec }).(PodPresetSpecPatchPtrOutput)
}

// PodPresetSpec is a description of a pod preset.
type PodPresetSpec struct {
	// Env defines the collection of EnvVar to inject into containers.
	Env []corev1.EnvVar `pulumi:"env"`
	// EnvFrom defines the collection of EnvFromSource to inject into containers.
	EnvFrom []corev1.EnvFromSource `pulumi:"envFrom"`
	// Selector is a label query over a set of resources, in this case pods. Required.
	Selector *metav1.LabelSelector `pulumi:"selector"`
	// VolumeMounts defines the collection of VolumeMount to inject into containers.
	VolumeMounts []corev1.VolumeMount `pulumi:"volumeMounts"`
	// Volumes defines the collection of Volume to inject into the pod.
	Volumes []corev1.Volume `pulumi:"volumes"`
}

// PodPresetSpecInput is an input type that accepts PodPresetSpecArgs and PodPresetSpecOutput values.
// You can construct a concrete instance of `PodPresetSpecInput` via:
//
//	PodPresetSpecArgs{...}
type PodPresetSpecInput interface {
	pulumi.Input

	ToPodPresetSpecOutput() PodPresetSpecOutput
	ToPodPresetSpecOutputWithContext(context.Context) PodPresetSpecOutput
}

// PodPresetSpec is a description of a pod preset.
type PodPresetSpecArgs struct {
	// Env defines the collection of EnvVar to inject into containers.
	Env corev1.EnvVarArrayInput `pulumi:"env"`
	// EnvFrom defines the collection of EnvFromSource to inject into containers.
	EnvFrom corev1.EnvFromSourceArrayInput `pulumi:"envFrom"`
	// Selector is a label query over a set of resources, in this case pods. Required.
	Selector metav1.LabelSelectorPtrInput `pulumi:"selector"`
	// VolumeMounts defines the collection of VolumeMount to inject into containers.
	VolumeMounts corev1.VolumeMountArrayInput `pulumi:"volumeMounts"`
	// Volumes defines the collection of Volume to inject into the pod.
	Volumes corev1.VolumeArrayInput `pulumi:"volumes"`
}

func (PodPresetSpecArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*PodPresetSpec)(nil)).Elem()
}

func (i PodPresetSpecArgs) ToPodPresetSpecOutput() PodPresetSpecOutput {
	return i.ToPodPresetSpecOutputWithContext(context.Background())
}

func (i PodPresetSpecArgs) ToPodPresetSpecOutputWithContext(ctx context.Context) PodPresetSpecOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PodPresetSpecOutput)
}

func (i PodPresetSpecArgs) ToPodPresetSpecPtrOutput() PodPresetSpecPtrOutput {
	return i.ToPodPresetSpecPtrOutputWithContext(context.Background())
}

func (i PodPresetSpecArgs) ToPodPresetSpecPtrOutputWithContext(ctx context.Context) PodPresetSpecPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PodPresetSpecOutput).ToPodPresetSpecPtrOutputWithContext(ctx)
}

// PodPresetSpecPtrInput is an input type that accepts PodPresetSpecArgs, PodPresetSpecPtr and PodPresetSpecPtrOutput values.
// You can construct a concrete instance of `PodPresetSpecPtrInput` via:
//
//	        PodPresetSpecArgs{...}
//
//	or:
//
//	        nil
type PodPresetSpecPtrInput interface {
	pulumi.Input

	ToPodPresetSpecPtrOutput() PodPresetSpecPtrOutput
	ToPodPresetSpecPtrOutputWithContext(context.Context) PodPresetSpecPtrOutput
}

type podPresetSpecPtrType PodPresetSpecArgs

func PodPresetSpecPtr(v *PodPresetSpecArgs) PodPresetSpecPtrInput {
	return (*podPresetSpecPtrType)(v)
}

func (*podPresetSpecPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**PodPresetSpec)(nil)).Elem()
}

func (i *podPresetSpecPtrType) ToPodPresetSpecPtrOutput() PodPresetSpecPtrOutput {
	return i.ToPodPresetSpecPtrOutputWithContext(context.Background())
}

func (i *podPresetSpecPtrType) ToPodPresetSpecPtrOutputWithContext(ctx context.Context) PodPresetSpecPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PodPresetSpecPtrOutput)
}

// PodPresetSpec is a description of a pod preset.
type PodPresetSpecOutput struct{ *pulumi.OutputState }

func (PodPresetSpecOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*PodPresetSpec)(nil)).Elem()
}

func (o PodPresetSpecOutput) ToPodPresetSpecOutput() PodPresetSpecOutput {
	return o
}

func (o PodPresetSpecOutput) ToPodPresetSpecOutputWithContext(ctx context.Context) PodPresetSpecOutput {
	return o
}

func (o PodPresetSpecOutput) ToPodPresetSpecPtrOutput() PodPresetSpecPtrOutput {
	return o.ToPodPresetSpecPtrOutputWithContext(context.Background())
}

func (o PodPresetSpecOutput) ToPodPresetSpecPtrOutputWithContext(ctx context.Context) PodPresetSpecPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v PodPresetSpec) *PodPresetSpec {
		return &v
	}).(PodPresetSpecPtrOutput)
}

// Env defines the collection of EnvVar to inject into containers.
func (o PodPresetSpecOutput) Env() corev1.EnvVarArrayOutput {
	return o.ApplyT(func(v PodPresetSpec) []corev1.EnvVar { return v.Env }).(corev1.EnvVarArrayOutput)
}

// EnvFrom defines the collection of EnvFromSource to inject into containers.
func (o PodPresetSpecOutput) EnvFrom() corev1.EnvFromSourceArrayOutput {
	return o.ApplyT(func(v PodPresetSpec) []corev1.EnvFromSource { return v.EnvFrom }).(corev1.EnvFromSourceArrayOutput)
}

// Selector is a label query over a set of resources, in this case pods. Required.
func (o PodPresetSpecOutput) Selector() metav1.LabelSelectorPtrOutput {
	return o.ApplyT(func(v PodPresetSpec) *metav1.LabelSelector { return v.Selector }).(metav1.LabelSelectorPtrOutput)
}

// VolumeMounts defines the collection of VolumeMount to inject into containers.
func (o PodPresetSpecOutput) VolumeMounts() corev1.VolumeMountArrayOutput {
	return o.ApplyT(func(v PodPresetSpec) []corev1.VolumeMount { return v.VolumeMounts }).(corev1.VolumeMountArrayOutput)
}

// Volumes defines the collection of Volume to inject into the pod.
func (o PodPresetSpecOutput) Volumes() corev1.VolumeArrayOutput {
	return o.ApplyT(func(v PodPresetSpec) []corev1.Volume { return v.Volumes }).(corev1.VolumeArrayOutput)
}

type PodPresetSpecPtrOutput struct{ *pulumi.OutputState }

func (PodPresetSpecPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PodPresetSpec)(nil)).Elem()
}

func (o PodPresetSpecPtrOutput) ToPodPresetSpecPtrOutput() PodPresetSpecPtrOutput {
	return o
}

func (o PodPresetSpecPtrOutput) ToPodPresetSpecPtrOutputWithContext(ctx context.Context) PodPresetSpecPtrOutput {
	return o
}

func (o PodPresetSpecPtrOutput) Elem() PodPresetSpecOutput {
	return o.ApplyT(func(v *PodPresetSpec) PodPresetSpec {
		if v != nil {
			return *v
		}
		var ret PodPresetSpec
		return ret
	}).(PodPresetSpecOutput)
}

// Env defines the collection of EnvVar to inject into containers.
func (o PodPresetSpecPtrOutput) Env() corev1.EnvVarArrayOutput {
	return o.ApplyT(func(v *PodPresetSpec) []corev1.EnvVar {
		if v == nil {
			return nil
		}
		return v.Env
	}).(corev1.EnvVarArrayOutput)
}

// EnvFrom defines the collection of EnvFromSource to inject into containers.
func (o PodPresetSpecPtrOutput) EnvFrom() corev1.EnvFromSourceArrayOutput {
	return o.ApplyT(func(v *PodPresetSpec) []corev1.EnvFromSource {
		if v == nil {
			return nil
		}
		return v.EnvFrom
	}).(corev1.EnvFromSourceArrayOutput)
}

// Selector is a label query over a set of resources, in this case pods. Required.
func (o PodPresetSpecPtrOutput) Selector() metav1.LabelSelectorPtrOutput {
	return o.ApplyT(func(v *PodPresetSpec) *metav1.LabelSelector {
		if v == nil {
			return nil
		}
		return v.Selector
	}).(metav1.LabelSelectorPtrOutput)
}

// VolumeMounts defines the collection of VolumeMount to inject into containers.
func (o PodPresetSpecPtrOutput) VolumeMounts() corev1.VolumeMountArrayOutput {
	return o.ApplyT(func(v *PodPresetSpec) []corev1.VolumeMount {
		if v == nil {
			return nil
		}
		return v.VolumeMounts
	}).(corev1.VolumeMountArrayOutput)
}

// Volumes defines the collection of Volume to inject into the pod.
func (o PodPresetSpecPtrOutput) Volumes() corev1.VolumeArrayOutput {
	return o.ApplyT(func(v *PodPresetSpec) []corev1.Volume {
		if v == nil {
			return nil
		}
		return v.Volumes
	}).(corev1.VolumeArrayOutput)
}

// PodPresetSpec is a description of a pod preset.
type PodPresetSpecPatch struct {
	// Env defines the collection of EnvVar to inject into containers.
	Env []corev1.EnvVarPatch `pulumi:"env"`
	// EnvFrom defines the collection of EnvFromSource to inject into containers.
	EnvFrom []corev1.EnvFromSourcePatch `pulumi:"envFrom"`
	// Selector is a label query over a set of resources, in this case pods. Required.
	Selector *metav1.LabelSelectorPatch `pulumi:"selector"`
	// VolumeMounts defines the collection of VolumeMount to inject into containers.
	VolumeMounts []corev1.VolumeMountPatch `pulumi:"volumeMounts"`
	// Volumes defines the collection of Volume to inject into the pod.
	Volumes []corev1.VolumePatch `pulumi:"volumes"`
}

// PodPresetSpecPatchInput is an input type that accepts PodPresetSpecPatchArgs and PodPresetSpecPatchOutput values.
// You can construct a concrete instance of `PodPresetSpecPatchInput` via:
//
//	PodPresetSpecPatchArgs{...}
type PodPresetSpecPatchInput interface {
	pulumi.Input

	ToPodPresetSpecPatchOutput() PodPresetSpecPatchOutput
	ToPodPresetSpecPatchOutputWithContext(context.Context) PodPresetSpecPatchOutput
}

// PodPresetSpec is a description of a pod preset.
type PodPresetSpecPatchArgs struct {
	// Env defines the collection of EnvVar to inject into containers.
	Env corev1.EnvVarPatchArrayInput `pulumi:"env"`
	// EnvFrom defines the collection of EnvFromSource to inject into containers.
	EnvFrom corev1.EnvFromSourcePatchArrayInput `pulumi:"envFrom"`
	// Selector is a label query over a set of resources, in this case pods. Required.
	Selector metav1.LabelSelectorPatchPtrInput `pulumi:"selector"`
	// VolumeMounts defines the collection of VolumeMount to inject into containers.
	VolumeMounts corev1.VolumeMountPatchArrayInput `pulumi:"volumeMounts"`
	// Volumes defines the collection of Volume to inject into the pod.
	Volumes corev1.VolumePatchArrayInput `pulumi:"volumes"`
}

func (PodPresetSpecPatchArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*PodPresetSpecPatch)(nil)).Elem()
}

func (i PodPresetSpecPatchArgs) ToPodPresetSpecPatchOutput() PodPresetSpecPatchOutput {
	return i.ToPodPresetSpecPatchOutputWithContext(context.Background())
}

func (i PodPresetSpecPatchArgs) ToPodPresetSpecPatchOutputWithContext(ctx context.Context) PodPresetSpecPatchOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PodPresetSpecPatchOutput)
}

func (i PodPresetSpecPatchArgs) ToPodPresetSpecPatchPtrOutput() PodPresetSpecPatchPtrOutput {
	return i.ToPodPresetSpecPatchPtrOutputWithContext(context.Background())
}

func (i PodPresetSpecPatchArgs) ToPodPresetSpecPatchPtrOutputWithContext(ctx context.Context) PodPresetSpecPatchPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PodPresetSpecPatchOutput).ToPodPresetSpecPatchPtrOutputWithContext(ctx)
}

// PodPresetSpecPatchPtrInput is an input type that accepts PodPresetSpecPatchArgs, PodPresetSpecPatchPtr and PodPresetSpecPatchPtrOutput values.
// You can construct a concrete instance of `PodPresetSpecPatchPtrInput` via:
//
//	        PodPresetSpecPatchArgs{...}
//
//	or:
//
//	        nil
type PodPresetSpecPatchPtrInput interface {
	pulumi.Input

	ToPodPresetSpecPatchPtrOutput() PodPresetSpecPatchPtrOutput
	ToPodPresetSpecPatchPtrOutputWithContext(context.Context) PodPresetSpecPatchPtrOutput
}

type podPresetSpecPatchPtrType PodPresetSpecPatchArgs

func PodPresetSpecPatchPtr(v *PodPresetSpecPatchArgs) PodPresetSpecPatchPtrInput {
	return (*podPresetSpecPatchPtrType)(v)
}

func (*podPresetSpecPatchPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**PodPresetSpecPatch)(nil)).Elem()
}

func (i *podPresetSpecPatchPtrType) ToPodPresetSpecPatchPtrOutput() PodPresetSpecPatchPtrOutput {
	return i.ToPodPresetSpecPatchPtrOutputWithContext(context.Background())
}

func (i *podPresetSpecPatchPtrType) ToPodPresetSpecPatchPtrOutputWithContext(ctx context.Context) PodPresetSpecPatchPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PodPresetSpecPatchPtrOutput)
}

// PodPresetSpec is a description of a pod preset.
type PodPresetSpecPatchOutput struct{ *pulumi.OutputState }

func (PodPresetSpecPatchOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*PodPresetSpecPatch)(nil)).Elem()
}

func (o PodPresetSpecPatchOutput) ToPodPresetSpecPatchOutput() PodPresetSpecPatchOutput {
	return o
}

func (o PodPresetSpecPatchOutput) ToPodPresetSpecPatchOutputWithContext(ctx context.Context) PodPresetSpecPatchOutput {
	return o
}

func (o PodPresetSpecPatchOutput) ToPodPresetSpecPatchPtrOutput() PodPresetSpecPatchPtrOutput {
	return o.ToPodPresetSpecPatchPtrOutputWithContext(context.Background())
}

func (o PodPresetSpecPatchOutput) ToPodPresetSpecPatchPtrOutputWithContext(ctx context.Context) PodPresetSpecPatchPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v PodPresetSpecPatch) *PodPresetSpecPatch {
		return &v
	}).(PodPresetSpecPatchPtrOutput)
}

// Env defines the collection of EnvVar to inject into containers.
func (o PodPresetSpecPatchOutput) Env() corev1.EnvVarPatchArrayOutput {
	return o.ApplyT(func(v PodPresetSpecPatch) []corev1.EnvVarPatch { return v.Env }).(corev1.EnvVarPatchArrayOutput)
}

// EnvFrom defines the collection of EnvFromSource to inject into containers.
func (o PodPresetSpecPatchOutput) EnvFrom() corev1.EnvFromSourcePatchArrayOutput {
	return o.ApplyT(func(v PodPresetSpecPatch) []corev1.EnvFromSourcePatch { return v.EnvFrom }).(corev1.EnvFromSourcePatchArrayOutput)
}

// Selector is a label query over a set of resources, in this case pods. Required.
func (o PodPresetSpecPatchOutput) Selector() metav1.LabelSelectorPatchPtrOutput {
	return o.ApplyT(func(v PodPresetSpecPatch) *metav1.LabelSelectorPatch { return v.Selector }).(metav1.LabelSelectorPatchPtrOutput)
}

// VolumeMounts defines the collection of VolumeMount to inject into containers.
func (o PodPresetSpecPatchOutput) VolumeMounts() corev1.VolumeMountPatchArrayOutput {
	return o.ApplyT(func(v PodPresetSpecPatch) []corev1.VolumeMountPatch { return v.VolumeMounts }).(corev1.VolumeMountPatchArrayOutput)
}

// Volumes defines the collection of Volume to inject into the pod.
func (o PodPresetSpecPatchOutput) Volumes() corev1.VolumePatchArrayOutput {
	return o.ApplyT(func(v PodPresetSpecPatch) []corev1.VolumePatch { return v.Volumes }).(corev1.VolumePatchArrayOutput)
}

type PodPresetSpecPatchPtrOutput struct{ *pulumi.OutputState }

func (PodPresetSpecPatchPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PodPresetSpecPatch)(nil)).Elem()
}

func (o PodPresetSpecPatchPtrOutput) ToPodPresetSpecPatchPtrOutput() PodPresetSpecPatchPtrOutput {
	return o
}

func (o PodPresetSpecPatchPtrOutput) ToPodPresetSpecPatchPtrOutputWithContext(ctx context.Context) PodPresetSpecPatchPtrOutput {
	return o
}

func (o PodPresetSpecPatchPtrOutput) Elem() PodPresetSpecPatchOutput {
	return o.ApplyT(func(v *PodPresetSpecPatch) PodPresetSpecPatch {
		if v != nil {
			return *v
		}
		var ret PodPresetSpecPatch
		return ret
	}).(PodPresetSpecPatchOutput)
}

// Env defines the collection of EnvVar to inject into containers.
func (o PodPresetSpecPatchPtrOutput) Env() corev1.EnvVarPatchArrayOutput {
	return o.ApplyT(func(v *PodPresetSpecPatch) []corev1.EnvVarPatch {
		if v == nil {
			return nil
		}
		return v.Env
	}).(corev1.EnvVarPatchArrayOutput)
}

// EnvFrom defines the collection of EnvFromSource to inject into containers.
func (o PodPresetSpecPatchPtrOutput) EnvFrom() corev1.EnvFromSourcePatchArrayOutput {
	return o.ApplyT(func(v *PodPresetSpecPatch) []corev1.EnvFromSourcePatch {
		if v == nil {
			return nil
		}
		return v.EnvFrom
	}).(corev1.EnvFromSourcePatchArrayOutput)
}

// Selector is a label query over a set of resources, in this case pods. Required.
func (o PodPresetSpecPatchPtrOutput) Selector() metav1.LabelSelectorPatchPtrOutput {
	return o.ApplyT(func(v *PodPresetSpecPatch) *metav1.LabelSelectorPatch {
		if v == nil {
			return nil
		}
		return v.Selector
	}).(metav1.LabelSelectorPatchPtrOutput)
}

// VolumeMounts defines the collection of VolumeMount to inject into containers.
func (o PodPresetSpecPatchPtrOutput) VolumeMounts() corev1.VolumeMountPatchArrayOutput {
	return o.ApplyT(func(v *PodPresetSpecPatch) []corev1.VolumeMountPatch {
		if v == nil {
			return nil
		}
		return v.VolumeMounts
	}).(corev1.VolumeMountPatchArrayOutput)
}

// Volumes defines the collection of Volume to inject into the pod.
func (o PodPresetSpecPatchPtrOutput) Volumes() corev1.VolumePatchArrayOutput {
	return o.ApplyT(func(v *PodPresetSpecPatch) []corev1.VolumePatch {
		if v == nil {
			return nil
		}
		return v.Volumes
	}).(corev1.VolumePatchArrayOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PodPresetTypeInput)(nil)).Elem(), PodPresetTypeArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*PodPresetTypeArrayInput)(nil)).Elem(), PodPresetTypeArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PodPresetListTypeInput)(nil)).Elem(), PodPresetListTypeArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*PodPresetPatchTypeInput)(nil)).Elem(), PodPresetPatchTypeArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*PodPresetSpecInput)(nil)).Elem(), PodPresetSpecArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*PodPresetSpecPtrInput)(nil)).Elem(), PodPresetSpecArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*PodPresetSpecPatchInput)(nil)).Elem(), PodPresetSpecPatchArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*PodPresetSpecPatchPtrInput)(nil)).Elem(), PodPresetSpecPatchArgs{})
	pulumi.RegisterOutputType(PodPresetTypeOutput{})
	pulumi.RegisterOutputType(PodPresetTypeArrayOutput{})
	pulumi.RegisterOutputType(PodPresetListTypeOutput{})
	pulumi.RegisterOutputType(PodPresetPatchTypeOutput{})
	pulumi.RegisterOutputType(PodPresetSpecOutput{})
	pulumi.RegisterOutputType(PodPresetSpecPtrOutput{})
	pulumi.RegisterOutputType(PodPresetSpecPatchOutput{})
	pulumi.RegisterOutputType(PodPresetSpecPatchPtrOutput{})
}
