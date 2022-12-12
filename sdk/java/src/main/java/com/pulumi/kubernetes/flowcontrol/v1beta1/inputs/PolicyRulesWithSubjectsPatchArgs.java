// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.flowcontrol.v1beta1.inputs.NonResourcePolicyRulePatchArgs;
import com.pulumi.kubernetes.flowcontrol.v1beta1.inputs.ResourcePolicyRulePatchArgs;
import com.pulumi.kubernetes.flowcontrol.v1beta1.inputs.SubjectPatchArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * PolicyRulesWithSubjects prescribes a test that applies to a request to an apiserver. The test considers the subject making the request, the verb being requested, and the resource to be acted upon. This PolicyRulesWithSubjects matches a request if and only if both (a) at least one member of subjects matches the request and (b) at least one member of resourceRules or nonResourceRules matches the request.
 * 
 */
public final class PolicyRulesWithSubjectsPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyRulesWithSubjectsPatchArgs Empty = new PolicyRulesWithSubjectsPatchArgs();

    /**
     * `nonResourceRules` is a list of NonResourcePolicyRules that identify matching requests according to their verb and the target non-resource URL.
     * 
     */
    @Import(name="nonResourceRules")
    private @Nullable Output<List<NonResourcePolicyRulePatchArgs>> nonResourceRules;

    /**
     * @return `nonResourceRules` is a list of NonResourcePolicyRules that identify matching requests according to their verb and the target non-resource URL.
     * 
     */
    public Optional<Output<List<NonResourcePolicyRulePatchArgs>>> nonResourceRules() {
        return Optional.ofNullable(this.nonResourceRules);
    }

    /**
     * `resourceRules` is a slice of ResourcePolicyRules that identify matching requests according to their verb and the target resource. At least one of `resourceRules` and `nonResourceRules` has to be non-empty.
     * 
     */
    @Import(name="resourceRules")
    private @Nullable Output<List<ResourcePolicyRulePatchArgs>> resourceRules;

    /**
     * @return `resourceRules` is a slice of ResourcePolicyRules that identify matching requests according to their verb and the target resource. At least one of `resourceRules` and `nonResourceRules` has to be non-empty.
     * 
     */
    public Optional<Output<List<ResourcePolicyRulePatchArgs>>> resourceRules() {
        return Optional.ofNullable(this.resourceRules);
    }

    /**
     * subjects is the list of normal user, serviceaccount, or group that this rule cares about. There must be at least one member in this slice. A slice that includes both the system:authenticated and system:unauthenticated user groups matches every request. Required.
     * 
     */
    @Import(name="subjects")
    private @Nullable Output<List<SubjectPatchArgs>> subjects;

    /**
     * @return subjects is the list of normal user, serviceaccount, or group that this rule cares about. There must be at least one member in this slice. A slice that includes both the system:authenticated and system:unauthenticated user groups matches every request. Required.
     * 
     */
    public Optional<Output<List<SubjectPatchArgs>>> subjects() {
        return Optional.ofNullable(this.subjects);
    }

    private PolicyRulesWithSubjectsPatchArgs() {}

    private PolicyRulesWithSubjectsPatchArgs(PolicyRulesWithSubjectsPatchArgs $) {
        this.nonResourceRules = $.nonResourceRules;
        this.resourceRules = $.resourceRules;
        this.subjects = $.subjects;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyRulesWithSubjectsPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyRulesWithSubjectsPatchArgs $;

        public Builder() {
            $ = new PolicyRulesWithSubjectsPatchArgs();
        }

        public Builder(PolicyRulesWithSubjectsPatchArgs defaults) {
            $ = new PolicyRulesWithSubjectsPatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nonResourceRules `nonResourceRules` is a list of NonResourcePolicyRules that identify matching requests according to their verb and the target non-resource URL.
         * 
         * @return builder
         * 
         */
        public Builder nonResourceRules(@Nullable Output<List<NonResourcePolicyRulePatchArgs>> nonResourceRules) {
            $.nonResourceRules = nonResourceRules;
            return this;
        }

        /**
         * @param nonResourceRules `nonResourceRules` is a list of NonResourcePolicyRules that identify matching requests according to their verb and the target non-resource URL.
         * 
         * @return builder
         * 
         */
        public Builder nonResourceRules(List<NonResourcePolicyRulePatchArgs> nonResourceRules) {
            return nonResourceRules(Output.of(nonResourceRules));
        }

        /**
         * @param nonResourceRules `nonResourceRules` is a list of NonResourcePolicyRules that identify matching requests according to their verb and the target non-resource URL.
         * 
         * @return builder
         * 
         */
        public Builder nonResourceRules(NonResourcePolicyRulePatchArgs... nonResourceRules) {
            return nonResourceRules(List.of(nonResourceRules));
        }

        /**
         * @param resourceRules `resourceRules` is a slice of ResourcePolicyRules that identify matching requests according to their verb and the target resource. At least one of `resourceRules` and `nonResourceRules` has to be non-empty.
         * 
         * @return builder
         * 
         */
        public Builder resourceRules(@Nullable Output<List<ResourcePolicyRulePatchArgs>> resourceRules) {
            $.resourceRules = resourceRules;
            return this;
        }

        /**
         * @param resourceRules `resourceRules` is a slice of ResourcePolicyRules that identify matching requests according to their verb and the target resource. At least one of `resourceRules` and `nonResourceRules` has to be non-empty.
         * 
         * @return builder
         * 
         */
        public Builder resourceRules(List<ResourcePolicyRulePatchArgs> resourceRules) {
            return resourceRules(Output.of(resourceRules));
        }

        /**
         * @param resourceRules `resourceRules` is a slice of ResourcePolicyRules that identify matching requests according to their verb and the target resource. At least one of `resourceRules` and `nonResourceRules` has to be non-empty.
         * 
         * @return builder
         * 
         */
        public Builder resourceRules(ResourcePolicyRulePatchArgs... resourceRules) {
            return resourceRules(List.of(resourceRules));
        }

        /**
         * @param subjects subjects is the list of normal user, serviceaccount, or group that this rule cares about. There must be at least one member in this slice. A slice that includes both the system:authenticated and system:unauthenticated user groups matches every request. Required.
         * 
         * @return builder
         * 
         */
        public Builder subjects(@Nullable Output<List<SubjectPatchArgs>> subjects) {
            $.subjects = subjects;
            return this;
        }

        /**
         * @param subjects subjects is the list of normal user, serviceaccount, or group that this rule cares about. There must be at least one member in this slice. A slice that includes both the system:authenticated and system:unauthenticated user groups matches every request. Required.
         * 
         * @return builder
         * 
         */
        public Builder subjects(List<SubjectPatchArgs> subjects) {
            return subjects(Output.of(subjects));
        }

        /**
         * @param subjects subjects is the list of normal user, serviceaccount, or group that this rule cares about. There must be at least one member in this slice. A slice that includes both the system:authenticated and system:unauthenticated user groups matches every request. Required.
         * 
         * @return builder
         * 
         */
        public Builder subjects(SubjectPatchArgs... subjects) {
            return subjects(List.of(subjects));
        }

        public PolicyRulesWithSubjectsPatchArgs build() {
            return $;
        }
    }

}