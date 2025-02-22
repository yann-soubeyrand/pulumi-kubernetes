// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apiextensions.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.apiextensions.v1.outputs.WebhookConversion;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CustomResourceConversion {
    /**
     * @return strategy specifies how custom resources are converted between versions. Allowed values are: - `None`: The converter only change the apiVersion and would not touch any other field in the custom resource. - `Webhook`: API Server will call to an external webhook to do the conversion. Additional information
     *   is needed for this option. This requires spec.preserveUnknownFields to be false, and spec.conversion.webhook to be set.
     * 
     */
    private String strategy;
    /**
     * @return webhook describes how to call the conversion webhook. Required when `strategy` is set to `Webhook`.
     * 
     */
    private @Nullable WebhookConversion webhook;

    private CustomResourceConversion() {}
    /**
     * @return strategy specifies how custom resources are converted between versions. Allowed values are: - `None`: The converter only change the apiVersion and would not touch any other field in the custom resource. - `Webhook`: API Server will call to an external webhook to do the conversion. Additional information
     *   is needed for this option. This requires spec.preserveUnknownFields to be false, and spec.conversion.webhook to be set.
     * 
     */
    public String strategy() {
        return this.strategy;
    }
    /**
     * @return webhook describes how to call the conversion webhook. Required when `strategy` is set to `Webhook`.
     * 
     */
    public Optional<WebhookConversion> webhook() {
        return Optional.ofNullable(this.webhook);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomResourceConversion defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String strategy;
        private @Nullable WebhookConversion webhook;
        public Builder() {}
        public Builder(CustomResourceConversion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.strategy = defaults.strategy;
    	      this.webhook = defaults.webhook;
        }

        @CustomType.Setter
        public Builder strategy(String strategy) {
            this.strategy = Objects.requireNonNull(strategy);
            return this;
        }
        @CustomType.Setter
        public Builder webhook(@Nullable WebhookConversion webhook) {
            this.webhook = webhook;
            return this;
        }
        public CustomResourceConversion build() {
            final var o = new CustomResourceConversion();
            o.strategy = strategy;
            o.webhook = webhook;
            return o;
        }
    }
}
