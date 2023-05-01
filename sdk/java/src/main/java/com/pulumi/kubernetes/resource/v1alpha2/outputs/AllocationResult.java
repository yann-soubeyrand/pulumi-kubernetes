// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.resource.v1alpha2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core.v1.outputs.NodeSelector;
import com.pulumi.kubernetes.resource.v1alpha2.outputs.ResourceHandle;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AllocationResult {
    /**
     * @return This field will get set by the resource driver after it has allocated the resource to inform the scheduler where it can schedule Pods using the ResourceClaim.
     * 
     * Setting this field is optional. If null, the resource is available everywhere.
     * 
     */
    private @Nullable NodeSelector availableOnNodes;
    /**
     * @return ResourceHandles contain the state associated with an allocation that should be maintained throughout the lifetime of a claim. Each ResourceHandle contains data that should be passed to a specific kubelet plugin once it lands on a node. This data is returned by the driver after a successful allocation and is opaque to Kubernetes. Driver documentation may explain to users how to interpret this data if needed.
     * 
     * Setting this field is optional. It has a maximum size of 32 entries. If null (or empty), it is assumed this allocation will be processed by a single kubelet plugin with no ResourceHandle data attached. The name of the kubelet plugin invoked will match the DriverName set in the ResourceClaimStatus this AllocationResult is embedded in.
     * 
     */
    private @Nullable List<ResourceHandle> resourceHandles;
    /**
     * @return Shareable determines whether the resource supports more than one consumer at a time.
     * 
     */
    private @Nullable Boolean shareable;

    private AllocationResult() {}
    /**
     * @return This field will get set by the resource driver after it has allocated the resource to inform the scheduler where it can schedule Pods using the ResourceClaim.
     * 
     * Setting this field is optional. If null, the resource is available everywhere.
     * 
     */
    public Optional<NodeSelector> availableOnNodes() {
        return Optional.ofNullable(this.availableOnNodes);
    }
    /**
     * @return ResourceHandles contain the state associated with an allocation that should be maintained throughout the lifetime of a claim. Each ResourceHandle contains data that should be passed to a specific kubelet plugin once it lands on a node. This data is returned by the driver after a successful allocation and is opaque to Kubernetes. Driver documentation may explain to users how to interpret this data if needed.
     * 
     * Setting this field is optional. It has a maximum size of 32 entries. If null (or empty), it is assumed this allocation will be processed by a single kubelet plugin with no ResourceHandle data attached. The name of the kubelet plugin invoked will match the DriverName set in the ResourceClaimStatus this AllocationResult is embedded in.
     * 
     */
    public List<ResourceHandle> resourceHandles() {
        return this.resourceHandles == null ? List.of() : this.resourceHandles;
    }
    /**
     * @return Shareable determines whether the resource supports more than one consumer at a time.
     * 
     */
    public Optional<Boolean> shareable() {
        return Optional.ofNullable(this.shareable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AllocationResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable NodeSelector availableOnNodes;
        private @Nullable List<ResourceHandle> resourceHandles;
        private @Nullable Boolean shareable;
        public Builder() {}
        public Builder(AllocationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availableOnNodes = defaults.availableOnNodes;
    	      this.resourceHandles = defaults.resourceHandles;
    	      this.shareable = defaults.shareable;
        }

        @CustomType.Setter
        public Builder availableOnNodes(@Nullable NodeSelector availableOnNodes) {
            this.availableOnNodes = availableOnNodes;
            return this;
        }
        @CustomType.Setter
        public Builder resourceHandles(@Nullable List<ResourceHandle> resourceHandles) {
            this.resourceHandles = resourceHandles;
            return this;
        }
        public Builder resourceHandles(ResourceHandle... resourceHandles) {
            return resourceHandles(List.of(resourceHandles));
        }
        @CustomType.Setter
        public Builder shareable(@Nullable Boolean shareable) {
            this.shareable = shareable;
            return this;
        }
        public AllocationResult build() {
            final var o = new AllocationResult();
            o.availableOnNodes = availableOnNodes;
            o.resourceHandles = resourceHandles;
            o.shareable = shareable;
            return o;
        }
    }
}