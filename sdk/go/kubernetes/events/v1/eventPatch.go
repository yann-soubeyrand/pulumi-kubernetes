// Code generated by pulumigen DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package v1

import (
	"context"
	"reflect"

	corev1 "github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes/core/v1"
	metav1 "github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes/meta/v1"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Patch resources are used to modify existing Kubernetes resources by using
// Server-Side Apply updates. The name of the resource must be specified, but all other properties are optional. More than
// one patch may be applied to the same resource, and a random FieldManager name will be used for each Patch resource.
// Conflicts will result in an error by default, but can be forced using the "pulumi.com/patchForce" annotation. See the
// [Server-Side Apply Docs](https://www.pulumi.com/registry/packages/kubernetes/installation-configuration/#server-side-apply) for
// additional information about using Server-Side Apply to manage Kubernetes resources with Pulumi.
// Event is a report of an event somewhere in the cluster. It generally denotes some state change in the system. Events have a limited retention time and triggers and messages may evolve with time.  Event consumers should not rely on the timing of an event with a given Reason reflecting a consistent underlying trigger, or the continued existence of events with that Reason.  Events should be treated as informative, best-effort, supplemental data.
type EventPatch struct {
	pulumi.CustomResourceState

	// action is what action was taken/failed regarding to the regarding object. It is machine-readable. This field cannot be empty for new Events and it can have at most 128 characters.
	Action pulumi.StringPtrOutput `pulumi:"action"`
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrOutput `pulumi:"apiVersion"`
	// deprecatedCount is the deprecated field assuring backward compatibility with core.v1 Event type.
	DeprecatedCount pulumi.IntPtrOutput `pulumi:"deprecatedCount"`
	// deprecatedFirstTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.
	DeprecatedFirstTimestamp pulumi.StringPtrOutput `pulumi:"deprecatedFirstTimestamp"`
	// deprecatedLastTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.
	DeprecatedLastTimestamp pulumi.StringPtrOutput `pulumi:"deprecatedLastTimestamp"`
	// deprecatedSource is the deprecated field assuring backward compatibility with core.v1 Event type.
	DeprecatedSource corev1.EventSourcePatchPtrOutput `pulumi:"deprecatedSource"`
	// eventTime is the time when this Event was first observed. It is required.
	EventTime pulumi.StringPtrOutput `pulumi:"eventTime"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrOutput `pulumi:"kind"`
	// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata metav1.ObjectMetaPatchPtrOutput `pulumi:"metadata"`
	// note is a human-readable description of the status of this operation. Maximal length of the note is 1kB, but libraries should be prepared to handle values up to 64kB.
	Note pulumi.StringPtrOutput `pulumi:"note"`
	// reason is why the action was taken. It is human-readable. This field cannot be empty for new Events and it can have at most 128 characters.
	Reason pulumi.StringPtrOutput `pulumi:"reason"`
	// regarding contains the object this Event is about. In most cases it's an Object reporting controller implements, e.g. ReplicaSetController implements ReplicaSets and this event is emitted because it acts on some changes in a ReplicaSet object.
	Regarding corev1.ObjectReferencePatchPtrOutput `pulumi:"regarding"`
	// related is the optional secondary object for more complex actions. E.g. when regarding object triggers a creation or deletion of related object.
	Related corev1.ObjectReferencePatchPtrOutput `pulumi:"related"`
	// reportingController is the name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`. This field cannot be empty for new Events.
	ReportingController pulumi.StringPtrOutput `pulumi:"reportingController"`
	// reportingInstance is the ID of the controller instance, e.g. `kubelet-xyzf`. This field cannot be empty for new Events and it can have at most 128 characters.
	ReportingInstance pulumi.StringPtrOutput `pulumi:"reportingInstance"`
	// series is data about the Event series this event represents or nil if it's a singleton Event.
	Series EventSeriesPatchPtrOutput `pulumi:"series"`
	// type is the type of this event (Normal, Warning), new types could be added in the future. It is machine-readable. This field cannot be empty for new Events.
	Type pulumi.StringPtrOutput `pulumi:"type"`
}

// NewEventPatch registers a new resource with the given unique name, arguments, and options.
func NewEventPatch(ctx *pulumi.Context,
	name string, args *EventPatchArgs, opts ...pulumi.ResourceOption) (*EventPatch, error) {
	if args == nil {
		args = &EventPatchArgs{}
	}

	args.ApiVersion = pulumi.StringPtr("events.k8s.io/v1")
	args.Kind = pulumi.StringPtr("Event")
	aliases := pulumi.Aliases([]pulumi.Alias{
		{
			Type: pulumi.String("kubernetes:core/v1:EventPatch"),
		},
		{
			Type: pulumi.String("kubernetes:events.k8s.io/v1beta1:EventPatch"),
		},
	})
	opts = append(opts, aliases)
	var resource EventPatch
	err := ctx.RegisterResource("kubernetes:events.k8s.io/v1:EventPatch", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEventPatch gets an existing EventPatch resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEventPatch(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EventPatchState, opts ...pulumi.ResourceOption) (*EventPatch, error) {
	var resource EventPatch
	err := ctx.ReadResource("kubernetes:events.k8s.io/v1:EventPatch", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EventPatch resources.
type eventPatchState struct {
}

type EventPatchState struct {
}

func (EventPatchState) ElementType() reflect.Type {
	return reflect.TypeOf((*eventPatchState)(nil)).Elem()
}

type eventPatchArgs struct {
	// action is what action was taken/failed regarding to the regarding object. It is machine-readable. This field cannot be empty for new Events and it can have at most 128 characters.
	Action *string `pulumi:"action"`
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion *string `pulumi:"apiVersion"`
	// deprecatedCount is the deprecated field assuring backward compatibility with core.v1 Event type.
	DeprecatedCount *int `pulumi:"deprecatedCount"`
	// deprecatedFirstTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.
	DeprecatedFirstTimestamp *string `pulumi:"deprecatedFirstTimestamp"`
	// deprecatedLastTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.
	DeprecatedLastTimestamp *string `pulumi:"deprecatedLastTimestamp"`
	// deprecatedSource is the deprecated field assuring backward compatibility with core.v1 Event type.
	DeprecatedSource *corev1.EventSourcePatch `pulumi:"deprecatedSource"`
	// eventTime is the time when this Event was first observed. It is required.
	EventTime *string `pulumi:"eventTime"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind *string `pulumi:"kind"`
	// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *metav1.ObjectMetaPatch `pulumi:"metadata"`
	// note is a human-readable description of the status of this operation. Maximal length of the note is 1kB, but libraries should be prepared to handle values up to 64kB.
	Note *string `pulumi:"note"`
	// reason is why the action was taken. It is human-readable. This field cannot be empty for new Events and it can have at most 128 characters.
	Reason *string `pulumi:"reason"`
	// regarding contains the object this Event is about. In most cases it's an Object reporting controller implements, e.g. ReplicaSetController implements ReplicaSets and this event is emitted because it acts on some changes in a ReplicaSet object.
	Regarding *corev1.ObjectReferencePatch `pulumi:"regarding"`
	// related is the optional secondary object for more complex actions. E.g. when regarding object triggers a creation or deletion of related object.
	Related *corev1.ObjectReferencePatch `pulumi:"related"`
	// reportingController is the name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`. This field cannot be empty for new Events.
	ReportingController *string `pulumi:"reportingController"`
	// reportingInstance is the ID of the controller instance, e.g. `kubelet-xyzf`. This field cannot be empty for new Events and it can have at most 128 characters.
	ReportingInstance *string `pulumi:"reportingInstance"`
	// series is data about the Event series this event represents or nil if it's a singleton Event.
	Series *EventSeriesPatch `pulumi:"series"`
	// type is the type of this event (Normal, Warning), new types could be added in the future. It is machine-readable. This field cannot be empty for new Events.
	Type *string `pulumi:"type"`
}

// The set of arguments for constructing a EventPatch resource.
type EventPatchArgs struct {
	// action is what action was taken/failed regarding to the regarding object. It is machine-readable. This field cannot be empty for new Events and it can have at most 128 characters.
	Action pulumi.StringPtrInput
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrInput
	// deprecatedCount is the deprecated field assuring backward compatibility with core.v1 Event type.
	DeprecatedCount pulumi.IntPtrInput
	// deprecatedFirstTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.
	DeprecatedFirstTimestamp pulumi.StringPtrInput
	// deprecatedLastTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.
	DeprecatedLastTimestamp pulumi.StringPtrInput
	// deprecatedSource is the deprecated field assuring backward compatibility with core.v1 Event type.
	DeprecatedSource corev1.EventSourcePatchPtrInput
	// eventTime is the time when this Event was first observed. It is required.
	EventTime pulumi.StringPtrInput
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrInput
	// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata metav1.ObjectMetaPatchPtrInput
	// note is a human-readable description of the status of this operation. Maximal length of the note is 1kB, but libraries should be prepared to handle values up to 64kB.
	Note pulumi.StringPtrInput
	// reason is why the action was taken. It is human-readable. This field cannot be empty for new Events and it can have at most 128 characters.
	Reason pulumi.StringPtrInput
	// regarding contains the object this Event is about. In most cases it's an Object reporting controller implements, e.g. ReplicaSetController implements ReplicaSets and this event is emitted because it acts on some changes in a ReplicaSet object.
	Regarding corev1.ObjectReferencePatchPtrInput
	// related is the optional secondary object for more complex actions. E.g. when regarding object triggers a creation or deletion of related object.
	Related corev1.ObjectReferencePatchPtrInput
	// reportingController is the name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`. This field cannot be empty for new Events.
	ReportingController pulumi.StringPtrInput
	// reportingInstance is the ID of the controller instance, e.g. `kubelet-xyzf`. This field cannot be empty for new Events and it can have at most 128 characters.
	ReportingInstance pulumi.StringPtrInput
	// series is data about the Event series this event represents or nil if it's a singleton Event.
	Series EventSeriesPatchPtrInput
	// type is the type of this event (Normal, Warning), new types could be added in the future. It is machine-readable. This field cannot be empty for new Events.
	Type pulumi.StringPtrInput
}

func (EventPatchArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*eventPatchArgs)(nil)).Elem()
}

type EventPatchInput interface {
	pulumi.Input

	ToEventPatchOutput() EventPatchOutput
	ToEventPatchOutputWithContext(ctx context.Context) EventPatchOutput
}

func (*EventPatch) ElementType() reflect.Type {
	return reflect.TypeOf((**EventPatch)(nil)).Elem()
}

func (i *EventPatch) ToEventPatchOutput() EventPatchOutput {
	return i.ToEventPatchOutputWithContext(context.Background())
}

func (i *EventPatch) ToEventPatchOutputWithContext(ctx context.Context) EventPatchOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventPatchOutput)
}

// EventPatchArrayInput is an input type that accepts EventPatchArray and EventPatchArrayOutput values.
// You can construct a concrete instance of `EventPatchArrayInput` via:
//
//	EventPatchArray{ EventPatchArgs{...} }
type EventPatchArrayInput interface {
	pulumi.Input

	ToEventPatchArrayOutput() EventPatchArrayOutput
	ToEventPatchArrayOutputWithContext(context.Context) EventPatchArrayOutput
}

type EventPatchArray []EventPatchInput

func (EventPatchArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EventPatch)(nil)).Elem()
}

