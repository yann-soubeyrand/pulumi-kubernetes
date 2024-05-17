// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.helm.v4;

import com.pulumi.asset.AssetOrArchive;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.helm.v4.inputs.PostRendererArgs;
import com.pulumi.kubernetes.helm.v4.inputs.RepositoryOptsArgs;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChartArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChartArgs Empty = new ChartArgs();

    /**
     * Chart name to be installed. A path may be used.
     * 
     */
    @Import(name="chart", required=true)
    private Output<String> chart;

    /**
     * @return Chart name to be installed. A path may be used.
     * 
     */
    public Output<String> chart() {
        return this.chart;
    }

    /**
     * Run helm dependency update before installing the chart.
     * 
     */
    @Import(name="dependencyUpdate")
    private @Nullable Output<Boolean> dependencyUpdate;

    /**
     * @return Run helm dependency update before installing the chart.
     * 
     */
    public Optional<Output<Boolean>> dependencyUpdate() {
        return Optional.ofNullable(this.dependencyUpdate);
    }

    /**
     * Use chart development versions, too. Equivalent to version &#39;&gt;0.0.0-0&#39;. If `version` is set, this is ignored.
     * 
     */
    @Import(name="devel")
    private @Nullable Output<Boolean> devel;

    /**
     * @return Use chart development versions, too. Equivalent to version &#39;&gt;0.0.0-0&#39;. If `version` is set, this is ignored.
     * 
     */
    public Optional<Output<Boolean>> devel() {
        return Optional.ofNullable(this.devel);
    }

    /**
     * Location of public keys used for verification. Used only if `verify` is true
     * 
     */
    @Import(name="keyring")
    private @Nullable Output<AssetOrArchive> keyring;

    /**
     * @return Location of public keys used for verification. Used only if `verify` is true
     * 
     */
    public Optional<Output<AssetOrArchive>> keyring() {
        return Optional.ofNullable(this.keyring);
    }

    /**
     * Release name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Release name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Namespace for the release.
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    /**
     * @return Namespace for the release.
     * 
     */
    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    /**
     * Specification defining the post-renderer to use.
     * 
     */
    @Import(name="postRenderer")
    private @Nullable Output<PostRendererArgs> postRenderer;

    /**
     * @return Specification defining the post-renderer to use.
     * 
     */
    public Optional<Output<PostRendererArgs>> postRenderer() {
        return Optional.ofNullable(this.postRenderer);
    }

    /**
     * Specification defining the Helm chart repository to use.
     * 
     */
    @Import(name="repositoryOpts")
    private @Nullable Output<RepositoryOptsArgs> repositoryOpts;

    /**
     * @return Specification defining the Helm chart repository to use.
     * 
     */
    public Optional<Output<RepositoryOptsArgs>> repositoryOpts() {
        return Optional.ofNullable(this.repositoryOpts);
    }

    /**
     * An optional prefix for the auto-generated resource names. Example: A resource created with resourcePrefix=&#34;foo&#34; would produce a resource named &#34;foo:resourceName&#34;.
     * 
     */
    @Import(name="resourcePrefix")
    private @Nullable Output<String> resourcePrefix;

    /**
     * @return An optional prefix for the auto-generated resource names. Example: A resource created with resourcePrefix=&#34;foo&#34; would produce a resource named &#34;foo:resourceName&#34;.
     * 
     */
    public Optional<Output<String>> resourcePrefix() {
        return Optional.ofNullable(this.resourcePrefix);
    }

    /**
     * By default, the provider waits until all resources are in a ready state before marking the release as successful. Setting this to true will skip such await logic.
     * 
     */
    @Import(name="skipAwait")
    private @Nullable Output<Boolean> skipAwait;

    /**
     * @return By default, the provider waits until all resources are in a ready state before marking the release as successful. Setting this to true will skip such await logic.
     * 
     */
    public Optional<Output<Boolean>> skipAwait() {
        return Optional.ofNullable(this.skipAwait);
    }

    /**
     * If set, no CRDs will be installed. By default, CRDs are installed if not already present.
     * 
     */
    @Import(name="skipCrds")
    private @Nullable Output<Boolean> skipCrds;

    /**
     * @return If set, no CRDs will be installed. By default, CRDs are installed if not already present.
     * 
     */
    public Optional<Output<Boolean>> skipCrds() {
        return Optional.ofNullable(this.skipCrds);
    }

    /**
     * List of assets (raw yaml files). Content is read and merged with values.
     * 
     */
    @Import(name="valueYamlFiles")
    private @Nullable Output<List<AssetOrArchive>> valueYamlFiles;

    /**
     * @return List of assets (raw yaml files). Content is read and merged with values.
     * 
     */
    public Optional<Output<List<AssetOrArchive>>> valueYamlFiles() {
        return Optional.ofNullable(this.valueYamlFiles);
    }

    /**
     * Custom values set for the release.
     * 
     */
    @Import(name="values")
    private @Nullable Output<Map<String,Object>> values;

    /**
     * @return Custom values set for the release.
     * 
     */
    public Optional<Output<Map<String,Object>>> values() {
        return Optional.ofNullable(this.values);
    }

    /**
     * Verify the chart&#39;s integrity.
     * 
     */
    @Import(name="verify")
    private @Nullable Output<Boolean> verify;

    /**
     * @return Verify the chart&#39;s integrity.
     * 
     */
    public Optional<Output<Boolean>> verify() {
        return Optional.ofNullable(this.verify);
    }

    /**
     * Specify the chart version to install. If this is not specified, the latest version is installed.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return Specify the chart version to install. If this is not specified, the latest version is installed.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private ChartArgs() {}

    private ChartArgs(ChartArgs $) {
        this.chart = $.chart;
        this.dependencyUpdate = $.dependencyUpdate;
        this.devel = $.devel;
        this.keyring = $.keyring;
        this.name = $.name;
        this.namespace = $.namespace;
        this.postRenderer = $.postRenderer;
        this.repositoryOpts = $.repositoryOpts;
        this.resourcePrefix = $.resourcePrefix;
        this.skipAwait = $.skipAwait;
        this.skipCrds = $.skipCrds;
        this.valueYamlFiles = $.valueYamlFiles;
        this.values = $.values;
        this.verify = $.verify;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChartArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChartArgs $;

        public Builder() {
            $ = new ChartArgs();
        }

        public Builder(ChartArgs defaults) {
            $ = new ChartArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param chart Chart name to be installed. A path may be used.
         * 
         * @return builder
         * 
         */
        public Builder chart(Output<String> chart) {
            $.chart = chart;
            return this;
        }

        /**
         * @param chart Chart name to be installed. A path may be used.
         * 
         * @return builder
         * 
         */
        public Builder chart(String chart) {
            return chart(Output.of(chart));
        }

        /**
         * @param dependencyUpdate Run helm dependency update before installing the chart.
         * 
         * @return builder
         * 
         */
        public Builder dependencyUpdate(@Nullable Output<Boolean> dependencyUpdate) {
            $.dependencyUpdate = dependencyUpdate;
            return this;
        }

        /**
         * @param dependencyUpdate Run helm dependency update before installing the chart.
         * 
         * @return builder
         * 
         */
        public Builder dependencyUpdate(Boolean dependencyUpdate) {
            return dependencyUpdate(Output.of(dependencyUpdate));
        }

        /**
         * @param devel Use chart development versions, too. Equivalent to version &#39;&gt;0.0.0-0&#39;. If `version` is set, this is ignored.
         * 
         * @return builder
         * 
         */
        public Builder devel(@Nullable Output<Boolean> devel) {
            $.devel = devel;
            return this;
        }

        /**
         * @param devel Use chart development versions, too. Equivalent to version &#39;&gt;0.0.0-0&#39;. If `version` is set, this is ignored.
         * 
         * @return builder
         * 
         */
        public Builder devel(Boolean devel) {
            return devel(Output.of(devel));
        }

        /**
         * @param keyring Location of public keys used for verification. Used only if `verify` is true
         * 
         * @return builder
         * 
         */
        public Builder keyring(@Nullable Output<AssetOrArchive> keyring) {
            $.keyring = keyring;
            return this;
        }

        /**
         * @param keyring Location of public keys used for verification. Used only if `verify` is true
         * 
         * @return builder
         * 
         */
        public Builder keyring(AssetOrArchive keyring) {
            return keyring(Output.of(keyring));
        }

        /**
         * @param name Release name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Release name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespace Namespace for the release.
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace Namespace for the release.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        /**
         * @param postRenderer Specification defining the post-renderer to use.
         * 
         * @return builder
         * 
         */
        public Builder postRenderer(@Nullable Output<PostRendererArgs> postRenderer) {
            $.postRenderer = postRenderer;
            return this;
        }

        /**
         * @param postRenderer Specification defining the post-renderer to use.
         * 
         * @return builder
         * 
         */
        public Builder postRenderer(PostRendererArgs postRenderer) {
            return postRenderer(Output.of(postRenderer));
        }

        /**
         * @param repositoryOpts Specification defining the Helm chart repository to use.
         * 
         * @return builder
         * 
         */
        public Builder repositoryOpts(@Nullable Output<RepositoryOptsArgs> repositoryOpts) {
            $.repositoryOpts = repositoryOpts;
            return this;
        }

        /**
         * @param repositoryOpts Specification defining the Helm chart repository to use.
         * 
         * @return builder
         * 
         */
        public Builder repositoryOpts(RepositoryOptsArgs repositoryOpts) {
            return repositoryOpts(Output.of(repositoryOpts));
        }

        /**
         * @param resourcePrefix An optional prefix for the auto-generated resource names. Example: A resource created with resourcePrefix=&#34;foo&#34; would produce a resource named &#34;foo:resourceName&#34;.
         * 
         * @return builder
         * 
         */
        public Builder resourcePrefix(@Nullable Output<String> resourcePrefix) {
            $.resourcePrefix = resourcePrefix;
            return this;
        }

        /**
         * @param resourcePrefix An optional prefix for the auto-generated resource names. Example: A resource created with resourcePrefix=&#34;foo&#34; would produce a resource named &#34;foo:resourceName&#34;.
         * 
         * @return builder
         * 
         */
        public Builder resourcePrefix(String resourcePrefix) {
            return resourcePrefix(Output.of(resourcePrefix));
        }

        /**
         * @param skipAwait By default, the provider waits until all resources are in a ready state before marking the release as successful. Setting this to true will skip such await logic.
         * 
         * @return builder
         * 
         */
        public Builder skipAwait(@Nullable Output<Boolean> skipAwait) {
            $.skipAwait = skipAwait;
            return this;
        }

        /**
         * @param skipAwait By default, the provider waits until all resources are in a ready state before marking the release as successful. Setting this to true will skip such await logic.
         * 
         * @return builder
         * 
         */
        public Builder skipAwait(Boolean skipAwait) {
            return skipAwait(Output.of(skipAwait));
        }

        /**
         * @param skipCrds If set, no CRDs will be installed. By default, CRDs are installed if not already present.
         * 
         * @return builder
         * 
         */
        public Builder skipCrds(@Nullable Output<Boolean> skipCrds) {
            $.skipCrds = skipCrds;
            return this;
        }

        /**
         * @param skipCrds If set, no CRDs will be installed. By default, CRDs are installed if not already present.
         * 
         * @return builder
         * 
         */
        public Builder skipCrds(Boolean skipCrds) {
            return skipCrds(Output.of(skipCrds));
        }

        /**
         * @param valueYamlFiles List of assets (raw yaml files). Content is read and merged with values.
         * 
         * @return builder
         * 
         */
        public Builder valueYamlFiles(@Nullable Output<List<AssetOrArchive>> valueYamlFiles) {
            $.valueYamlFiles = valueYamlFiles;
            return this;
        }

        /**
         * @param valueYamlFiles List of assets (raw yaml files). Content is read and merged with values.
         * 
         * @return builder
         * 
         */
        public Builder valueYamlFiles(List<AssetOrArchive> valueYamlFiles) {
            return valueYamlFiles(Output.of(valueYamlFiles));
        }

        /**
         * @param valueYamlFiles List of assets (raw yaml files). Content is read and merged with values.
         * 
         * @return builder
         * 
         */
        public Builder valueYamlFiles(AssetOrArchive... valueYamlFiles) {
            return valueYamlFiles(List.of(valueYamlFiles));
        }

        /**
         * @param values Custom values set for the release.
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable Output<Map<String,Object>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values Custom values set for the release.
         * 
         * @return builder
         * 
         */
        public Builder values(Map<String,Object> values) {
            return values(Output.of(values));
        }

        /**
         * @param verify Verify the chart&#39;s integrity.
         * 
         * @return builder
         * 
         */
        public Builder verify(@Nullable Output<Boolean> verify) {
            $.verify = verify;
            return this;
        }

        /**
         * @param verify Verify the chart&#39;s integrity.
         * 
         * @return builder
         * 
         */
        public Builder verify(Boolean verify) {
            return verify(Output.of(verify));
        }

        /**
         * @param version Specify the chart version to install. If this is not specified, the latest version is installed.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Specify the chart version to install. If this is not specified, the latest version is installed.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public ChartArgs build() {
            $.chart = Objects.requireNonNull($.chart, "expected parameter 'chart' to be non-null");
            return $;
        }
    }

}