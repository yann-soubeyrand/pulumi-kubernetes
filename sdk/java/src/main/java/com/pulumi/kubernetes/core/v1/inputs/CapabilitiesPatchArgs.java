// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Adds and removes POSIX capabilities from running containers.
 * 
 */
public final class CapabilitiesPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final CapabilitiesPatchArgs Empty = new CapabilitiesPatchArgs();

    /**
     * Added capabilities
     * 
     */
    @Import(name="add")
    private @Nullable Output<List<String>> add;

    /**
     * @return Added capabilities
     * 
     */
    public Optional<Output<List<String>>> add() {
        return Optional.ofNullable(this.add);
    }

    /**
     * Removed capabilities
     * 
     */
    @Import(name="drop")
    private @Nullable Output<List<String>> drop;

    /**
     * @return Removed capabilities
     * 
     */
    public Optional<Output<List<String>>> drop() {
        return Optional.ofNullable(this.drop);
    }

    private CapabilitiesPatchArgs() {}

    private CapabilitiesPatchArgs(CapabilitiesPatchArgs $) {
        this.add = $.add;
        this.drop = $.drop;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CapabilitiesPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CapabilitiesPatchArgs $;

        public Builder() {
            $ = new CapabilitiesPatchArgs();
        }

        public Builder(CapabilitiesPatchArgs defaults) {
            $ = new CapabilitiesPatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param add Added capabilities
         * 
         * @return builder
         * 
         */
        public Builder add(@Nullable Output<List<String>> add) {
            $.add = add;
            return this;
        }

        /**
         * @param add Added capabilities
         * 
         * @return builder
         * 
         */
        public Builder add(List<String> add) {
            return add(Output.of(add));
        }

        /**
         * @param add Added capabilities
         * 
         * @return builder
         * 
         */
        public Builder add(String... add) {
            return add(List.of(add));
        }

        /**
         * @param drop Removed capabilities
         * 
         * @return builder
         * 
         */
        public Builder drop(@Nullable Output<List<String>> drop) {
            $.drop = drop;
            return this;
        }

        /**
         * @param drop Removed capabilities
         * 
         * @return builder
         * 
         */
        public Builder drop(List<String> drop) {
            return drop(Output.of(drop));
        }

        /**
         * @param drop Removed capabilities
         * 
         * @return builder
         * 
         */
        public Builder drop(String... drop) {
            return drop(List.of(drop));
        }

        public CapabilitiesPatchArgs build() {
            return $;
        }
    }

}