func (i EventPatchArray) ToEventPatchArrayOutput() EventPatchArrayOutput {
	return i.ToEventPatchArrayOutputWithContext(context.Background())
}

func (i EventPatchArray) ToEventPatchArrayOutputWithContext(ctx context.Context) EventPatchArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventPatchArrayOutput)
}

// EventPatchMapInput is an input type that accepts EventPatchMap and EventPatchMapOutput values.
// You can construct a concrete instance of `EventPatchMapInput` via:
//
//	EventPatchMap{ "key": EventPatchArgs{...} }
type EventPatchMapInput interface {
	pulumi.Input

	ToEventPatchMapOutput() EventPatchMapOutput
	ToEventPatchMapOutputWithContext(context.Context) EventPatchMapOutput
}

type EventPatchMap map[string]EventPatchInput

func (EventPatchMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EventPatch)(nil)).Elem()
}

func (i EventPatchMap) ToEventPatchMapOutput() EventPatchMapOutput {
	return i.ToEventPatchMapOutputWithContext(context.Background())
}

func (i EventPatchMap) ToEventPatchMapOutputWithContext(ctx context.Context) EventPatchMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventPatchMapOutput)
}

type EventPatchOutput struct{ *pulumi.OutputState }

func (EventPatchOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EventPatch)(nil)).Elem()
}

