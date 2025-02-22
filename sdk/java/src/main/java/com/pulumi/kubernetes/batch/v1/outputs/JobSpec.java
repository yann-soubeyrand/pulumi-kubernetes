// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.batch.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.batch.v1.outputs.PodFailurePolicy;
import com.pulumi.kubernetes.core.v1.outputs.PodTemplateSpec;
import com.pulumi.kubernetes.meta.v1.outputs.LabelSelector;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobSpec {
    /**
     * @return Specifies the duration in seconds relative to the startTime that the job may be continuously active before the system tries to terminate it; value must be positive integer. If a Job is suspended (at creation or through an update), this timer will effectively be stopped and reset when the Job is resumed again.
     * 
     */
    private @Nullable Integer activeDeadlineSeconds;
    /**
     * @return Specifies the number of retries before marking this job failed. Defaults to 6
     * 
     */
    private @Nullable Integer backoffLimit;
    /**
     * @return CompletionMode specifies how Pod completions are tracked. It can be `NonIndexed` (default) or `Indexed`.
     * 
     * `NonIndexed` means that the Job is considered complete when there have been .spec.completions successfully completed Pods. Each Pod completion is homologous to each other.
     * 
     * `Indexed` means that the Pods of a Job get an associated completion index from 0 to (.spec.completions - 1), available in the annotation batch.kubernetes.io/job-completion-index. The Job is considered complete when there is one successfully completed Pod for each index. When value is `Indexed`, .spec.completions must be specified and `.spec.parallelism` must be less than or equal to 10^5. In addition, The Pod name takes the form `$(job-name)-$(index)-$(random-string)`, the Pod hostname takes the form `$(job-name)-$(index)`.
     * 
     * More completion modes can be added in the future. If the Job controller observes a mode that it doesn&#39;t recognize, which is possible during upgrades due to version skew, the controller skips updates for the Job.
     * 
     */
    private @Nullable String completionMode;
    /**
     * @return Specifies the desired number of successfully finished pods the job should be run with.  Setting to nil means that the success of any pod signals the success of all pods, and allows parallelism to have any positive value.  Setting to 1 means that parallelism is limited to 1 and the success of that pod signals the success of the job. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * 
     */
    private @Nullable Integer completions;
    /**
     * @return manualSelector controls generation of pod labels and pod selectors. Leave `manualSelector` unset unless you are certain what you are doing. When false or unset, the system pick labels unique to this job and appends those labels to the pod template.  When true, the user is responsible for picking unique labels and specifying the selector.  Failure to pick a unique label may cause this and other jobs to not function correctly.  However, You may see `manualSelector=true` in jobs that were created with the old `extensions/v1beta1` API. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/#specifying-your-own-pod-selector
     * 
     */
    private @Nullable Boolean manualSelector;
    /**
     * @return Specifies the maximum desired number of pods the job should run at any given time. The actual number of pods running in steady state will be less than this number when ((.spec.completions - .status.successful) &lt; .spec.parallelism), i.e. when the work left to do is less than max parallelism. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * 
     */
    private @Nullable Integer parallelism;
    /**
     * @return Specifies the policy of handling failed pods. In particular, it allows to specify the set of actions and conditions which need to be satisfied to take the associated action. If empty, the default behaviour applies - the counter of failed pods, represented by the jobs&#39;s .status.failed field, is incremented and it is checked against the backoffLimit. This field cannot be used in combination with restartPolicy=OnFailure.
     * 
     * This field is alpha-level. To use this field, you must enable the `JobPodFailurePolicy` feature gate (disabled by default).
     * 
     */
    private @Nullable PodFailurePolicy podFailurePolicy;
    /**
     * @return A label query over pods that should match the pod count. Normally, the system sets this field for you. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     * 
     */
    private @Nullable LabelSelector selector;
    /**
     * @return Suspend specifies whether the Job controller should create Pods or not. If a Job is created with suspend set to true, no Pods are created by the Job controller. If a Job is suspended after creation (i.e. the flag goes from false to true), the Job controller will delete all active Pods associated with this Job. Users must design their workload to gracefully handle this. Suspending a Job will reset the StartTime field of the Job, effectively resetting the ActiveDeadlineSeconds timer too. Defaults to false.
     * 
     */
    private @Nullable Boolean suspend;
    /**
     * @return Describes the pod that will be created when executing a job. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * 
     */
    private PodTemplateSpec template;
    /**
     * @return ttlSecondsAfterFinished limits the lifetime of a Job that has finished execution (either Complete or Failed). If this field is set, ttlSecondsAfterFinished after the Job finishes, it is eligible to be automatically deleted. When the Job is being deleted, its lifecycle guarantees (e.g. finalizers) will be honored. If this field is unset, the Job won&#39;t be automatically deleted. If this field is set to zero, the Job becomes eligible to be deleted immediately after it finishes.
     * 
     */
    private @Nullable Integer ttlSecondsAfterFinished;

    private JobSpec() {}
    /**
     * @return Specifies the duration in seconds relative to the startTime that the job may be continuously active before the system tries to terminate it; value must be positive integer. If a Job is suspended (at creation or through an update), this timer will effectively be stopped and reset when the Job is resumed again.
     * 
     */
    public Optional<Integer> activeDeadlineSeconds() {
        return Optional.ofNullable(this.activeDeadlineSeconds);
    }
    /**
     * @return Specifies the number of retries before marking this job failed. Defaults to 6
     * 
     */
    public Optional<Integer> backoffLimit() {
        return Optional.ofNullable(this.backoffLimit);
    }
    /**
     * @return CompletionMode specifies how Pod completions are tracked. It can be `NonIndexed` (default) or `Indexed`.
     * 
     * `NonIndexed` means that the Job is considered complete when there have been .spec.completions successfully completed Pods. Each Pod completion is homologous to each other.
     * 
     * `Indexed` means that the Pods of a Job get an associated completion index from 0 to (.spec.completions - 1), available in the annotation batch.kubernetes.io/job-completion-index. The Job is considered complete when there is one successfully completed Pod for each index. When value is `Indexed`, .spec.completions must be specified and `.spec.parallelism` must be less than or equal to 10^5. In addition, The Pod name takes the form `$(job-name)-$(index)-$(random-string)`, the Pod hostname takes the form `$(job-name)-$(index)`.
     * 
     * More completion modes can be added in the future. If the Job controller observes a mode that it doesn&#39;t recognize, which is possible during upgrades due to version skew, the controller skips updates for the Job.
     * 
     */
    public Optional<String> completionMode() {
        return Optional.ofNullable(this.completionMode);
    }
    /**
     * @return Specifies the desired number of successfully finished pods the job should be run with.  Setting to nil means that the success of any pod signals the success of all pods, and allows parallelism to have any positive value.  Setting to 1 means that parallelism is limited to 1 and the success of that pod signals the success of the job. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * 
     */
    public Optional<Integer> completions() {
        return Optional.ofNullable(this.completions);
    }
    /**
     * @return manualSelector controls generation of pod labels and pod selectors. Leave `manualSelector` unset unless you are certain what you are doing. When false or unset, the system pick labels unique to this job and appends those labels to the pod template.  When true, the user is responsible for picking unique labels and specifying the selector.  Failure to pick a unique label may cause this and other jobs to not function correctly.  However, You may see `manualSelector=true` in jobs that were created with the old `extensions/v1beta1` API. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/#specifying-your-own-pod-selector
     * 
     */
    public Optional<Boolean> manualSelector() {
        return Optional.ofNullable(this.manualSelector);
    }
    /**
     * @return Specifies the maximum desired number of pods the job should run at any given time. The actual number of pods running in steady state will be less than this number when ((.spec.completions - .status.successful) &lt; .spec.parallelism), i.e. when the work left to do is less than max parallelism. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * 
     */
    public Optional<Integer> parallelism() {
        return Optional.ofNullable(this.parallelism);
    }
    /**
     * @return Specifies the policy of handling failed pods. In particular, it allows to specify the set of actions and conditions which need to be satisfied to take the associated action. If empty, the default behaviour applies - the counter of failed pods, represented by the jobs&#39;s .status.failed field, is incremented and it is checked against the backoffLimit. This field cannot be used in combination with restartPolicy=OnFailure.
     * 
     * This field is alpha-level. To use this field, you must enable the `JobPodFailurePolicy` feature gate (disabled by default).
     * 
     */
    public Optional<PodFailurePolicy> podFailurePolicy() {
        return Optional.ofNullable(this.podFailurePolicy);
    }
    /**
     * @return A label query over pods that should match the pod count. Normally, the system sets this field for you. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     * 
     */
    public Optional<LabelSelector> selector() {
        return Optional.ofNullable(this.selector);
    }
    /**
     * @return Suspend specifies whether the Job controller should create Pods or not. If a Job is created with suspend set to true, no Pods are created by the Job controller. If a Job is suspended after creation (i.e. the flag goes from false to true), the Job controller will delete all active Pods associated with this Job. Users must design their workload to gracefully handle this. Suspending a Job will reset the StartTime field of the Job, effectively resetting the ActiveDeadlineSeconds timer too. Defaults to false.
     * 
     */
    public Optional<Boolean> suspend() {
        return Optional.ofNullable(this.suspend);
    }
    /**
     * @return Describes the pod that will be created when executing a job. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * 
     */
    public PodTemplateSpec template() {
        return this.template;
    }
    /**
     * @return ttlSecondsAfterFinished limits the lifetime of a Job that has finished execution (either Complete or Failed). If this field is set, ttlSecondsAfterFinished after the Job finishes, it is eligible to be automatically deleted. When the Job is being deleted, its lifecycle guarantees (e.g. finalizers) will be honored. If this field is unset, the Job won&#39;t be automatically deleted. If this field is set to zero, the Job becomes eligible to be deleted immediately after it finishes.
     * 
     */
    public Optional<Integer> ttlSecondsAfterFinished() {
        return Optional.ofNullable(this.ttlSecondsAfterFinished);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobSpec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer activeDeadlineSeconds;
        private @Nullable Integer backoffLimit;
        private @Nullable String completionMode;
        private @Nullable Integer completions;
        private @Nullable Boolean manualSelector;
        private @Nullable Integer parallelism;
        private @Nullable PodFailurePolicy podFailurePolicy;
        private @Nullable LabelSelector selector;
        private @Nullable Boolean suspend;
        private PodTemplateSpec template;
        private @Nullable Integer ttlSecondsAfterFinished;
        public Builder() {}
        public Builder(JobSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeDeadlineSeconds = defaults.activeDeadlineSeconds;
    	      this.backoffLimit = defaults.backoffLimit;
    	      this.completionMode = defaults.completionMode;
    	      this.completions = defaults.completions;
    	      this.manualSelector = defaults.manualSelector;
    	      this.parallelism = defaults.parallelism;
    	      this.podFailurePolicy = defaults.podFailurePolicy;
    	      this.selector = defaults.selector;
    	      this.suspend = defaults.suspend;
    	      this.template = defaults.template;
    	      this.ttlSecondsAfterFinished = defaults.ttlSecondsAfterFinished;
        }

        @CustomType.Setter
        public Builder activeDeadlineSeconds(@Nullable Integer activeDeadlineSeconds) {
            this.activeDeadlineSeconds = activeDeadlineSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder backoffLimit(@Nullable Integer backoffLimit) {
            this.backoffLimit = backoffLimit;
            return this;
        }
        @CustomType.Setter
        public Builder completionMode(@Nullable String completionMode) {
            this.completionMode = completionMode;
            return this;
        }
        @CustomType.Setter
        public Builder completions(@Nullable Integer completions) {
            this.completions = completions;
            return this;
        }
        @CustomType.Setter
        public Builder manualSelector(@Nullable Boolean manualSelector) {
            this.manualSelector = manualSelector;
            return this;
        }
        @CustomType.Setter
        public Builder parallelism(@Nullable Integer parallelism) {
            this.parallelism = parallelism;
            return this;
        }
        @CustomType.Setter
        public Builder podFailurePolicy(@Nullable PodFailurePolicy podFailurePolicy) {
            this.podFailurePolicy = podFailurePolicy;
            return this;
        }
        @CustomType.Setter
        public Builder selector(@Nullable LabelSelector selector) {
            this.selector = selector;
            return this;
        }
        @CustomType.Setter
        public Builder suspend(@Nullable Boolean suspend) {
            this.suspend = suspend;
            return this;
        }
        @CustomType.Setter
        public Builder template(PodTemplateSpec template) {
            this.template = Objects.requireNonNull(template);
            return this;
        }
        @CustomType.Setter
        public Builder ttlSecondsAfterFinished(@Nullable Integer ttlSecondsAfterFinished) {
            this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
            return this;
        }
        public JobSpec build() {
            final var o = new JobSpec();
            o.activeDeadlineSeconds = activeDeadlineSeconds;
            o.backoffLimit = backoffLimit;
            o.completionMode = completionMode;
            o.completions = completions;
            o.manualSelector = manualSelector;
            o.parallelism = parallelism;
            o.podFailurePolicy = podFailurePolicy;
            o.selector = selector;
            o.suspend = suspend;
            o.template = template;
            o.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
            return o;
        }
    }
}
