// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Kubernetes.StorageMigration.V1Alpha1
{
    /// <summary>
    /// StorageVersionMigration represents a migration of stored data to the latest storage version.
    /// </summary>
    [KubernetesResourceType("kubernetes:storagemigration.k8s.io/v1alpha1:StorageVersionMigration")]
    public partial class StorageVersionMigration : KubernetesResource
    {
        /// <summary>
        /// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        /// </summary>
        [Output("apiVersion")]
        public Output<string> ApiVersion { get; private set; } = null!;

        /// <summary>
        /// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        /// </summary>
        [Output("kind")]
        public Output<string> Kind { get; private set; } = null!;

        /// <summary>
        /// Standard object metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        /// </summary>
        [Output("metadata")]
        public Output<Pulumi.Kubernetes.Types.Outputs.Meta.V1.ObjectMeta> Metadata { get; private set; } = null!;

        /// <summary>
        /// Specification of the migration.
        /// </summary>
        [Output("spec")]
        public Output<Pulumi.Kubernetes.Types.Outputs.StorageMigration.V1Alpha1.StorageVersionMigrationSpec> Spec { get; private set; } = null!;

        /// <summary>
        /// Status of the migration.
        /// </summary>
        [Output("status")]
        public Output<Pulumi.Kubernetes.Types.Outputs.StorageMigration.V1Alpha1.StorageVersionMigrationStatus> Status { get; private set; } = null!;


        /// <summary>
        /// Create a StorageVersionMigration resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public StorageVersionMigration(string name, Pulumi.Kubernetes.Types.Inputs.StorageMigration.V1Alpha1.StorageVersionMigrationArgs? args = null, CustomResourceOptions? options = null)
            : base("kubernetes:storagemigration.k8s.io/v1alpha1:StorageVersionMigration", name, MakeArgs(args), MakeResourceOptions(options, ""))
        {
        }
        internal StorageVersionMigration(string name, ImmutableDictionary<string, object?> dictionary, CustomResourceOptions? options = null)
            : base("kubernetes:storagemigration.k8s.io/v1alpha1:StorageVersionMigration", name, new DictionaryResourceArgs(dictionary), MakeResourceOptions(options, ""))
        {
        }

        private StorageVersionMigration(string name, Input<string> id, CustomResourceOptions? options = null)
            : base("kubernetes:storagemigration.k8s.io/v1alpha1:StorageVersionMigration", name, null, MakeResourceOptions(options, id))
        {
        }

        private static Pulumi.Kubernetes.Types.Inputs.StorageMigration.V1Alpha1.StorageVersionMigrationArgs? MakeArgs(Pulumi.Kubernetes.Types.Inputs.StorageMigration.V1Alpha1.StorageVersionMigrationArgs? args)
        {
            args ??= new Pulumi.Kubernetes.Types.Inputs.StorageMigration.V1Alpha1.StorageVersionMigrationArgs();
            args.ApiVersion = "storagemigration.k8s.io/v1alpha1";
            args.Kind = "StorageVersionMigration";
            return args;
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing StorageVersionMigration resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static StorageVersionMigration Get(string name, Input<string> id, CustomResourceOptions? options = null)
        {
            return new StorageVersionMigration(name, id, options);
        }
    }
}
namespace Pulumi.Kubernetes.Types.Inputs.StorageMigration.V1Alpha1
{

    public class StorageVersionMigrationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        /// </summary>
        [Input("apiVersion")]
        public Input<string>? ApiVersion { get; set; }

        /// <summary>
        /// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        /// </summary>
        [Input("kind")]
        public Input<string>? Kind { get; set; }

        /// <summary>
        /// Standard object metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        /// </summary>
        [Input("metadata")]
        public Input<Pulumi.Kubernetes.Types.Inputs.Meta.V1.ObjectMetaArgs>? Metadata { get; set; }

        /// <summary>
        /// Specification of the migration.
        /// </summary>
        [Input("spec")]
        public Input<Pulumi.Kubernetes.Types.Inputs.StorageMigration.V1Alpha1.StorageVersionMigrationSpecArgs>? Spec { get; set; }

        public StorageVersionMigrationArgs()
        {
        }
        public static new StorageVersionMigrationArgs Empty => new StorageVersionMigrationArgs();
    }
}