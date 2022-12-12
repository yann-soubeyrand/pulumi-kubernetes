// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Kubernetes.Types.Outputs.Networking.V1
{

    /// <summary>
    /// IngressPortStatus represents the error condition of a service port
    /// </summary>
    [OutputType]
    public sealed class IngressPortStatus
    {
        /// <summary>
        /// Error is to record the problem with the service port The format of the error shall comply with the following rules: - built-in error values shall be specified in this file and those shall use
        ///   CamelCase names
        /// - cloud provider specific error values must have names that comply with the
        ///   format foo.example.com/CamelCase.
        /// </summary>
        public readonly string Error;
        /// <summary>
        /// Port is the port number of the ingress port.
        /// </summary>
        public readonly int Port;
        /// <summary>
        /// Protocol is the protocol of the ingress port. The supported values are: "TCP", "UDP", "SCTP"
        /// </summary>
        public readonly string Protocol;

        [OutputConstructor]
        private IngressPortStatus(
            string error,

            int port,

            string protocol)
        {
            Error = error;
            Port = port;
            Protocol = protocol;
        }
    }
}