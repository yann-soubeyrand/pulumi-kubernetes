// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Kubernetes.Types.Inputs.AdmissionRegistration.V1
{

    /// <summary>
    /// Variable is the definition of a variable that is used for composition. A variable is defined as a named expression.
    /// </summary>
    public class VariablePatchArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Expression is the expression that will be evaluated as the value of the variable. The CEL expression has access to the same identifiers as the CEL expressions in Validation.
        /// </summary>
        [Input("expression")]
        public Input<string>? Expression { get; set; }

        /// <summary>
        /// Name is the name of the variable. The name must be a valid CEL identifier and unique among all variables. The variable can be accessed in other expressions through `variables` For example, if name is "foo", the variable will be available as `variables.foo`
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public VariablePatchArgs()
        {
        }
        public static new VariablePatchArgs Empty => new VariablePatchArgs();
    }
}