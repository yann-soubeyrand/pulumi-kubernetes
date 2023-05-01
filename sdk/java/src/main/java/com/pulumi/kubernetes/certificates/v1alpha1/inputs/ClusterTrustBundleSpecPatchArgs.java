// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.certificates.v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ClusterTrustBundleSpec contains the signer and trust anchors.
 * 
 */
public final class ClusterTrustBundleSpecPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterTrustBundleSpecPatchArgs Empty = new ClusterTrustBundleSpecPatchArgs();

    /**
     * signerName indicates the associated signer, if any.
     * 
     * In order to create or update a ClusterTrustBundle that sets signerName, you must have the following cluster-scoped permission: group=certificates.k8s.io resource=signers resourceName=&lt;the signer name&gt; verb=attest.
     * 
     * If signerName is not empty, then the ClusterTrustBundle object must be named with the signer name as a prefix (translating slashes to colons). For example, for the signer name `example.com/foo`, valid ClusterTrustBundle object names include `example.com:foo:abc` and `example.com:foo:v1`.
     * 
     * If signerName is empty, then the ClusterTrustBundle object&#39;s name must not have such a prefix.
     * 
     * List/watch requests for ClusterTrustBundles can filter on this field using a `spec.signerName=NAME` field selector.
     * 
     */
    @Import(name="signerName")
    private @Nullable Output<String> signerName;

    /**
     * @return signerName indicates the associated signer, if any.
     * 
     * In order to create or update a ClusterTrustBundle that sets signerName, you must have the following cluster-scoped permission: group=certificates.k8s.io resource=signers resourceName=&lt;the signer name&gt; verb=attest.
     * 
     * If signerName is not empty, then the ClusterTrustBundle object must be named with the signer name as a prefix (translating slashes to colons). For example, for the signer name `example.com/foo`, valid ClusterTrustBundle object names include `example.com:foo:abc` and `example.com:foo:v1`.
     * 
     * If signerName is empty, then the ClusterTrustBundle object&#39;s name must not have such a prefix.
     * 
     * List/watch requests for ClusterTrustBundles can filter on this field using a `spec.signerName=NAME` field selector.
     * 
     */
    public Optional<Output<String>> signerName() {
        return Optional.ofNullable(this.signerName);
    }

    /**
     * trustBundle contains the individual X.509 trust anchors for this bundle, as PEM bundle of PEM-wrapped, DER-formatted X.509 certificates.
     * 
     * The data must consist only of PEM certificate blocks that parse as valid X.509 certificates.  Each certificate must include a basic constraints extension with the CA bit set.  The API server will reject objects that contain duplicate certificates, or that use PEM block headers.
     * 
     * Users of ClusterTrustBundles, including Kubelet, are free to reorder and deduplicate certificate blocks in this file according to their own logic, as well as to drop PEM block headers and inter-block data.
     * 
     */
    @Import(name="trustBundle")
    private @Nullable Output<String> trustBundle;

    /**
     * @return trustBundle contains the individual X.509 trust anchors for this bundle, as PEM bundle of PEM-wrapped, DER-formatted X.509 certificates.
     * 
     * The data must consist only of PEM certificate blocks that parse as valid X.509 certificates.  Each certificate must include a basic constraints extension with the CA bit set.  The API server will reject objects that contain duplicate certificates, or that use PEM block headers.
     * 
     * Users of ClusterTrustBundles, including Kubelet, are free to reorder and deduplicate certificate blocks in this file according to their own logic, as well as to drop PEM block headers and inter-block data.
     * 
     */
    public Optional<Output<String>> trustBundle() {
        return Optional.ofNullable(this.trustBundle);
    }

    private ClusterTrustBundleSpecPatchArgs() {}

    private ClusterTrustBundleSpecPatchArgs(ClusterTrustBundleSpecPatchArgs $) {
        this.signerName = $.signerName;
        this.trustBundle = $.trustBundle;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterTrustBundleSpecPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterTrustBundleSpecPatchArgs $;

        public Builder() {
            $ = new ClusterTrustBundleSpecPatchArgs();
        }

        public Builder(ClusterTrustBundleSpecPatchArgs defaults) {
            $ = new ClusterTrustBundleSpecPatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param signerName signerName indicates the associated signer, if any.
         * 
         * In order to create or update a ClusterTrustBundle that sets signerName, you must have the following cluster-scoped permission: group=certificates.k8s.io resource=signers resourceName=&lt;the signer name&gt; verb=attest.
         * 
         * If signerName is not empty, then the ClusterTrustBundle object must be named with the signer name as a prefix (translating slashes to colons). For example, for the signer name `example.com/foo`, valid ClusterTrustBundle object names include `example.com:foo:abc` and `example.com:foo:v1`.
         * 
         * If signerName is empty, then the ClusterTrustBundle object&#39;s name must not have such a prefix.
         * 
         * List/watch requests for ClusterTrustBundles can filter on this field using a `spec.signerName=NAME` field selector.
         * 
         * @return builder
         * 
         */
        public Builder signerName(@Nullable Output<String> signerName) {
            $.signerName = signerName;
            return this;
        }

        /**
         * @param signerName signerName indicates the associated signer, if any.
         * 
         * In order to create or update a ClusterTrustBundle that sets signerName, you must have the following cluster-scoped permission: group=certificates.k8s.io resource=signers resourceName=&lt;the signer name&gt; verb=attest.
         * 
         * If signerName is not empty, then the ClusterTrustBundle object must be named with the signer name as a prefix (translating slashes to colons). For example, for the signer name `example.com/foo`, valid ClusterTrustBundle object names include `example.com:foo:abc` and `example.com:foo:v1`.
         * 
         * If signerName is empty, then the ClusterTrustBundle object&#39;s name must not have such a prefix.
         * 
         * List/watch requests for ClusterTrustBundles can filter on this field using a `spec.signerName=NAME` field selector.
         * 
         * @return builder
         * 
         */
        public Builder signerName(String signerName) {
            return signerName(Output.of(signerName));
        }

        /**
         * @param trustBundle trustBundle contains the individual X.509 trust anchors for this bundle, as PEM bundle of PEM-wrapped, DER-formatted X.509 certificates.
         * 
         * The data must consist only of PEM certificate blocks that parse as valid X.509 certificates.  Each certificate must include a basic constraints extension with the CA bit set.  The API server will reject objects that contain duplicate certificates, or that use PEM block headers.
         * 
         * Users of ClusterTrustBundles, including Kubelet, are free to reorder and deduplicate certificate blocks in this file according to their own logic, as well as to drop PEM block headers and inter-block data.
         * 
         * @return builder
         * 
         */
        public Builder trustBundle(@Nullable Output<String> trustBundle) {
            $.trustBundle = trustBundle;
            return this;
        }

        /**
         * @param trustBundle trustBundle contains the individual X.509 trust anchors for this bundle, as PEM bundle of PEM-wrapped, DER-formatted X.509 certificates.
         * 
         * The data must consist only of PEM certificate blocks that parse as valid X.509 certificates.  Each certificate must include a basic constraints extension with the CA bit set.  The API server will reject objects that contain duplicate certificates, or that use PEM block headers.
         * 
         * Users of ClusterTrustBundles, including Kubelet, are free to reorder and deduplicate certificate blocks in this file according to their own logic, as well as to drop PEM block headers and inter-block data.
         * 
         * @return builder
         * 
         */
        public Builder trustBundle(String trustBundle) {
            return trustBundle(Output.of(trustBundle));
        }

        public ClusterTrustBundleSpecPatchArgs build() {
            return $;
        }
    }

}