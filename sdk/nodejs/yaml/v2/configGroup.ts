// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../../utilities";

/**
 * ConfigGroup creates a set of Kubernetes resources from Kubernetes YAML text. The YAML text
 * may be supplied using any of the following methods:
 *
 * 1. Using a filename or a list of filenames:
 * 2. Using a file pattern or a list of file patterns:
 * 3. Using a literal string containing YAML, or a list of such strings:
 * 4. Any combination of files, patterns, or YAML strings:
 *
 * ## Dependency ordering
 * Sometimes resources must be applied in a specific order. For example, a namespace resource must be
 * created before any namespaced resources, or a Custom Resource Definition (CRD) must be pre-installed.
 *
 * Pulumi uses heuristics to determine which order to apply and delete objects within the ConfigGroup.  Pulumi also
 * waits for each object to be fully reconciled, unless `skipAwait` is enabled.
 *
 * ### Explicit Dependency Ordering
 * Pulumi supports the `config.kubernetes.io/depends-on` annotation to declare an explicit dependency on a given resource.
 * The annotation accepts a list of resource references, delimited by commas.
 *
 * Note that references to resources outside the ConfigGroup aren't supported.
 *
 * **Resource reference**
 *
 * A resource reference is a string that uniquely identifies a resource.
 *
 * It consists of the group, kind, name, and optionally the namespace, delimited by forward slashes.
 *
 * | Resource Scope   | Format                                         |
 * | :--------------- | :--------------------------------------------- |
 * | namespace-scoped | `<group>/namespaces/<namespace>/<kind>/<name>` |
 * | cluster-scoped   | `<group>/<kind>/<name>`                        |
 *
 * For resources in the “core” group, the empty string is used instead (for example: `/namespaces/test/Pod/pod-a`).
 *
 * ### Ordering across ConfigGroups
 * The `dependsOn` resource option creates a list of explicit dependencies between Pulumi resources.
 * Use it on another resource to make it dependent on the ConfigGroup and to wait for the resources within
 * the group to be deployed.
 *
 * A best practice is to deploy each application using its own ConfigGroup, especially when that application
 * installs custom resource definitions.
 *
 * ## Example Usage
 * ### Local File
 *
 * ```typescript
 * import * as k8s from "@pulumi/kubernetes";
 *
 * const example = new k8s.yaml.v2.ConfigGroup("example", {
 *     files: "foo.yaml",
 * });
 * ```
 * ### Multiple Local Files
 *
 * ```typescript
 * import * as k8s from "@pulumi/kubernetes";
 *
 * const example = new k8s.yaml.v2.ConfigGroup("example", {
 *     files: ["foo.yaml", "bar.yaml"],
 * });
 * ```
 * ### Local File Pattern
 *
 * ```typescript
 * import * as k8s from "@pulumi/kubernetes";
 *
 * const example = new k8s.yaml.v2.ConfigGroup("example", {
 *     files: "yaml/*.yaml",
 * });
 * ```
 * ### Multiple Local File Patterns
 *
 * ```typescript
 * import * as k8s from "@pulumi/kubernetes";
 *
 * const example = new k8s.yaml.v2.ConfigGroup("example", {
 *     files: ["foo/*.yaml", "bar/*.yaml"],
 * });
 * ```
 * ### Literal YAML String
 *
 * ```typescript
 * import * as k8s from "@pulumi/kubernetes";
 *
 * const example = new k8s.yaml.v2.ConfigGroup("example", {
 *     yaml: `
 * apiVersion: v1
 * kind: Namespace
 * metadata:
 *   name: foo
 * `,
 * })
 * ```
 * {% /examples %}}
 */
export class ConfigGroup extends pulumi.ComponentResource {
    /** @internal */
    public static readonly __pulumiType = 'kubernetes:yaml/v2:ConfigGroup';

    /**
     * Returns true if the given object is an instance of ConfigGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ConfigGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ConfigGroup.__pulumiType;
    }

    /**
     * Resources created by the ConfigGroup.
     */
    public /*out*/ readonly resources!: pulumi.Output<any[]>;

    /**
     * Create a ConfigGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ConfigGroupArgs, opts?: pulumi.ComponentResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (!opts.id) {
            resourceInputs["files"] = args ? args.files : undefined;
            resourceInputs["objs"] = args ? args.objs : undefined;
            resourceInputs["resourcePrefix"] = args ? args.resourcePrefix : undefined;
            resourceInputs["skipAwait"] = args ? args.skipAwait : undefined;
            resourceInputs["yaml"] = args ? args.yaml : undefined;
            resourceInputs["resources"] = undefined /*out*/;
        } else {
            resourceInputs["resources"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ConfigGroup.__pulumiType, name, resourceInputs, opts, true /*remote*/);
    }
}

/**
 * The set of arguments for constructing a ConfigGroup resource.
 */
export interface ConfigGroupArgs {
    /**
     * Set of paths and/or URLs to Kubernetes manifest files. Supports glob patterns.
     */
    files?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Objects representing Kubernetes resource configurations.
     */
    objs?: pulumi.Input<any[]>;
    /**
     * A prefix for the auto-generated resource names. Defaults to the name of the ConfigGroup. Example: A resource created with resourcePrefix="foo" would produce a resource named "foo-resourceName".
     */
    resourcePrefix?: pulumi.Input<string>;
    /**
     * Indicates that child resources should skip the await logic.
     */
    skipAwait?: pulumi.Input<boolean>;
    /**
     * A Kubernetes YAML manifest containing Kubernetes resource configuration(s).
     */
    yaml?: pulumi.Input<string>;
}