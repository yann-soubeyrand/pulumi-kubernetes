// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

// Export members:
export { ProviderArgs } from "./provider";
export type Provider = import("./provider").Provider;
export const Provider: typeof import("./provider").Provider = null as any;

utilities.lazyLoad(exports, ["Provider"], () => require("./provider"));

// Export sub-modules:
import * as admissionregistration from "./admissionregistration";
import * as apiextensions from "./apiextensions";
import * as apiregistration from "./apiregistration";
import * as apps from "./apps";
import * as auditregistration from "./auditregistration";
import * as authentication from "./authentication";
import * as authorization from "./authorization";
import * as autoscaling from "./autoscaling";
import * as batch from "./batch";
import * as certificates from "./certificates";
import * as coordination from "./coordination";
import * as core from "./core";
import * as discovery from "./discovery";
import * as events from "./events";
import * as extensions from "./extensions";
import * as flowcontrol from "./flowcontrol";
import * as helm from "./helm";
import * as kustomize from "./kustomize";
import * as meta from "./meta";
import * as networking from "./networking";
import * as node from "./node";
import * as policy from "./policy";
import * as rbac from "./rbac";
import * as scheduling from "./scheduling";
import * as settings from "./settings";
import * as storage from "./storage";
import * as types from "./types";
import * as yaml from "./yaml";

export {
    admissionregistration,
    apiextensions,
    apiregistration,
    apps,
    auditregistration,
    authentication,
    authorization,
    autoscaling,
    batch,
    certificates,
    coordination,
    core,
    discovery,
    events,
    extensions,
    flowcontrol,
    helm,
    kustomize,
    meta,
    networking,
    node,
    policy,
    rbac,
    scheduling,
    settings,
    storage,
    types,
    yaml,
};
pulumi.runtime.registerResourcePackage("kubernetes", {
    version: utilities.getVersion(),
    constructProvider: (name: string, type: string, urn: string): pulumi.ProviderResource => {
        if (type !== "pulumi:providers:kubernetes") {
            throw new Error(`unknown provider type ${type}`);
        }
        return new Provider(name, <any>undefined, { urn });
    },
});
