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
    /// Represents a Persistent Disk resource in AWS.
    /// 
    /// An AWS EBS disk must exist before mounting to a container. The disk must also be in the same AWS zone as the kubelet. An AWS EBS disk can only be mounted as read/write once. AWS EBS volumes support ownership management and SELinux relabeling.
    /// </summary>
    public class AWSElasticBlockStoreVolumeSourcePatchArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// fsType is the filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
        /// </summary>
        [Input("fsType")]
        public Input<string>? FsType { get; set; }

        /// <summary>
        /// partition is the partition in the volume that you want to mount. If omitted, the default is to mount by volume name. Examples: For volume /dev/sda1, you specify the partition as "1". Similarly, the volume partition for /dev/sda is "0" (or you can leave the property empty).
        /// </summary>
        [Input("partition")]
        public Input<int>? Partition { get; set; }

        /// <summary>
        /// readOnly value true will force the readOnly setting in VolumeMounts. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
        /// </summary>
        [Input("readOnly")]
        public Input<bool>? ReadOnly { get; set; }

        /// <summary>
        /// volumeID is unique ID of the persistent disk resource in AWS (Amazon EBS volume). More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
        /// </summary>
        [Input("volumeID")]
        public Input<string>? VolumeID { get; set; }

        public AWSElasticBlockStoreVolumeSourcePatchArgs()
        {
        }
        public static new AWSElasticBlockStoreVolumeSourcePatchArgs Empty => new AWSElasticBlockStoreVolumeSourcePatchArgs();
    }
}