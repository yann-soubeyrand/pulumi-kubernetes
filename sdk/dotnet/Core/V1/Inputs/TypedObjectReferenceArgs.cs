// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Kubernetes.Types.Inputs.Core.V1
{

    public class TypedObjectReferenceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// APIGroup is the group for the resource being referenced. If APIGroup is not specified, the specified Kind must be in the core API group. For any other third-party types, APIGroup is required.
        /// </summary>
        [Input("apiGroup")]
        public Input<string>? ApiGroup { get; set; }

        /// <summary>
        /// Kind is the type of resource being referenced
        /// </summary>
        [Input("kind", required: true)]
        public Input<string> Kind { get; set; } = null!;

        /// <summary>
        /// Name is the name of resource being referenced
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Namespace is the namespace of resource being referenced Note that when a namespace is specified, a gateway.networking.k8s.io/ReferenceGrant object is required in the referent namespace to allow that namespace's owner to accept the reference. See the ReferenceGrant documentation for details. (Alpha) This field requires the CrossNamespaceVolumeDataSource feature gate to be enabled.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        public TypedObjectReferenceArgs()
        {
        }
        public static new TypedObjectReferenceArgs Empty => new TypedObjectReferenceArgs();
    }
}