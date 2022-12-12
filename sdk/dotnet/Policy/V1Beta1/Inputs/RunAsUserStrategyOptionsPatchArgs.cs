// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Kubernetes.Types.Inputs.Policy.V1Beta1
{

    /// <summary>
    /// RunAsUserStrategyOptions defines the strategy type and any options used to create the strategy.
    /// </summary>
    public class RunAsUserStrategyOptionsPatchArgs : global::Pulumi.ResourceArgs
    {
        [Input("ranges")]
        private InputList<Pulumi.Kubernetes.Types.Inputs.Policy.V1Beta1.IDRangePatchArgs>? _ranges;

        /// <summary>
        /// ranges are the allowed ranges of uids that may be used. If you would like to force a single uid then supply a single range with the same start and end. Required for MustRunAs.
        /// </summary>
        public InputList<Pulumi.Kubernetes.Types.Inputs.Policy.V1Beta1.IDRangePatchArgs> Ranges
        {
            get => _ranges ?? (_ranges = new InputList<Pulumi.Kubernetes.Types.Inputs.Policy.V1Beta1.IDRangePatchArgs>());
            set => _ranges = value;
        }

        /// <summary>
        /// rule is the strategy that will dictate the allowable RunAsUser values that may be set.
        /// </summary>
        [Input("rule")]
        public Input<string>? Rule { get; set; }

        public RunAsUserStrategyOptionsPatchArgs()
        {
        }
        public static new RunAsUserStrategyOptionsPatchArgs Empty => new RunAsUserStrategyOptionsPatchArgs();
    }
}