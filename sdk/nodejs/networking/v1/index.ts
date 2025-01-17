// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../../utilities";

// Export members:
export { IngressArgs } from "./ingress";
export type Ingress = import("./ingress").Ingress;
export const Ingress: typeof import("./ingress").Ingress = null as any;

export { IngressClassArgs } from "./ingressClass";
export type IngressClass = import("./ingressClass").IngressClass;
export const IngressClass: typeof import("./ingressClass").IngressClass = null as any;

export { IngressClassListArgs } from "./ingressClassList";
export type IngressClassList = import("./ingressClassList").IngressClassList;
export const IngressClassList: typeof import("./ingressClassList").IngressClassList = null as any;

export { IngressClassPatchArgs } from "./ingressClassPatch";
export type IngressClassPatch = import("./ingressClassPatch").IngressClassPatch;
export const IngressClassPatch: typeof import("./ingressClassPatch").IngressClassPatch = null as any;

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

utilities.lazyLoad(exports, ["Ingress"], () => require("./ingress"));
utilities.lazyLoad(exports, ["IngressClass"], () => require("./ingressClass"));
utilities.lazyLoad(exports, ["IngressClassList"], () => require("./ingressClassList"));
utilities.lazyLoad(exports, ["IngressClassPatch"], () => require("./ingressClassPatch"));
utilities.lazyLoad(exports, ["IngressList"], () => require("./ingressList"));
utilities.lazyLoad(exports, ["IngressPatch"], () => require("./ingressPatch"));
utilities.lazyLoad(exports, ["NetworkPolicy"], () => require("./networkPolicy"));
utilities.lazyLoad(exports, ["NetworkPolicyList"], () => require("./networkPolicyList"));
utilities.lazyLoad(exports, ["NetworkPolicyPatch"], () => require("./networkPolicyPatch"));

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "kubernetes:networking.k8s.io/v1:Ingress":
                return new Ingress(name, <any>undefined, { urn })
            case "kubernetes:networking.k8s.io/v1:IngressClass":
                return new IngressClass(name, <any>undefined, { urn })
            case "kubernetes:networking.k8s.io/v1:IngressClassList":
                return new IngressClassList(name, <any>undefined, { urn })
            case "kubernetes:networking.k8s.io/v1:IngressClassPatch":
                return new IngressClassPatch(name, <any>undefined, { urn })
            case "kubernetes:networking.k8s.io/v1:IngressList":
                return new IngressList(name, <any>undefined, { urn })
            case "kubernetes:networking.k8s.io/v1:IngressPatch":
                return new IngressPatch(name, <any>undefined, { urn })
            case "kubernetes:networking.k8s.io/v1:NetworkPolicy":
                return new NetworkPolicy(name, <any>undefined, { urn })
            case "kubernetes:networking.k8s.io/v1:NetworkPolicyList":
                return new NetworkPolicyList(name, <any>undefined, { urn })
            case "kubernetes:networking.k8s.io/v1:NetworkPolicyPatch":
                return new NetworkPolicyPatch(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("kubernetes", "networking.k8s.io/v1", _module)
