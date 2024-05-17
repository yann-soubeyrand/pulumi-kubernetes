// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.admissionregistration.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.admissionregistration.v1.inputs.AuditAnnotationPatchArgs;
import com.pulumi.kubernetes.admissionregistration.v1.inputs.MatchConditionPatchArgs;
import com.pulumi.kubernetes.admissionregistration.v1.inputs.MatchResourcesPatchArgs;
import com.pulumi.kubernetes.admissionregistration.v1.inputs.ParamKindPatchArgs;
import com.pulumi.kubernetes.admissionregistration.v1.inputs.ValidationPatchArgs;
import com.pulumi.kubernetes.admissionregistration.v1.inputs.VariablePatchArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ValidatingAdmissionPolicySpec is the specification of the desired behavior of the AdmissionPolicy.
 * 
 */
public final class ValidatingAdmissionPolicySpecPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final ValidatingAdmissionPolicySpecPatchArgs Empty = new ValidatingAdmissionPolicySpecPatchArgs();

    /**
     * auditAnnotations contains CEL expressions which are used to produce audit annotations for the audit event of the API request. validations and auditAnnotations may not both be empty; a least one of validations or auditAnnotations is required.
     * 
     */
    @Import(name="auditAnnotations")
    private @Nullable Output<List<AuditAnnotationPatchArgs>> auditAnnotations;

    /**
     * @return auditAnnotations contains CEL expressions which are used to produce audit annotations for the audit event of the API request. validations and auditAnnotations may not both be empty; a least one of validations or auditAnnotations is required.
     * 
     */
    public Optional<Output<List<AuditAnnotationPatchArgs>>> auditAnnotations() {
        return Optional.ofNullable(this.auditAnnotations);
    }

    /**
     * failurePolicy defines how to handle failures for the admission policy. Failures can occur from CEL expression parse errors, type check errors, runtime errors and invalid or mis-configured policy definitions or bindings.
     * 
     * A policy is invalid if spec.paramKind refers to a non-existent Kind. A binding is invalid if spec.paramRef.name refers to a non-existent resource.
     * 
     * failurePolicy does not define how validations that evaluate to false are handled.
     * 
     * When failurePolicy is set to Fail, ValidatingAdmissionPolicyBinding validationActions define how failures are enforced.
     * 
     * Allowed values are Ignore or Fail. Defaults to Fail.
     * 
     */
    @Import(name="failurePolicy")
    private @Nullable Output<String> failurePolicy;

    /**
     * @return failurePolicy defines how to handle failures for the admission policy. Failures can occur from CEL expression parse errors, type check errors, runtime errors and invalid or mis-configured policy definitions or bindings.
     * 
     * A policy is invalid if spec.paramKind refers to a non-existent Kind. A binding is invalid if spec.paramRef.name refers to a non-existent resource.
     * 
     * failurePolicy does not define how validations that evaluate to false are handled.
     * 
     * When failurePolicy is set to Fail, ValidatingAdmissionPolicyBinding validationActions define how failures are enforced.
     * 
     * Allowed values are Ignore or Fail. Defaults to Fail.
     * 
     */
    public Optional<Output<String>> failurePolicy() {
        return Optional.ofNullable(this.failurePolicy);
    }

    /**
     * MatchConditions is a list of conditions that must be met for a request to be validated. Match conditions filter requests that have already been matched by the rules, namespaceSelector, and objectSelector. An empty list of matchConditions matches all requests. There are a maximum of 64 match conditions allowed.
     * 
     * If a parameter object is provided, it can be accessed via the `params` handle in the same manner as validation expressions.
     * 
     * The exact matching logic is (in order):
     *   1. If ANY matchCondition evaluates to FALSE, the policy is skipped.
     *   2. If ALL matchConditions evaluate to TRUE, the policy is evaluated.
     *   3. If any matchCondition evaluates to an error (but none are FALSE):
     *      - If failurePolicy=Fail, reject the request
     *      - If failurePolicy=Ignore, the policy is skipped
     * 
     */
    @Import(name="matchConditions")
    private @Nullable Output<List<MatchConditionPatchArgs>> matchConditions;

    /**
     * @return MatchConditions is a list of conditions that must be met for a request to be validated. Match conditions filter requests that have already been matched by the rules, namespaceSelector, and objectSelector. An empty list of matchConditions matches all requests. There are a maximum of 64 match conditions allowed.
     * 
     * If a parameter object is provided, it can be accessed via the `params` handle in the same manner as validation expressions.
     * 
     * The exact matching logic is (in order):
     *   1. If ANY matchCondition evaluates to FALSE, the policy is skipped.
     *   2. If ALL matchConditions evaluate to TRUE, the policy is evaluated.
     *   3. If any matchCondition evaluates to an error (but none are FALSE):
     *      - If failurePolicy=Fail, reject the request
     *      - If failurePolicy=Ignore, the policy is skipped
     * 
     */
    public Optional<Output<List<MatchConditionPatchArgs>>> matchConditions() {
        return Optional.ofNullable(this.matchConditions);
    }

    /**
     * MatchConstraints specifies what resources this policy is designed to validate. The AdmissionPolicy cares about a request if it matches _all_ Constraints. However, in order to prevent clusters from being put into an unstable state that cannot be recovered from via the API ValidatingAdmissionPolicy cannot match ValidatingAdmissionPolicy and ValidatingAdmissionPolicyBinding. Required.
     * 
     */
    @Import(name="matchConstraints")
    private @Nullable Output<MatchResourcesPatchArgs> matchConstraints;

    /**
     * @return MatchConstraints specifies what resources this policy is designed to validate. The AdmissionPolicy cares about a request if it matches _all_ Constraints. However, in order to prevent clusters from being put into an unstable state that cannot be recovered from via the API ValidatingAdmissionPolicy cannot match ValidatingAdmissionPolicy and ValidatingAdmissionPolicyBinding. Required.
     * 
     */
    public Optional<Output<MatchResourcesPatchArgs>> matchConstraints() {
        return Optional.ofNullable(this.matchConstraints);
    }

    /**
     * ParamKind specifies the kind of resources used to parameterize this policy. If absent, there are no parameters for this policy and the param CEL variable will not be provided to validation expressions. If ParamKind refers to a non-existent kind, this policy definition is mis-configured and the FailurePolicy is applied. If paramKind is specified but paramRef is unset in ValidatingAdmissionPolicyBinding, the params variable will be null.
     * 
     */
    @Import(name="paramKind")
    private @Nullable Output<ParamKindPatchArgs> paramKind;

    /**
     * @return ParamKind specifies the kind of resources used to parameterize this policy. If absent, there are no parameters for this policy and the param CEL variable will not be provided to validation expressions. If ParamKind refers to a non-existent kind, this policy definition is mis-configured and the FailurePolicy is applied. If paramKind is specified but paramRef is unset in ValidatingAdmissionPolicyBinding, the params variable will be null.
     * 
     */
    public Optional<Output<ParamKindPatchArgs>> paramKind() {
        return Optional.ofNullable(this.paramKind);
    }

    /**
     * Validations contain CEL expressions which is used to apply the validation. Validations and AuditAnnotations may not both be empty; a minimum of one Validations or AuditAnnotations is required.
     * 
     */
    @Import(name="validations")
    private @Nullable Output<List<ValidationPatchArgs>> validations;

    /**
     * @return Validations contain CEL expressions which is used to apply the validation. Validations and AuditAnnotations may not both be empty; a minimum of one Validations or AuditAnnotations is required.
     * 
     */
    public Optional<Output<List<ValidationPatchArgs>>> validations() {
        return Optional.ofNullable(this.validations);
    }

    /**
     * Variables contain definitions of variables that can be used in composition of other expressions. Each variable is defined as a named CEL expression. The variables defined here will be available under `variables` in other expressions of the policy except MatchConditions because MatchConditions are evaluated before the rest of the policy.
     * 
     * The expression of a variable can refer to other variables defined earlier in the list but not those after. Thus, Variables must be sorted by the order of first appearance and acyclic.
     * 
     */
    @Import(name="variables")
    private @Nullable Output<List<VariablePatchArgs>> variables;

    /**
     * @return Variables contain definitions of variables that can be used in composition of other expressions. Each variable is defined as a named CEL expression. The variables defined here will be available under `variables` in other expressions of the policy except MatchConditions because MatchConditions are evaluated before the rest of the policy.
     * 
     * The expression of a variable can refer to other variables defined earlier in the list but not those after. Thus, Variables must be sorted by the order of first appearance and acyclic.
     * 
     */
    public Optional<Output<List<VariablePatchArgs>>> variables() {
        return Optional.ofNullable(this.variables);
    }

    private ValidatingAdmissionPolicySpecPatchArgs() {}

    private ValidatingAdmissionPolicySpecPatchArgs(ValidatingAdmissionPolicySpecPatchArgs $) {
        this.auditAnnotations = $.auditAnnotations;
        this.failurePolicy = $.failurePolicy;
        this.matchConditions = $.matchConditions;
        this.matchConstraints = $.matchConstraints;
        this.paramKind = $.paramKind;
        this.validations = $.validations;
        this.variables = $.variables;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ValidatingAdmissionPolicySpecPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ValidatingAdmissionPolicySpecPatchArgs $;

        public Builder() {
            $ = new ValidatingAdmissionPolicySpecPatchArgs();
        }

        public Builder(ValidatingAdmissionPolicySpecPatchArgs defaults) {
            $ = new ValidatingAdmissionPolicySpecPatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param auditAnnotations auditAnnotations contains CEL expressions which are used to produce audit annotations for the audit event of the API request. validations and auditAnnotations may not both be empty; a least one of validations or auditAnnotations is required.
         * 
         * @return builder
         * 
         */
        public Builder auditAnnotations(@Nullable Output<List<AuditAnnotationPatchArgs>> auditAnnotations) {
            $.auditAnnotations = auditAnnotations;
            return this;
        }

        /**
         * @param auditAnnotations auditAnnotations contains CEL expressions which are used to produce audit annotations for the audit event of the API request. validations and auditAnnotations may not both be empty; a least one of validations or auditAnnotations is required.
         * 
         * @return builder
         * 
         */
        public Builder auditAnnotations(List<AuditAnnotationPatchArgs> auditAnnotations) {
            return auditAnnotations(Output.of(auditAnnotations));
        }

        /**
         * @param auditAnnotations auditAnnotations contains CEL expressions which are used to produce audit annotations for the audit event of the API request. validations and auditAnnotations may not both be empty; a least one of validations or auditAnnotations is required.
         * 
         * @return builder
         * 
         */
        public Builder auditAnnotations(AuditAnnotationPatchArgs... auditAnnotations) {
            return auditAnnotations(List.of(auditAnnotations));
        }

        /**
         * @param failurePolicy failurePolicy defines how to handle failures for the admission policy. Failures can occur from CEL expression parse errors, type check errors, runtime errors and invalid or mis-configured policy definitions or bindings.
         * 
         * A policy is invalid if spec.paramKind refers to a non-existent Kind. A binding is invalid if spec.paramRef.name refers to a non-existent resource.
         * 
         * failurePolicy does not define how validations that evaluate to false are handled.
         * 
         * When failurePolicy is set to Fail, ValidatingAdmissionPolicyBinding validationActions define how failures are enforced.
         * 
         * Allowed values are Ignore or Fail. Defaults to Fail.
         * 
         * @return builder
         * 
         */
        public Builder failurePolicy(@Nullable Output<String> failurePolicy) {
            $.failurePolicy = failurePolicy;
            return this;
        }

        /**
         * @param failurePolicy failurePolicy defines how to handle failures for the admission policy. Failures can occur from CEL expression parse errors, type check errors, runtime errors and invalid or mis-configured policy definitions or bindings.
         * 
         * A policy is invalid if spec.paramKind refers to a non-existent Kind. A binding is invalid if spec.paramRef.name refers to a non-existent resource.
         * 
         * failurePolicy does not define how validations that evaluate to false are handled.
         * 
         * When failurePolicy is set to Fail, ValidatingAdmissionPolicyBinding validationActions define how failures are enforced.
         * 
         * Allowed values are Ignore or Fail. Defaults to Fail.
         * 
         * @return builder
         * 
         */
        public Builder failurePolicy(String failurePolicy) {
            return failurePolicy(Output.of(failurePolicy));
        }

        /**
         * @param matchConditions MatchConditions is a list of conditions that must be met for a request to be validated. Match conditions filter requests that have already been matched by the rules, namespaceSelector, and objectSelector. An empty list of matchConditions matches all requests. There are a maximum of 64 match conditions allowed.
         * 
         * If a parameter object is provided, it can be accessed via the `params` handle in the same manner as validation expressions.
         * 
         * The exact matching logic is (in order):
         *   1. If ANY matchCondition evaluates to FALSE, the policy is skipped.
         *   2. If ALL matchConditions evaluate to TRUE, the policy is evaluated.
         *   3. If any matchCondition evaluates to an error (but none are FALSE):
         *      - If failurePolicy=Fail, reject the request
         *      - If failurePolicy=Ignore, the policy is skipped
         * 
         * @return builder
         * 
         */
        public Builder matchConditions(@Nullable Output<List<MatchConditionPatchArgs>> matchConditions) {
            $.matchConditions = matchConditions;
            return this;
        }

        /**
         * @param matchConditions MatchConditions is a list of conditions that must be met for a request to be validated. Match conditions filter requests that have already been matched by the rules, namespaceSelector, and objectSelector. An empty list of matchConditions matches all requests. There are a maximum of 64 match conditions allowed.
         * 
         * If a parameter object is provided, it can be accessed via the `params` handle in the same manner as validation expressions.
         * 
         * The exact matching logic is (in order):
         *   1. If ANY matchCondition evaluates to FALSE, the policy is skipped.
         *   2. If ALL matchConditions evaluate to TRUE, the policy is evaluated.
         *   3. If any matchCondition evaluates to an error (but none are FALSE):
         *      - If failurePolicy=Fail, reject the request
         *      - If failurePolicy=Ignore, the policy is skipped
         * 
         * @return builder
         * 
         */
        public Builder matchConditions(List<MatchConditionPatchArgs> matchConditions) {
            return matchConditions(Output.of(matchConditions));
        }

        /**
         * @param matchConditions MatchConditions is a list of conditions that must be met for a request to be validated. Match conditions filter requests that have already been matched by the rules, namespaceSelector, and objectSelector. An empty list of matchConditions matches all requests. There are a maximum of 64 match conditions allowed.
         * 
         * If a parameter object is provided, it can be accessed via the `params` handle in the same manner as validation expressions.
         * 
         * The exact matching logic is (in order):
         *   1. If ANY matchCondition evaluates to FALSE, the policy is skipped.
         *   2. If ALL matchConditions evaluate to TRUE, the policy is evaluated.
         *   3. If any matchCondition evaluates to an error (but none are FALSE):
         *      - If failurePolicy=Fail, reject the request
         *      - If failurePolicy=Ignore, the policy is skipped
         * 
         * @return builder
         * 
         */
        public Builder matchConditions(MatchConditionPatchArgs... matchConditions) {
            return matchConditions(List.of(matchConditions));
        }

        /**
         * @param matchConstraints MatchConstraints specifies what resources this policy is designed to validate. The AdmissionPolicy cares about a request if it matches _all_ Constraints. However, in order to prevent clusters from being put into an unstable state that cannot be recovered from via the API ValidatingAdmissionPolicy cannot match ValidatingAdmissionPolicy and ValidatingAdmissionPolicyBinding. Required.
         * 
         * @return builder
         * 
         */
        public Builder matchConstraints(@Nullable Output<MatchResourcesPatchArgs> matchConstraints) {
            $.matchConstraints = matchConstraints;
            return this;
        }

        /**
         * @param matchConstraints MatchConstraints specifies what resources this policy is designed to validate. The AdmissionPolicy cares about a request if it matches _all_ Constraints. However, in order to prevent clusters from being put into an unstable state that cannot be recovered from via the API ValidatingAdmissionPolicy cannot match ValidatingAdmissionPolicy and ValidatingAdmissionPolicyBinding. Required.
         * 
         * @return builder
         * 
         */
        public Builder matchConstraints(MatchResourcesPatchArgs matchConstraints) {
            return matchConstraints(Output.of(matchConstraints));
        }

        /**
         * @param paramKind ParamKind specifies the kind of resources used to parameterize this policy. If absent, there are no parameters for this policy and the param CEL variable will not be provided to validation expressions. If ParamKind refers to a non-existent kind, this policy definition is mis-configured and the FailurePolicy is applied. If paramKind is specified but paramRef is unset in ValidatingAdmissionPolicyBinding, the params variable will be null.
         * 
         * @return builder
         * 
         */
        public Builder paramKind(@Nullable Output<ParamKindPatchArgs> paramKind) {
            $.paramKind = paramKind;
            return this;
        }

        /**
         * @param paramKind ParamKind specifies the kind of resources used to parameterize this policy. If absent, there are no parameters for this policy and the param CEL variable will not be provided to validation expressions. If ParamKind refers to a non-existent kind, this policy definition is mis-configured and the FailurePolicy is applied. If paramKind is specified but paramRef is unset in ValidatingAdmissionPolicyBinding, the params variable will be null.
         * 
         * @return builder
         * 
         */
        public Builder paramKind(ParamKindPatchArgs paramKind) {
            return paramKind(Output.of(paramKind));
        }

        /**
         * @param validations Validations contain CEL expressions which is used to apply the validation. Validations and AuditAnnotations may not both be empty; a minimum of one Validations or AuditAnnotations is required.
         * 
         * @return builder
         * 
         */
        public Builder validations(@Nullable Output<List<ValidationPatchArgs>> validations) {
            $.validations = validations;
            return this;
        }

        /**
         * @param validations Validations contain CEL expressions which is used to apply the validation. Validations and AuditAnnotations may not both be empty; a minimum of one Validations or AuditAnnotations is required.
         * 
         * @return builder
         * 
         */
        public Builder validations(List<ValidationPatchArgs> validations) {
            return validations(Output.of(validations));
        }

        /**
         * @param validations Validations contain CEL expressions which is used to apply the validation. Validations and AuditAnnotations may not both be empty; a minimum of one Validations or AuditAnnotations is required.
         * 
         * @return builder
         * 
         */
        public Builder validations(ValidationPatchArgs... validations) {
            return validations(List.of(validations));
        }

        /**
         * @param variables Variables contain definitions of variables that can be used in composition of other expressions. Each variable is defined as a named CEL expression. The variables defined here will be available under `variables` in other expressions of the policy except MatchConditions because MatchConditions are evaluated before the rest of the policy.
         * 
         * The expression of a variable can refer to other variables defined earlier in the list but not those after. Thus, Variables must be sorted by the order of first appearance and acyclic.
         * 
         * @return builder
         * 
         */
        public Builder variables(@Nullable Output<List<VariablePatchArgs>> variables) {
            $.variables = variables;
            return this;
        }

        /**
         * @param variables Variables contain definitions of variables that can be used in composition of other expressions. Each variable is defined as a named CEL expression. The variables defined here will be available under `variables` in other expressions of the policy except MatchConditions because MatchConditions are evaluated before the rest of the policy.
         * 
         * The expression of a variable can refer to other variables defined earlier in the list but not those after. Thus, Variables must be sorted by the order of first appearance and acyclic.
         * 
         * @return builder
         * 
         */
        public Builder variables(List<VariablePatchArgs> variables) {
            return variables(Output.of(variables));
        }

        /**
         * @param variables Variables contain definitions of variables that can be used in composition of other expressions. Each variable is defined as a named CEL expression. The variables defined here will be available under `variables` in other expressions of the policy except MatchConditions because MatchConditions are evaluated before the rest of the policy.
         * 
         * The expression of a variable can refer to other variables defined earlier in the list but not those after. Thus, Variables must be sorted by the order of first appearance and acyclic.
         * 
         * @return builder
         * 
         */
        public Builder variables(VariablePatchArgs... variables) {
            return variables(List.of(variables));
        }

        public ValidatingAdmissionPolicySpecPatchArgs build() {
            return $;
        }
    }

}