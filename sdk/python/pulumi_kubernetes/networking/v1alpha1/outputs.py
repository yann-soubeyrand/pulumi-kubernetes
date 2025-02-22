# coding=utf-8
# *** WARNING: this file was generated by pulumigen. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from ... import _utilities
from . import outputs
from ... import core as _core
from ... import meta as _meta

__all__ = [
    'ClusterCIDR',
    'ClusterCIDRSpec',
    'ClusterCIDRSpecPatch',
]

@pulumi.output_type
class ClusterCIDR(dict):
    """
    ClusterCIDR represents a single configuration for per-Node Pod CIDR allocations when the MultiCIDRRangeAllocator is enabled (see the config for kube-controller-manager).  A cluster may have any number of ClusterCIDR resources, all of which will be considered when allocating a CIDR for a Node.  A ClusterCIDR is eligible to be used for a given Node when the node selector matches the node in question and has free CIDRs to allocate.  In case of multiple matching ClusterCIDR resources, the allocator will attempt to break ties using internal heuristics, but any ClusterCIDR whose node selector matches the Node may be used.
    """
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "apiVersion":
            suggest = "api_version"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ClusterCIDR. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ClusterCIDR.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ClusterCIDR.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 api_version: Optional[str] = None,
                 kind: Optional[str] = None,
                 metadata: Optional['_meta.v1.outputs.ObjectMeta'] = None,
                 spec: Optional['outputs.ClusterCIDRSpec'] = None):
        """
        ClusterCIDR represents a single configuration for per-Node Pod CIDR allocations when the MultiCIDRRangeAllocator is enabled (see the config for kube-controller-manager).  A cluster may have any number of ClusterCIDR resources, all of which will be considered when allocating a CIDR for a Node.  A ClusterCIDR is eligible to be used for a given Node when the node selector matches the node in question and has free CIDRs to allocate.  In case of multiple matching ClusterCIDR resources, the allocator will attempt to break ties using internal heuristics, but any ClusterCIDR whose node selector matches the Node may be used.
        :param str api_version: APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        :param str kind: Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        :param '_meta.v1.ObjectMetaArgs' metadata: Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        :param 'ClusterCIDRSpecArgs' spec: Spec is the desired state of the ClusterCIDR. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        """
        if api_version is not None:
            pulumi.set(__self__, "api_version", 'networking.k8s.io/v1alpha1')
        if kind is not None:
            pulumi.set(__self__, "kind", 'ClusterCIDR')
        if metadata is not None:
            pulumi.set(__self__, "metadata", metadata)
        if spec is not None:
            pulumi.set(__self__, "spec", spec)

    @property
    @pulumi.getter(name="apiVersion")
    def api_version(self) -> Optional[str]:
        """
        APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        """
        return pulumi.get(self, "api_version")

    @property
    @pulumi.getter
    def kind(self) -> Optional[str]:
        """
        Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        """
        return pulumi.get(self, "kind")

    @property
    @pulumi.getter
    def metadata(self) -> Optional['_meta.v1.outputs.ObjectMeta']:
        """
        Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        """
        return pulumi.get(self, "metadata")

    @property
    @pulumi.getter
    def spec(self) -> Optional['outputs.ClusterCIDRSpec']:
        """
        Spec is the desired state of the ClusterCIDR. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        """
        return pulumi.get(self, "spec")


@pulumi.output_type
class ClusterCIDRSpec(dict):
    """
    ClusterCIDRSpec defines the desired state of ClusterCIDR.
    """
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "perNodeHostBits":
            suggest = "per_node_host_bits"
        elif key == "nodeSelector":
            suggest = "node_selector"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ClusterCIDRSpec. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ClusterCIDRSpec.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ClusterCIDRSpec.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 per_node_host_bits: int,
                 ipv4: Optional[str] = None,
                 ipv6: Optional[str] = None,
                 node_selector: Optional['_core.v1.outputs.NodeSelector'] = None):
        """
        ClusterCIDRSpec defines the desired state of ClusterCIDR.
        :param int per_node_host_bits: PerNodeHostBits defines the number of host bits to be configured per node. A subnet mask determines how much of the address is used for network bits and host bits. For example an IPv4 address of 192.168.0.0/24, splits the address into 24 bits for the network portion and 8 bits for the host portion. To allocate 256 IPs, set this field to 8 (a /24 mask for IPv4 or a /120 for IPv6). Minimum value is 4 (16 IPs). This field is immutable.
        :param str ipv4: IPv4 defines an IPv4 IP block in CIDR notation(e.g. "10.0.0.0/8"). At least one of IPv4 and IPv6 must be specified. This field is immutable.
        :param str ipv6: IPv6 defines an IPv6 IP block in CIDR notation(e.g. "fd12:3456:789a:1::/64"). At least one of IPv4 and IPv6 must be specified. This field is immutable.
        :param '_core.v1.NodeSelectorArgs' node_selector: NodeSelector defines which nodes the config is applicable to. An empty or nil NodeSelector selects all nodes. This field is immutable.
        """
        pulumi.set(__self__, "per_node_host_bits", per_node_host_bits)
        if ipv4 is not None:
            pulumi.set(__self__, "ipv4", ipv4)
        if ipv6 is not None:
            pulumi.set(__self__, "ipv6", ipv6)
        if node_selector is not None:
            pulumi.set(__self__, "node_selector", node_selector)

    @property
    @pulumi.getter(name="perNodeHostBits")
    def per_node_host_bits(self) -> int:
        """
        PerNodeHostBits defines the number of host bits to be configured per node. A subnet mask determines how much of the address is used for network bits and host bits. For example an IPv4 address of 192.168.0.0/24, splits the address into 24 bits for the network portion and 8 bits for the host portion. To allocate 256 IPs, set this field to 8 (a /24 mask for IPv4 or a /120 for IPv6). Minimum value is 4 (16 IPs). This field is immutable.
        """
        return pulumi.get(self, "per_node_host_bits")

    @property
    @pulumi.getter
    def ipv4(self) -> Optional[str]:
        """
        IPv4 defines an IPv4 IP block in CIDR notation(e.g. "10.0.0.0/8"). At least one of IPv4 and IPv6 must be specified. This field is immutable.
        """
        return pulumi.get(self, "ipv4")

    @property
    @pulumi.getter
    def ipv6(self) -> Optional[str]:
        """
        IPv6 defines an IPv6 IP block in CIDR notation(e.g. "fd12:3456:789a:1::/64"). At least one of IPv4 and IPv6 must be specified. This field is immutable.
        """
        return pulumi.get(self, "ipv6")

    @property
    @pulumi.getter(name="nodeSelector")
    def node_selector(self) -> Optional['_core.v1.outputs.NodeSelector']:
        """
        NodeSelector defines which nodes the config is applicable to. An empty or nil NodeSelector selects all nodes. This field is immutable.
        """
        return pulumi.get(self, "node_selector")


