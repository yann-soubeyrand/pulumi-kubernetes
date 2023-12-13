// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.flowcontrol.v1.outputs.FlowDistinguisherMethod;
import com.pulumi.kubernetes.flowcontrol.v1.outputs.PolicyRulesWithSubjects;
import com.pulumi.kubernetes.flowcontrol.v1.outputs.PriorityLevelConfigurationReference;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlowSchemaSpec {
    /**
     * @return `distinguisherMethod` defines how to compute the flow distinguisher for requests that match this schema. `nil` specifies that the distinguisher is disabled and thus will always be the empty string.
     * 
     */
    private @Nullable FlowDistinguisherMethod distinguisherMethod;
    /**
     * @return `matchingPrecedence` is used to choose among the FlowSchemas that match a given request. The chosen FlowSchema is among those with the numerically lowest (which we take to be logically highest) MatchingPrecedence.  Each MatchingPrecedence value must be ranged in [1,10000]. Note that if the precedence is not specified, it will be set to 1000 as default.
     * 
     */
    private @Nullable Integer matchingPrecedence;
    /**
     * @return `priorityLevelConfiguration` should reference a PriorityLevelConfiguration in the cluster. If the reference cannot be resolved, the FlowSchema will be ignored and marked as invalid in its status. Required.
     * 
     */
    private PriorityLevelConfigurationReference priorityLevelConfiguration;
    /**
     * @return `rules` describes which requests will match this flow schema. This FlowSchema matches a request if and only if at least one member of rules matches the request. if it is an empty slice, there will be no requests matching the FlowSchema.
     * 
     */
    private @Nullable List<PolicyRulesWithSubjects> rules;

    private FlowSchemaSpec() {}
    /**
     * @return `distinguisherMethod` defines how to compute the flow distinguisher for requests that match this schema. `nil` specifies that the distinguisher is disabled and thus will always be the empty string.
     * 
     */
    public Optional<FlowDistinguisherMethod> distinguisherMethod() {
        return Optional.ofNullable(this.distinguisherMethod);
    }
    /**
     * @return `matchingPrecedence` is used to choose among the FlowSchemas that match a given request. The chosen FlowSchema is among those with the numerically lowest (which we take to be logically highest) MatchingPrecedence.  Each MatchingPrecedence value must be ranged in [1,10000]. Note that if the precedence is not specified, it will be set to 1000 as default.
     * 
     */
    public Optional<Integer> matchingPrecedence() {
        return Optional.ofNullable(this.matchingPrecedence);
    }
    /**
     * @return `priorityLevelConfiguration` should reference a PriorityLevelConfiguration in the cluster. If the reference cannot be resolved, the FlowSchema will be ignored and marked as invalid in its status. Required.
     * 
     */
    public PriorityLevelConfigurationReference priorityLevelConfiguration() {
        return this.priorityLevelConfiguration;
    }
    /**
     * @return `rules` describes which requests will match this flow schema. This FlowSchema matches a request if and only if at least one member of rules matches the request. if it is an empty slice, there will be no requests matching the FlowSchema.
     * 
     */
    public List<PolicyRulesWithSubjects> rules() {
        return this.rules == null ? List.of() : this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowSchemaSpec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable FlowDistinguisherMethod distinguisherMethod;
        private @Nullable Integer matchingPrecedence;
        private PriorityLevelConfigurationReference priorityLevelConfiguration;
        private @Nullable List<PolicyRulesWithSubjects> rules;
        public Builder() {}
        public Builder(FlowSchemaSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distinguisherMethod = defaults.distinguisherMethod;
    	      this.matchingPrecedence = defaults.matchingPrecedence;
    	      this.priorityLevelConfiguration = defaults.priorityLevelConfiguration;
    	      this.rules = defaults.rules;
        }

        @CustomType.Setter
        public Builder distinguisherMethod(@Nullable FlowDistinguisherMethod distinguisherMethod) {
            this.distinguisherMethod = distinguisherMethod;
            return this;
        }
        @CustomType.Setter
        public Builder matchingPrecedence(@Nullable Integer matchingPrecedence) {
            this.matchingPrecedence = matchingPrecedence;
            return this;
        }
        @CustomType.Setter
        public Builder priorityLevelConfiguration(PriorityLevelConfigurationReference priorityLevelConfiguration) {
            this.priorityLevelConfiguration = Objects.requireNonNull(priorityLevelConfiguration);
            return this;
        }
        @CustomType.Setter
        public Builder rules(@Nullable List<PolicyRulesWithSubjects> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(PolicyRulesWithSubjects... rules) {
            return rules(List.of(rules));
        }
        public FlowSchemaSpec build() {
            final var o = new FlowSchemaSpec();
            o.distinguisherMethod = distinguisherMethod;
            o.matchingPrecedence = matchingPrecedence;
            o.priorityLevelConfiguration = priorityLevelConfiguration;
            o.rules = rules;
            return o;
        }
    }
}