// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../../utilities";

// Export members:
export { ClusterCIDRArgs } from "./clusterCIDR";
export type ClusterCIDR = import("./clusterCIDR").ClusterCIDR;
export const ClusterCIDR: typeof import("./clusterCIDR").ClusterCIDR = null as any;
utilities.lazyLoad(exports, ["ClusterCIDR"], () => require("./clusterCIDR"));

export { ClusterCIDRListArgs } from "./clusterCIDRList";
export type ClusterCIDRList = import("./clusterCIDRList").ClusterCIDRList;
export const ClusterCIDRList: typeof import("./clusterCIDRList").ClusterCIDRList = null as any;
utilities.lazyLoad(exports, ["ClusterCIDRList"], () => require("./clusterCIDRList"));

export { ClusterCIDRPatchArgs } from "./clusterCIDRPatch";
export type ClusterCIDRPatch = import("./clusterCIDRPatch").ClusterCIDRPatch;
export const ClusterCIDRPatch: typeof import("./clusterCIDRPatch").ClusterCIDRPatch = null as any;
utilities.lazyLoad(exports, ["ClusterCIDRPatch"], () => require("./clusterCIDRPatch"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "kubernetes:networking.k8s.io/v1alpha1:ClusterCIDR":
                return new ClusterCIDR(name, <any>undefined, { urn })
            case "kubernetes:networking.k8s.io/v1alpha1:ClusterCIDRList":
                return new ClusterCIDRList(name, <any>undefined, { urn })
            case "kubernetes:networking.k8s.io/v1alpha1:ClusterCIDRPatch":
                return new ClusterCIDRPatch(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("kubernetes", "networking.k8s.io/v1alpha1", _module)