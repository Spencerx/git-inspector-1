package com.gitinspector.domain.recordable.violations;

/**
 * Represents a commit that violates a Git Inspector rule.
 * Provides information about who made the commit and how to identify it within git.
 */
public class BadCommit extends Violation {

    private String committer;

    private String commitSha;

    private String commitUrl;

    public BadCommit(String orgName, String repoFullName, String committer, String commitSha) {
        super(orgName, repoFullName);
        this.committer = committer;
        this.commitSha = commitSha;
        this.commitUrl = "/" + repoFullName + "/commit/" + commitSha;
    }

    public String getCommitter() {
        return committer;
    }

    public String getCommitSha() {
        return commitSha;
    }

    public String getCommitUrl() {
        return commitUrl;
    }

    @Override
    public String toString() {
        return super.toString()
            + " committer=" + committer
            + " commitSHA=" + commitSha
            + " commitURL=" + commitUrl;
    }
}