func (o EventPatchOutput) ToEventPatchOutput() EventPatchOutput {
	return o
}

func (o EventPatchOutput) ToEventPatchOutputWithContext(ctx context.Context) EventPatchOutput {
	return o
}

// action is what action was taken/failed regarding to the regarding object. It is machine-readable. This field cannot be empty for new Events and it can have at most 128 characters.
func (o EventPatchOutput) Action() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EventPatch) pulumi.StringPtrOutput { return v.Action }).(pulumi.StringPtrOutput)
}

// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
func (o EventPatchOutput) ApiVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EventPatch) pulumi.StringPtrOutput { return v.ApiVersion }).(pulumi.StringPtrOutput)
}

// deprecatedCount is the deprecated field assuring backward compatibility with core.v1 Event type.
func (o EventPatchOutput) DeprecatedCount() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *EventPatch) pulumi.IntPtrOutput { return v.DeprecatedCount }).(pulumi.IntPtrOutput)
}

// deprecatedFirstTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.
func (o EventPatchOutput) DeprecatedFirstTimestamp() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EventPatch) pulumi.StringPtrOutput { return v.DeprecatedFirstTimestamp }).(pulumi.StringPtrOutput)
}

// deprecatedLastTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.
func (o EventPatchOutput) DeprecatedLastTimestamp() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EventPatch) pulumi.StringPtrOutput { return v.DeprecatedLastTimestamp }).(pulumi.StringPtrOutput)
}

