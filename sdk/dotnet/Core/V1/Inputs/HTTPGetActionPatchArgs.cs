// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Kubernetes.Types.Inputs.Core.V1
{

    /// <summary>
    /// HTTPGetAction describes an action based on HTTP Get requests.
    /// </summary>
    public class HTTPGetActionPatchArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Host name to connect to, defaults to the pod IP. You probably want to set "Host" in httpHeaders instead.
        /// </summary>
        [Input("host")]
        public Input<string>? Host { get; set; }

        [Input("httpHeaders")]
        private InputList<Pulumi.Kubernetes.Types.Inputs.Core.V1.HTTPHeaderPatchArgs>? _httpHeaders;

        /// <summary>
        /// Custom headers to set in the request. HTTP allows repeated headers.
        /// </summary>
        public InputList<Pulumi.Kubernetes.Types.Inputs.Core.V1.HTTPHeaderPatchArgs> HttpHeaders
        {
            get => _httpHeaders ?? (_httpHeaders = new InputList<Pulumi.Kubernetes.Types.Inputs.Core.V1.HTTPHeaderPatchArgs>());
            set => _httpHeaders = value;
        }

        /// <summary>
        /// Path to access on the HTTP server.
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        /// <summary>
        /// Name or number of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
        /// </summary>
        [Input("port")]
        public InputUnion<int, string>? Port { get; set; }

        /// <summary>
        /// Scheme to use for connecting to the host. Defaults to HTTP.
        /// </summary>
        [Input("scheme")]
        public Input<string>? Scheme { get; set; }

        public HTTPGetActionPatchArgs()
        {
        }
        public static new HTTPGetActionPatchArgs Empty => new HTTPGetActionPatchArgs();
    }
}