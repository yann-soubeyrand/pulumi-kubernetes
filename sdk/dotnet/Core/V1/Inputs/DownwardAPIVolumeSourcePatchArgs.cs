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
    /// DownwardAPIVolumeSource represents a volume containing downward API info. Downward API volumes support ownership management and SELinux relabeling.
    /// </summary>
    public class DownwardAPIVolumeSourcePatchArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Optional: mode bits to use on created files by default. Must be a Optional: mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
        /// </summary>
        [Input("defaultMode")]
        public Input<int>? DefaultMode { get; set; }

        [Input("items")]
        private InputList<Pulumi.Kubernetes.Types.Inputs.Core.V1.DownwardAPIVolumeFilePatchArgs>? _items;

        /// <summary>
        /// Items is a list of downward API volume file
        /// </summary>
        public InputList<Pulumi.Kubernetes.Types.Inputs.Core.V1.DownwardAPIVolumeFilePatchArgs> Items
        {
            get => _items ?? (_items = new InputList<Pulumi.Kubernetes.Types.Inputs.Core.V1.DownwardAPIVolumeFilePatchArgs>());
            set => _items = value;
        }

        public DownwardAPIVolumeSourcePatchArgs()
        {
        }
        public static new DownwardAPIVolumeSourcePatchArgs Empty => new DownwardAPIVolumeSourcePatchArgs();
    }
}