// deprecatedSource is the deprecated field assuring backward compatibility with core.v1 Event type.
func (o EventPatchOutput) DeprecatedSource() corev1.EventSourcePatchPtrOutput {
	return o.ApplyT(func(v *EventPatch) corev1.EventSourcePatchPtrOutput { return v.DeprecatedSource }).(corev1.EventSourcePatchPtrOutput)
}

// eventTime is the time when this Event was first observed. It is required.
func (o EventPatchOutput) EventTime() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EventPatch) pulumi.StringPtrOutput { return v.EventTime }).(pulumi.StringPtrOutput)
}

// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
func (o EventPatchOutput) Kind() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EventPatch) pulumi.StringPtrOutput { return v.Kind }).(pulumi.StringPtrOutput)
}

// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
func (o EventPatchOutput) Metadata() metav1.ObjectMetaPatchPtrOutput {
	return o.ApplyT(func(v *EventPatch) metav1.ObjectMetaPatchPtrOutput { return v.Metadata }).(metav1.ObjectMetaPatchPtrOutput)
}

// note is a human-readable description of the status of this operation. Maximal length of the note is 1kB, but libraries should be prepared to handle values up to 64kB.
func (o EventPatchOutput) Note() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EventPatch) pulumi.StringPtrOutput { return v.Note }).(pulumi.StringPtrOutput)
}

