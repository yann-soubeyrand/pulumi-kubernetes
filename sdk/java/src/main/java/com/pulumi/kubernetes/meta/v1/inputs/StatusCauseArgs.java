// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.meta.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * StatusCause provides more information about an api.Status failure, including cases when multiple errors are encountered.
 * 
 */
public final class StatusCauseArgs extends com.pulumi.resources.ResourceArgs {

    public static final StatusCauseArgs Empty = new StatusCauseArgs();

    /**
     * The field of the resource that has caused this error, as named by its JSON serialization. May include dot and postfix notation for nested attributes. Arrays are zero-indexed.  Fields may appear more than once in an array of causes due to fields having multiple errors. Optional.
     * 
     * Examples:
     *   &#34;name&#34; - the field &#34;name&#34; on the current resource
     *   &#34;items[0].name&#34; - the field &#34;name&#34; on the first array entry in &#34;items&#34;
     * 
     */
    @Import(name="field")
    private @Nullable Output<String> field;

    /**
     * @return The field of the resource that has caused this error, as named by its JSON serialization. May include dot and postfix notation for nested attributes. Arrays are zero-indexed.  Fields may appear more than once in an array of causes due to fields having multiple errors. Optional.
     * 
     * Examples:
     *   &#34;name&#34; - the field &#34;name&#34; on the current resource
     *   &#34;items[0].name&#34; - the field &#34;name&#34; on the first array entry in &#34;items&#34;
     * 
     */
    public Optional<Output<String>> field() {
        return Optional.ofNullable(this.field);
    }

    /**
     * A human-readable description of the cause of the error.  This field may be presented as-is to a reader.
     * 
     */
    @Import(name="message")
    private @Nullable Output<String> message;

    /**
     * @return A human-readable description of the cause of the error.  This field may be presented as-is to a reader.
     * 
     */
    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    /**
     * A machine-readable description of the cause of the error. If this value is empty there is no information available.
     * 
     */
    @Import(name="reason")
    private @Nullable Output<String> reason;

    /**
     * @return A machine-readable description of the cause of the error. If this value is empty there is no information available.
     * 
     */
    public Optional<Output<String>> reason() {
        return Optional.ofNullable(this.reason);
    }

    private StatusCauseArgs() {}

    private StatusCauseArgs(StatusCauseArgs $) {
        this.field = $.field;
        this.message = $.message;
        this.reason = $.reason;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StatusCauseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StatusCauseArgs $;

        public Builder() {
            $ = new StatusCauseArgs();
        }

        public Builder(StatusCauseArgs defaults) {
            $ = new StatusCauseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param field The field of the resource that has caused this error, as named by its JSON serialization. May include dot and postfix notation for nested attributes. Arrays are zero-indexed.  Fields may appear more than once in an array of causes due to fields having multiple errors. Optional.
         * 
         * Examples:
         *   &#34;name&#34; - the field &#34;name&#34; on the current resource
         *   &#34;items[0].name&#34; - the field &#34;name&#34; on the first array entry in &#34;items&#34;
         * 
         * @return builder
         * 
         */
        public Builder field(@Nullable Output<String> field) {
            $.field = field;
            return this;
        }

        /**
         * @param field The field of the resource that has caused this error, as named by its JSON serialization. May include dot and postfix notation for nested attributes. Arrays are zero-indexed.  Fields may appear more than once in an array of causes due to fields having multiple errors. Optional.
         * 
         * Examples:
         *   &#34;name&#34; - the field &#34;name&#34; on the current resource
         *   &#34;items[0].name&#34; - the field &#34;name&#34; on the first array entry in &#34;items&#34;
         * 
         * @return builder
         * 
         */
        public Builder field(String field) {
            return field(Output.of(field));
        }

        /**
         * @param message A human-readable description of the cause of the error.  This field may be presented as-is to a reader.
         * 
         * @return builder
         * 
         */
        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        /**
         * @param message A human-readable description of the cause of the error.  This field may be presented as-is to a reader.
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            return message(Output.of(message));
        }

        /**
         * @param reason A machine-readable description of the cause of the error. If this value is empty there is no information available.
         * 
         * @return builder
         * 
         */
        public Builder reason(@Nullable Output<String> reason) {
            $.reason = reason;
            return this;
        }

        /**
         * @param reason A machine-readable description of the cause of the error. If this value is empty there is no information available.
         * 
         * @return builder
         * 
         */
        public Builder reason(String reason) {
            return reason(Output.of(reason));
        }

        public StatusCauseArgs build() {
            return $;
        }
    }

}