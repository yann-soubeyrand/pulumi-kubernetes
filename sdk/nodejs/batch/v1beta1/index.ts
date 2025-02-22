// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../../utilities";

// Export members:
export { CronJobArgs } from "./cronJob";
export type CronJob = import("./cronJob").CronJob;
export const CronJob: typeof import("./cronJob").CronJob = null as any;

export { CronJobListArgs } from "./cronJobList";
export type CronJobList = import("./cronJobList").CronJobList;
export const CronJobList: typeof import("./cronJobList").CronJobList = null as any;

export { CronJobPatchArgs } from "./cronJobPatch";
export type CronJobPatch = import("./cronJobPatch").CronJobPatch;
export const CronJobPatch: typeof import("./cronJobPatch").CronJobPatch = null as any;

utilities.lazyLoad(exports, ["CronJob"], () => require("./cronJob"));
utilities.lazyLoad(exports, ["CronJobList"], () => require("./cronJobList"));
utilities.lazyLoad(exports, ["CronJobPatch"], () => require("./cronJobPatch"));

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "kubernetes:batch/v1beta1:CronJob":
                return new CronJob(name, <any>undefined, { urn })
            case "kubernetes:batch/v1beta1:CronJobList":
                return new CronJobList(name, <any>undefined, { urn })
            case "kubernetes:batch/v1beta1:CronJobPatch":
                return new CronJobPatch(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("kubernetes", "batch/v1beta1", _module)