// reason is why the action was taken. It is human-readable. This field cannot be empty for new Events and it can have at most 128 characters.
func (o EventPatchOutput) Reason() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EventPatch) pulumi.StringPtrOutput { return v.Reason }).(pulumi.StringPtrOutput)
}

// regarding contains the object this Event is about. In most cases it's an Object reporting controller implements, e.g. ReplicaSetController implements ReplicaSets and this event is emitted because it acts on some changes in a ReplicaSet object.
func (o EventPatchOutput) Regarding() corev1.ObjectReferencePatchPtrOutput {
	return o.ApplyT(func(v *EventPatch) corev1.ObjectReferencePatchPtrOutput { return v.Regarding }).(corev1.ObjectReferencePatchPtrOutput)
}

// related is the optional secondary object for more complex actions. E.g. when regarding object triggers a creation or deletion of related object.
func (o EventPatchOutput) Related() corev1.ObjectReferencePatchPtrOutput {
	return o.ApplyT(func(v *EventPatch) corev1.ObjectReferencePatchPtrOutput { return v.Related }).(corev1.ObjectReferencePatchPtrOutput)
}

// reportingController is the name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`. This field cannot be empty for new Events.
func (o EventPatchOutput) ReportingController() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EventPatch) pulumi.StringPtrOutput { return v.ReportingController }).(pulumi.StringPtrOutput)
}

// reportingInstance is the ID of the controller instance, e.g. `kubelet-xyzf`. This field cannot be empty for new Events and it can have at most 128 characters.
func (o EventPatchOutput) ReportingInstance() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EventPatch) pulumi.StringPtrOutput { return v.ReportingInstance }).(pulumi.StringPtrOutput)
}

// series is data about the Event series this event represents or nil if it's a singleton Event.
func (o EventPatchOutput) Series() EventSeriesPatchPtrOutput {
	return o.ApplyT(func(v *EventPatch) EventSeriesPatchPtrOutput { return v.Series }).(EventSeriesPatchPtrOutput)
}

// type is the type of this event (Normal, Warning), new types could be added in the future. It is machine-readable. This field cannot be empty for new Events.
func (o EventPatchOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EventPatch) pulumi.StringPtrOutput { return v.Type }).(pulumi.StringPtrOutput)
}

type EventPatchArrayOutput struct{ *pulumi.OutputState }

func (EventPatchArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EventPatch)(nil)).Elem()
}

func (o EventPatchArrayOutput) ToEventPatchArrayOutput() EventPatchArrayOutput {
	return o
}

func (o EventPatchArrayOutput) ToEventPatchArrayOutputWithContext(ctx context.Context) EventPatchArrayOutput {
	return o
}

func (o EventPatchArrayOutput) Index(i pulumi.IntInput) EventPatchOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EventPatch {
		return vs[0].([]*EventPatch)[vs[1].(int)]
	}).(EventPatchOutput)
}

type EventPatchMapOutput struct{ *pulumi.OutputState }

func (EventPatchMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EventPatch)(nil)).Elem()
}

func (o EventPatchMapOutput) ToEventPatchMapOutput() EventPatchMapOutput {
	return o
}

func (o EventPatchMapOutput) ToEventPatchMapOutputWithContext(ctx context.Context) EventPatchMapOutput {
	return o
}

func (o EventPatchMapOutput) MapIndex(k pulumi.StringInput) EventPatchOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EventPatch {
		return vs[0].(map[string]*EventPatch)[vs[1].(string)]
	}).(EventPatchOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EventPatchInput)(nil)).Elem(), &EventPatch{})
	pulumi.RegisterInputType(reflect.TypeOf((*EventPatchArrayInput)(nil)).Elem(), EventPatchArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EventPatchMapInput)(nil)).Elem(), EventPatchMap{})
	pulumi.RegisterOutputType(EventPatchOutput{})
	pulumi.RegisterOutputType(EventPatchArrayOutput{})
	pulumi.RegisterOutputType(EventPatchMapOutput{})
}
