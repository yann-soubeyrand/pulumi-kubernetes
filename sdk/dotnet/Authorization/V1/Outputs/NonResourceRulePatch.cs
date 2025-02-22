// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Kubernetes.Types.Outputs.Authorization.V1
{

    /// <summary>
    /// NonResourceRule holds information that describes a rule for the non-resource
    /// </summary>
    [OutputType]
    public sealed class NonResourceRulePatch
    {
        /// <summary>
        /// NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path.  "*" means all.
        /// </summary>
        public readonly ImmutableArray<string> NonResourceURLs;
        /// <summary>
        /// Verb is a list of kubernetes non-resource API verbs, like: get, post, put, delete, patch, head, options.  "*" means all.
        /// </summary>
        public readonly ImmutableArray<string> Verbs;

        [OutputConstructor]
        private NonResourceRulePatch(
            ImmutableArray<string> nonResourceURLs,

            ImmutableArray<string> verbs)
        {
            NonResourceURLs = nonResourceURLs;
            Verbs = verbs;
        }
    }
}
