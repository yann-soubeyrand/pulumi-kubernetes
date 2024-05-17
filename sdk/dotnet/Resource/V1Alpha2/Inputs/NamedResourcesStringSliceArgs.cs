// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Kubernetes.Types.Inputs.Resource.V1Alpha2
{

    /// <summary>
    /// NamedResourcesStringSlice contains a slice of strings.
    /// </summary>
    public class NamedResourcesStringSliceArgs : global::Pulumi.ResourceArgs
    {
        [Input("strings", required: true)]
        private InputList<string>? _strings;

        /// <summary>
        /// Strings is the slice of strings.
        /// </summary>
        public InputList<string> Strings
        {
            get => _strings ?? (_strings = new InputList<string>());
            set => _strings = value;
        }

        public NamedResourcesStringSliceArgs()
        {
        }
        public static new NamedResourcesStringSliceArgs Empty => new NamedResourcesStringSliceArgs();
    }
}