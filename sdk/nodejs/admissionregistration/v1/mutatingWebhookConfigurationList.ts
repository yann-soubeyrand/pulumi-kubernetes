// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../../types/input";
import * as outputs from "../../types/output";
import * as utilities from "../../utilities";

/**
 * MutatingWebhookConfigurationList is a list of MutatingWebhookConfiguration.
 */
export class MutatingWebhookConfigurationList extends pulumi.CustomResource {
    /**
     * Get an existing MutatingWebhookConfigurationList resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, opts?: pulumi.CustomResourceOptions): MutatingWebhookConfigurationList {
        return new MutatingWebhookConfigurationList(name, undefined, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'kubernetes:admissionregistration.k8s.io/v1:MutatingWebhookConfigurationList';

    /**
     * Returns true if the given object is an instance of MutatingWebhookConfigurationList.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MutatingWebhookConfigurationList {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MutatingWebhookConfigurationList.__pulumiType;
    }

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     */
    public readonly apiVersion!: pulumi.Output<"admissionregistration.k8s.io/v1">;
    /**
     * List of MutatingWebhookConfiguration.
     */
    public readonly items!: pulumi.Output<outputs.admissionregistration.v1.MutatingWebhookConfiguration[]>;
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     */
    public readonly kind!: pulumi.Output<"MutatingWebhookConfigurationList">;
    /**
     * Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     */
    public readonly metadata!: pulumi.Output<outputs.meta.v1.ListMeta>;

    /**
     * Create a MutatingWebhookConfigurationList resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: MutatingWebhookConfigurationListArgs, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
            if (!args || args.items === undefined) {
                throw new Error("Missing required property 'items'");
            }
        inputs["apiVersion"] = "admissionregistration.k8s.io/v1";
        inputs["items"] = args ? args.items : undefined;
        inputs["kind"] = "MutatingWebhookConfigurationList";
        inputs["metadata"] = args ? args.metadata : undefined;
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(MutatingWebhookConfigurationList.__pulumiType, name, inputs, opts);
    }
}

/**
 * The set of arguments for constructing a MutatingWebhookConfigurationList resource.
 */
export interface MutatingWebhookConfigurationListArgs {
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     */
    readonly apiVersion?: pulumi.Input<"admissionregistration.k8s.io/v1">;
    /**
     * List of MutatingWebhookConfiguration.
     */
    readonly items: pulumi.Input<pulumi.Input<inputs.admissionregistration.v1.MutatingWebhookConfiguration>[]>;
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     */
    readonly kind?: pulumi.Input<"MutatingWebhookConfigurationList">;
    /**
     * Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     */
    readonly metadata?: pulumi.Input<inputs.meta.v1.ListMeta>;
}