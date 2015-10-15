package com.gitinspector.domain.recordable.violations;

/**
 * Represents a violation due to a stale object (e.g. a stale branch, a stale repository, a stale pull request).
 */
public class StaleObject extends Violation {

    private String staleObjectName;

    private String lastCommitter;

    private String formattedLastCommitDate;

    public StaleObject(String orgName, String repoFullName, String staleObjectName, String lastCommitter, String formattedLastCommitDate) {
        super(orgName, repoFullName);
        this.staleObjectName = staleObjectName;
        this.lastCommitter = lastCommitter;
        this.formattedLastCommitDate = formattedLastCommitDate;
    }

    public String getStaleObjectName() {
        return staleObjectName;
    }

    public String getLastCommitter() {
        return lastCommitter;
    }

    public String getFormattedLastCommitDate() {
        return formattedLastCommitDate;
    }

    @Override
    public String toString() {
        return super.toString()
            + " staleObjectName=" + staleObjectName
            + " lastCommitter=" + lastCommitter
            + " formattedLastCommitDate=" + formattedLastCommitDate;
    }
}