@pulumi.output_type
class ClusterCIDRSpecPatch(dict):
    """
    ClusterCIDRSpec defines the desired state of ClusterCIDR.
    """
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "nodeSelector":
            suggest = "node_selector"
        elif key == "perNodeHostBits":
            suggest = "per_node_host_bits"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ClusterCIDRSpecPatch. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ClusterCIDRSpecPatch.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ClusterCIDRSpecPatch.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 ipv4: Optional[str] = None,
                 ipv6: Optional[str] = None,
                 node_selector: Optional['_core.v1.outputs.NodeSelectorPatch'] = None,
                 per_node_host_bits: Optional[int] = None):
        """
        ClusterCIDRSpec defines the desired state of ClusterCIDR.
        :param str ipv4: IPv4 defines an IPv4 IP block in CIDR notation(e.g. "10.0.0.0/8"). At least one of IPv4 and IPv6 must be specified. This field is immutable.
        :param str ipv6: IPv6 defines an IPv6 IP block in CIDR notation(e.g. "fd12:3456:789a:1::/64"). At least one of IPv4 and IPv6 must be specified. This field is immutable.
        :param '_core.v1.NodeSelectorPatchArgs' node_selector: NodeSelector defines which nodes the config is applicable to. An empty or nil NodeSelector selects all nodes. This field is immutable.
        :param int per_node_host_bits: PerNodeHostBits defines the number of host bits to be configured per node. A subnet mask determines how much of the address is used for network bits and host bits. For example an IPv4 address of 192.168.0.0/24, splits the address into 24 bits for the network portion and 8 bits for the host portion. To allocate 256 IPs, set this field to 8 (a /24 mask for IPv4 or a /120 for IPv6). Minimum value is 4 (16 IPs). This field is immutable.
        """
        if ipv4 is not None:
            pulumi.set(__self__, "ipv4", ipv4)
        if ipv6 is not None:
            pulumi.set(__self__, "ipv6", ipv6)
        if node_selector is not None:
            pulumi.set(__self__, "node_selector", node_selector)
        if per_node_host_bits is not None:
            pulumi.set(__self__, "per_node_host_bits", per_node_host_bits)

    @property
    @pulumi.getter
    def ipv4(self) -> Optional[str]:
        """
        IPv4 defines an IPv4 IP block in CIDR notation(e.g. "10.0.0.0/8"). At least one of IPv4 and IPv6 must be specified. This field is immutable.
        """
        return pulumi.get(self, "ipv4")

    @property
    @pulumi.getter
    def ipv6(self) -> Optional[str]:
        """
        IPv6 defines an IPv6 IP block in CIDR notation(e.g. "fd12:3456:789a:1::/64"). At least one of IPv4 and IPv6 must be specified. This field is immutable.
        """
        return pulumi.get(self, "ipv6")

    @property
    @pulumi.getter(name="nodeSelector")
    def node_selector(self) -> Optional['_core.v1.outputs.NodeSelectorPatch']:
        """
        NodeSelector defines which nodes the config is applicable to. An empty or nil NodeSelector selects all nodes. This field is immutable.
        """
        return pulumi.get(self, "node_selector")

    @property
    @pulumi.getter(name="perNodeHostBits")
    def per_node_host_bits(self) -> Optional[int]:
        """
        PerNodeHostBits defines the number of host bits to be configured per node. A subnet mask determines how much of the address is used for network bits and host bits. For example an IPv4 address of 192.168.0.0/24, splits the address into 24 bits for the network portion and 8 bits for the host portion. To allocate 256 IPs, set this field to 8 (a /24 mask for IPv4 or a /120 for IPv6). Minimum value is 4 (16 IPs). This field is immutable.
        """
        return pulumi.get(self, "per_node_host_bits")


