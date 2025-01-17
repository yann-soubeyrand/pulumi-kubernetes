// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../../utilities";

// Export members:
export { DaemonSetArgs } from "./daemonSet";
export type DaemonSet = import("./daemonSet").DaemonSet;
export const DaemonSet: typeof import("./daemonSet").DaemonSet = null as any;

export { DaemonSetListArgs } from "./daemonSetList";
export type DaemonSetList = import("./daemonSetList").DaemonSetList;
export const DaemonSetList: typeof import("./daemonSetList").DaemonSetList = null as any;

export { DaemonSetPatchArgs } from "./daemonSetPatch";
export type DaemonSetPatch = import("./daemonSetPatch").DaemonSetPatch;
export const DaemonSetPatch: typeof import("./daemonSetPatch").DaemonSetPatch = null as any;

export { DeploymentArgs } from "./deployment";
export type Deployment = import("./deployment").Deployment;
export const Deployment: typeof import("./deployment").Deployment = null as any;

export { DeploymentListArgs } from "./deploymentList";
export type DeploymentList = import("./deploymentList").DeploymentList;
export const DeploymentList: typeof import("./deploymentList").DeploymentList = null as any;

export { DeploymentPatchArgs } from "./deploymentPatch";
export type DeploymentPatch = import("./deploymentPatch").DeploymentPatch;
export const DeploymentPatch: typeof import("./deploymentPatch").DeploymentPatch = null as any;

export { IngressArgs } from "./ingress";
export type Ingress = import("./ingress").Ingress;
export const Ingress: typeof import("./ingress").Ingress = null as any;

export { IngressListArgs } from "./ingressList";
export type IngressList = import("./ingressList").IngressList;
export const IngressList: typeof import("./ingressList").IngressList = null as any;

export { IngressPatchArgs } from "./ingressPatch";
export type IngressPatch = import("./ingressPatch").IngressPatch;
export const IngressPatch: typeof import("./ingressPatch").IngressPatch = null as any;

export { NetworkPolicyArgs } from "./networkPolicy";
export type NetworkPolicy = import("./networkPolicy").NetworkPolicy;
export const NetworkPolicy: typeof import("./networkPolicy").NetworkPolicy = null as any;

export { NetworkPolicyListArgs } from "./networkPolicyList";
export type NetworkPolicyList = import("./networkPolicyList").NetworkPolicyList;
export const NetworkPolicyList: typeof import("./networkPolicyList").NetworkPolicyList = null as any;

export { NetworkPolicyPatchArgs } from "./networkPolicyPatch";
export type NetworkPolicyPatch = import("./networkPolicyPatch").NetworkPolicyPatch;
export const NetworkPolicyPatch: typeof import("./networkPolicyPatch").NetworkPolicyPatch = null as any;

export { PodSecurityPolicyArgs } from "./podSecurityPolicy";
export type PodSecurityPolicy = import("./podSecurityPolicy").PodSecurityPolicy;
export const PodSecurityPolicy: typeof import("./podSecurityPolicy").PodSecurityPolicy = null as any;

export { PodSecurityPolicyListArgs } from "./podSecurityPolicyList";
export type PodSecurityPolicyList = import("./podSecurityPolicyList").PodSecurityPolicyList;
export const PodSecurityPolicyList: typeof import("./podSecurityPolicyList").PodSecurityPolicyList = null as any;

export { PodSecurityPolicyPatchArgs } from "./podSecurityPolicyPatch";
export type PodSecurityPolicyPatch = import("./podSecurityPolicyPatch").PodSecurityPolicyPatch;
export const PodSecurityPolicyPatch: typeof import("./podSecurityPolicyPatch").PodSecurityPolicyPatch = null as any;

export { ReplicaSetArgs } from "./replicaSet";
export type ReplicaSet = import("./replicaSet").ReplicaSet;
export const ReplicaSet: typeof import("./replicaSet").ReplicaSet = null as any;

export { ReplicaSetListArgs } from "./replicaSetList";
export type ReplicaSetList = import("./replicaSetList").ReplicaSetList;
export const ReplicaSetList: typeof import("./replicaSetList").ReplicaSetList = null as any;

export { ReplicaSetPatchArgs } from "./replicaSetPatch";
export type ReplicaSetPatch = import("./replicaSetPatch").ReplicaSetPatch;
export const ReplicaSetPatch: typeof import("./replicaSetPatch").ReplicaSetPatch = null as any;

