// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.authorization.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.authorization.v1beta1.outputs.NonResourceAttributes;
import com.pulumi.kubernetes.authorization.v1beta1.outputs.ResourceAttributes;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SelfSubjectAccessReviewSpec {
    /**
     * @return NonResourceAttributes describes information for a non-resource access request
     * 
     */
    private @Nullable NonResourceAttributes nonResourceAttributes;
    /**
     * @return ResourceAuthorizationAttributes describes information for a resource access request
     * 
     */
    private @Nullable ResourceAttributes resourceAttributes;

    private SelfSubjectAccessReviewSpec() {}
    /**
     * @return NonResourceAttributes describes information for a non-resource access request
     * 
     */
    public Optional<NonResourceAttributes> nonResourceAttributes() {
        return Optional.ofNullable(this.nonResourceAttributes);
    }
    /**
     * @return ResourceAuthorizationAttributes describes information for a resource access request
     * 
     */
    public Optional<ResourceAttributes> resourceAttributes() {
        return Optional.ofNullable(this.resourceAttributes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SelfSubjectAccessReviewSpec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable NonResourceAttributes nonResourceAttributes;
        private @Nullable ResourceAttributes resourceAttributes;
        public Builder() {}
        public Builder(SelfSubjectAccessReviewSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nonResourceAttributes = defaults.nonResourceAttributes;
    	      this.resourceAttributes = defaults.resourceAttributes;
        }

        @CustomType.Setter
        public Builder nonResourceAttributes(@Nullable NonResourceAttributes nonResourceAttributes) {
            this.nonResourceAttributes = nonResourceAttributes;
            return this;
        }
        @CustomType.Setter
        public Builder resourceAttributes(@Nullable ResourceAttributes resourceAttributes) {
            this.resourceAttributes = resourceAttributes;
            return this;
        }
        public SelfSubjectAccessReviewSpec build() {
            final var o = new SelfSubjectAccessReviewSpec();
            o.nonResourceAttributes = nonResourceAttributes;
            o.resourceAttributes = resourceAttributes;
            return o;
        }
    }
}
