// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Kubernetes.Types.Inputs.Autoscaling.V2
{

    /// <summary>
    /// ResourceMetricStatus indicates the current value of a resource metric known to Kubernetes, as specified in requests and limits, describing each pod in the current scale target (e.g. CPU or memory).  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.
    /// </summary>
    public class ResourceMetricStatusPatchArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// current contains the current value for the given metric
        /// </summary>
        [Input("current")]
        public Input<Pulumi.Kubernetes.Types.Inputs.Autoscaling.V2.MetricValueStatusPatchArgs>? Current { get; set; }

        /// <summary>
        /// Name is the name of the resource in question.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public ResourceMetricStatusPatchArgs()
        {
        }
    }
}