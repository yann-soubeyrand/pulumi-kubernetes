// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../../types/input";
import * as outputs from "../../types/output";
import * as enums from "../../types/enums";
import * as utilities from "../../utilities";

/**
 * Patch resources are used to modify existing Kubernetes resources by using
 * Server-Side Apply updates. The name of the resource must be specified, but all other properties are optional. More than
 * one patch may be applied to the same resource, and a random FieldManager name will be used for each Patch resource.
 * Conflicts will result in an error by default, but can be forced using the "pulumi.com/patchForce" annotation. See the
 * [Server-Side Apply Docs](https://www.pulumi.com/registry/packages/kubernetes/installation-configuration/#server-side-apply) for
 * additional information about using Server-Side Apply to manage Kubernetes resources with Pulumi.
 * StorageClass describes the parameters for a class of storage for which PersistentVolumes can be dynamically provisioned.
 *
 * StorageClasses are non-namespaced; the name of the storage class according to etcd is in ObjectMeta.Name.
 */
export class StorageClassPatch extends pulumi.CustomResource {
    /**
     * Get an existing StorageClassPatch resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, opts?: pulumi.CustomResourceOptions): StorageClassPatch {
        return new StorageClassPatch(name, undefined as any, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'kubernetes:storage.k8s.io/v1beta1:StorageClassPatch';

    /**
     * Returns true if the given object is an instance of StorageClassPatch.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is StorageClassPatch {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === StorageClassPatch.__pulumiType;
    }

    /**
     * AllowVolumeExpansion shows whether the storage class allow volume expand
     */
    public readonly allowVolumeExpansion!: pulumi.Output<boolean>;
    /**
     * Restrict the node topologies where volumes can be dynamically provisioned. Each volume plugin defines its own supported topology specifications. An empty TopologySelectorTerm list means there is no topology restriction. This field is only honored by servers that enable the VolumeScheduling feature.
     */
    public readonly allowedTopologies!: pulumi.Output<outputs.core.v1.TopologySelectorTermPatch[]>;
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     */
    public readonly apiVersion!: pulumi.Output<"storage.k8s.io/v1beta1">;
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     */
    public readonly kind!: pulumi.Output<"StorageClass">;
    /**
     * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     */
    public readonly metadata!: pulumi.Output<outputs.meta.v1.ObjectMetaPatch>;
    /**
     * Dynamically provisioned PersistentVolumes of this storage class are created with these mountOptions, e.g. ["ro", "soft"]. Not validated - mount of the PVs will simply fail if one is invalid.
     */
    public readonly mountOptions!: pulumi.Output<string[]>;
    /**
     * Parameters holds the parameters for the provisioner that should create volumes of this storage class.
     */
    public readonly parameters!: pulumi.Output<{[key: string]: string}>;
    /**
     * Provisioner indicates the type of the provisioner.
     */
    public readonly provisioner!: pulumi.Output<string>;
    /**
     * Dynamically provisioned PersistentVolumes of this storage class are created with this reclaimPolicy. Defaults to Delete.
     */
    public readonly reclaimPolicy!: pulumi.Output<string>;
    /**
     * VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.  When unset, VolumeBindingImmediate is used. This field is only honored by servers that enable the VolumeScheduling feature.
     */
    public readonly volumeBindingMode!: pulumi.Output<string>;

    /**
     * Create a StorageClassPatch resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: StorageClassPatchArgs, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (!opts.id) {
            resourceInputs["allowVolumeExpansion"] = args ? args.allowVolumeExpansion : undefined;
            resourceInputs["allowedTopologies"] = args ? args.allowedTopologies : undefined;
            resourceInputs["apiVersion"] = "storage.k8s.io/v1beta1";
            resourceInputs["kind"] = "StorageClass";
            resourceInputs["metadata"] = args ? args.metadata : undefined;
            resourceInputs["mountOptions"] = args ? args.mountOptions : undefined;
            resourceInputs["parameters"] = args ? args.parameters : undefined;
            resourceInputs["provisioner"] = args ? args.provisioner : undefined;
            resourceInputs["reclaimPolicy"] = args ? args.reclaimPolicy : undefined;
            resourceInputs["volumeBindingMode"] = args ? args.volumeBindingMode : undefined;
        } else {
            resourceInputs["allowVolumeExpansion"] = undefined /*out*/;
            resourceInputs["allowedTopologies"] = undefined /*out*/;
            resourceInputs["apiVersion"] = undefined /*out*/;
            resourceInputs["kind"] = undefined /*out*/;
            resourceInputs["metadata"] = undefined /*out*/;
            resourceInputs["mountOptions"] = undefined /*out*/;
            resourceInputs["parameters"] = undefined /*out*/;
            resourceInputs["provisioner"] = undefined /*out*/;
            resourceInputs["reclaimPolicy"] = undefined /*out*/;
            resourceInputs["volumeBindingMode"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const aliasOpts = { aliases: [{ type: "kubernetes:storage.k8s.io/v1:StorageClassPatch" }] };
        opts = pulumi.mergeOptions(opts, aliasOpts);
        super(StorageClassPatch.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * The set of arguments for constructing a StorageClassPatch resource.
 */
export interface StorageClassPatchArgs {
    /**
     * AllowVolumeExpansion shows whether the storage class allow volume expand
     */
    allowVolumeExpansion?: pulumi.Input<boolean>;
    /**
     * Restrict the node topologies where volumes can be dynamically provisioned. Each volume plugin defines its own supported topology specifications. An empty TopologySelectorTerm list means there is no topology restriction. This field is only honored by servers that enable the VolumeScheduling feature.
     */
    allowedTopologies?: pulumi.Input<pulumi.Input<inputs.core.v1.TopologySelectorTermPatch>[]>;
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     */
    apiVersion?: pulumi.Input<"storage.k8s.io/v1beta1">;
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     */
    kind?: pulumi.Input<"StorageClass">;
    /**
     * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     */
    metadata?: pulumi.Input<inputs.meta.v1.ObjectMetaPatch>;
    /**
     * Dynamically provisioned PersistentVolumes of this storage class are created with these mountOptions, e.g. ["ro", "soft"]. Not validated - mount of the PVs will simply fail if one is invalid.
     */
    mountOptions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Parameters holds the parameters for the provisioner that should create volumes of this storage class.
     */
    parameters?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Provisioner indicates the type of the provisioner.
     */
    provisioner?: pulumi.Input<string>;
    /**
     * Dynamically provisioned PersistentVolumes of this storage class are created with this reclaimPolicy. Defaults to Delete.
     */
    reclaimPolicy?: pulumi.Input<string>;
    /**
     * VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.  When unset, VolumeBindingImmediate is used. This field is only honored by servers that enable the VolumeScheduling feature.
     */
    volumeBindingMode?: pulumi.Input<string>;
}