utilities.lazyLoad(exports, ["DaemonSet"], () => require("./daemonSet"));
utilities.lazyLoad(exports, ["DaemonSetList"], () => require("./daemonSetList"));
utilities.lazyLoad(exports, ["DaemonSetPatch"], () => require("./daemonSetPatch"));
utilities.lazyLoad(exports, ["Deployment"], () => require("./deployment"));
utilities.lazyLoad(exports, ["DeploymentList"], () => require("./deploymentList"));
utilities.lazyLoad(exports, ["DeploymentPatch"], () => require("./deploymentPatch"));
utilities.lazyLoad(exports, ["Ingress"], () => require("./ingress"));
utilities.lazyLoad(exports, ["IngressList"], () => require("./ingressList"));
utilities.lazyLoad(exports, ["IngressPatch"], () => require("./ingressPatch"));
utilities.lazyLoad(exports, ["NetworkPolicy"], () => require("./networkPolicy"));
utilities.lazyLoad(exports, ["NetworkPolicyList"], () => require("./networkPolicyList"));
utilities.lazyLoad(exports, ["NetworkPolicyPatch"], () => require("./networkPolicyPatch"));
utilities.lazyLoad(exports, ["PodSecurityPolicy"], () => require("./podSecurityPolicy"));
utilities.lazyLoad(exports, ["PodSecurityPolicyList"], () => require("./podSecurityPolicyList"));
utilities.lazyLoad(exports, ["PodSecurityPolicyPatch"], () => require("./podSecurityPolicyPatch"));
utilities.lazyLoad(exports, ["ReplicaSet"], () => require("./replicaSet"));
utilities.lazyLoad(exports, ["ReplicaSetList"], () => require("./replicaSetList"));
utilities.lazyLoad(exports, ["ReplicaSetPatch"], () => require("./replicaSetPatch"));

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "kubernetes:extensions/v1beta1:DaemonSet":
                return new DaemonSet(name, <any>undefined, { urn })
            case "kubernetes:extensions/v1beta1:DaemonSetList":
                return new DaemonSetList(name, <any>undefined, { urn })
            case "kubernetes:extensions/v1beta1:DaemonSetPatch":
                return new DaemonSetPatch(name, <any>undefined, { urn })
            case "kubernetes:extensions/v1beta1:Deployment":
                return new Deployment(name, <any>undefined, { urn })
            case "kubernetes:extensions/v1beta1:DeploymentList":
                return new DeploymentList(name, <any>undefined, { urn })
            case "kubernetes:extensions/v1beta1:DeploymentPatch":
                return new DeploymentPatch(name, <any>undefined, { urn })
            case "kubernetes:extensions/v1beta1:Ingress":
                return new Ingress(name, <any>undefined, { urn })
            case "kubernetes:extensions/v1beta1:IngressList":
                return new IngressList(name, <any>undefined, { urn })
            case "kubernetes:extensions/v1beta1:IngressPatch":
                return new IngressPatch(name, <any>undefined, { urn })
            case "kubernetes:extensions/v1beta1:NetworkPolicy":
                return new NetworkPolicy(name, <any>undefined, { urn })
            case "kubernetes:extensions/v1beta1:NetworkPolicyList":
                return new NetworkPolicyList(name, <any>undefined, { urn })
            case "kubernetes:extensions/v1beta1:NetworkPolicyPatch":
                return new NetworkPolicyPatch(name, <any>undefined, { urn })
            case "kubernetes:extensions/v1beta1:PodSecurityPolicy":
                return new PodSecurityPolicy(name, <any>undefined, { urn })
            case "kubernetes:extensions/v1beta1:PodSecurityPolicyList":
                return new PodSecurityPolicyList(name, <any>undefined, { urn })
            case "kubernetes:extensions/v1beta1:PodSecurityPolicyPatch":
                return new PodSecurityPolicyPatch(name, <any>undefined, { urn })
            case "kubernetes:extensions/v1beta1:ReplicaSet":
                return new ReplicaSet(name, <any>undefined, { urn })
            case "kubernetes:extensions/v1beta1:ReplicaSetList":
                return new ReplicaSetList(name, <any>undefined, { urn })
            case "kubernetes:extensions/v1beta1:ReplicaSetPatch":
                return new ReplicaSetPatch(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("kubernetes", "extensions/v1beta1", _module)
