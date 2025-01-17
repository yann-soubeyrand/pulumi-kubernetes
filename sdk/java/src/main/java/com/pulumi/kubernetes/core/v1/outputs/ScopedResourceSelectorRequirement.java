// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ScopedResourceSelectorRequirement {
    /**
     * @return Represents a scope&#39;s relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist.
     * 
     */
    private String operator;
    /**
     * @return The name of the scope that the selector applies to.
     * 
     */
    private String scopeName;
    /**
     * @return An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.
     * 
     */
    private @Nullable List<String> values;

    private ScopedResourceSelectorRequirement() {}
    /**
     * @return Represents a scope&#39;s relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist.
     * 
     */
    public String operator() {
        return this.operator;
    }
    /**
     * @return The name of the scope that the selector applies to.
     * 
     */
    public String scopeName() {
        return this.scopeName;
    }
    /**
     * @return An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.
     * 
     */
    public List<String> values() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScopedResourceSelectorRequirement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String operator;
        private String scopeName;
        private @Nullable List<String> values;
        public Builder() {}
        public Builder(ScopedResourceSelectorRequirement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operator = defaults.operator;
    	      this.scopeName = defaults.scopeName;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder operator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }
        @CustomType.Setter
        public Builder scopeName(String scopeName) {
            this.scopeName = Objects.requireNonNull(scopeName);
            return this;
        }
        @CustomType.Setter
        public Builder values(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }
        public ScopedResourceSelectorRequirement build() {
            final var o = new ScopedResourceSelectorRequirement();
            o.operator = operator;
            o.scopeName = scopeName;
            o.values = values;
            return o;
        }
    }
}
