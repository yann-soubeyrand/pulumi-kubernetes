// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PersistentVolumeClaimCondition {
    /**
     * @return lastProbeTime is the time we probed the condition.
     * 
     */
    private @Nullable String lastProbeTime;
    /**
     * @return lastTransitionTime is the time the condition transitioned from one status to another.
     * 
     */
    private @Nullable String lastTransitionTime;
    /**
     * @return message is the human-readable message indicating details about last transition.
     * 
     */
    private @Nullable String message;
    /**
     * @return reason is a unique, this should be a short, machine understandable string that gives the reason for condition&#39;s last transition. If it reports &#34;ResizeStarted&#34; that means the underlying persistent volume is being resized.
     * 
     */
    private @Nullable String reason;
    private String status;
    private String type;

    private PersistentVolumeClaimCondition() {}
    /**
     * @return lastProbeTime is the time we probed the condition.
     * 
     */
    public Optional<String> lastProbeTime() {
        return Optional.ofNullable(this.lastProbeTime);
    }
    /**
     * @return lastTransitionTime is the time the condition transitioned from one status to another.
     * 
     */
    public Optional<String> lastTransitionTime() {
        return Optional.ofNullable(this.lastTransitionTime);
    }
    /**
     * @return message is the human-readable message indicating details about last transition.
     * 
     */
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }
    /**
     * @return reason is a unique, this should be a short, machine understandable string that gives the reason for condition&#39;s last transition. If it reports &#34;ResizeStarted&#34; that means the underlying persistent volume is being resized.
     * 
     */
    public Optional<String> reason() {
        return Optional.ofNullable(this.reason);
    }
    public String status() {
        return this.status;
    }
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PersistentVolumeClaimCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String lastProbeTime;
        private @Nullable String lastTransitionTime;
        private @Nullable String message;
        private @Nullable String reason;
        private String status;
        private String type;
        public Builder() {}
        public Builder(PersistentVolumeClaimCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastProbeTime = defaults.lastProbeTime;
    	      this.lastTransitionTime = defaults.lastTransitionTime;
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder lastProbeTime(@Nullable String lastProbeTime) {
            this.lastProbeTime = lastProbeTime;
            return this;
        }
        @CustomType.Setter
        public Builder lastTransitionTime(@Nullable String lastTransitionTime) {
            this.lastTransitionTime = lastTransitionTime;
            return this;
        }
        @CustomType.Setter
        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }
        @CustomType.Setter
        public Builder reason(@Nullable String reason) {
            this.reason = reason;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public PersistentVolumeClaimCondition build() {
            final var o = new PersistentVolumeClaimCondition();
            o.lastProbeTime = lastProbeTime;
            o.lastTransitionTime = lastTransitionTime;
            o.message = message;
            o.reason = reason;
            o.status = status;
            o.type = type;
            return o;
        }
    }
}