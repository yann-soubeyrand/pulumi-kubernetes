// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apiextensions.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceReference {
    /**
     * @return name is the name of the service. Required
     * 
     */
    private String name;
    /**
     * @return namespace is the namespace of the service. Required
     * 
     */
    private String namespace;
    /**
     * @return path is an optional URL path at which the webhook will be contacted.
     * 
     */
    private @Nullable String path;
    /**
     * @return port is an optional service port at which the webhook will be contacted. `port` should be a valid port number (1-65535, inclusive). Defaults to 443 for backward compatibility.
     * 
     */
    private @Nullable Integer port;

    private ServiceReference() {}
    /**
     * @return name is the name of the service. Required
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return namespace is the namespace of the service. Required
     * 
     */
    public String namespace() {
        return this.namespace;
    }
    /**
     * @return path is an optional URL path at which the webhook will be contacted.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * @return port is an optional service port at which the webhook will be contacted. `port` should be a valid port number (1-65535, inclusive). Defaults to 443 for backward compatibility.
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceReference defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String namespace;
        private @Nullable String path;
        private @Nullable Integer port;
        public Builder() {}
        public Builder(ServiceReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder namespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }
        @CustomType.Setter
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }
        public ServiceReference build() {
            final var o = new ServiceReference();
            o.name = name;
            o.namespace = namespace;
            o.path = path;
            o.port = port;
            return o;
        }
    }
}