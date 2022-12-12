// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SeccompProfile {
    /**
     * @return localhostProfile indicates a profile defined in a file on the node should be used. The profile must be preconfigured on the node to work. Must be a descending path, relative to the kubelet&#39;s configured seccomp profile location. Must only be set if type is &#34;Localhost&#34;.
     * 
     */
    private @Nullable String localhostProfile;
    /**
     * @return type indicates which kind of seccomp profile will be applied. Valid options are:
     * 
     * Localhost - a profile defined in a file on the node should be used. RuntimeDefault - the container runtime default profile should be used. Unconfined - no profile should be applied.
     * 
     */
    private String type;

    private SeccompProfile() {}
    /**
     * @return localhostProfile indicates a profile defined in a file on the node should be used. The profile must be preconfigured on the node to work. Must be a descending path, relative to the kubelet&#39;s configured seccomp profile location. Must only be set if type is &#34;Localhost&#34;.
     * 
     */
    public Optional<String> localhostProfile() {
        return Optional.ofNullable(this.localhostProfile);
    }
    /**
     * @return type indicates which kind of seccomp profile will be applied. Valid options are:
     * 
     * Localhost - a profile defined in a file on the node should be used. RuntimeDefault - the container runtime default profile should be used. Unconfined - no profile should be applied.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SeccompProfile defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String localhostProfile;
        private String type;
        public Builder() {}
        public Builder(SeccompProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localhostProfile = defaults.localhostProfile;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder localhostProfile(@Nullable String localhostProfile) {
            this.localhostProfile = localhostProfile;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public SeccompProfile build() {
            final var o = new SeccompProfile();
            o.localhostProfile = localhostProfile;
            o.type = type;
            return o;
        }
    }
}