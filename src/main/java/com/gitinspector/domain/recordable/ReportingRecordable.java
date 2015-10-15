package com.gitinspector.domain.recordable;

/**
 * Any object that can be recorded in a git inspector report.
 * Contains information about what type of recordable it is (violation, statistic, etc), the repository it is associated with,
 * and repository owner for that repository.
 */
public abstract class ReportingRecordable {

    private RecordableType type;

    private String orgName;

    private String repoFullName;

    /**
     * Create a new ReportingRecordable.
     *
     * @param type         the type of recordable this is (e.g. a violation, a statistic)
     * @param orgName      the git organization associated with this recordable (e.g. MyOrg)
     * @param repoFullName the full name of the repository associated with this recordable (e.g. MyOrg/my-respository)
     */
    public ReportingRecordable(RecordableType type, String orgName, String repoFullName) {
        this.type = type;
        this.repoFullName = repoFullName;
        this.orgName = orgName;
    }

    public RecordableType getType() {
        return type;
    }

    public String getRepoFullName() {
        return repoFullName;
    }

    public String getOrgName() {
        return orgName;
    }

    @Override
    public String toString() {
        return " type=" + type.getPrintableValue()
            + " repoFullName=" + repoFullName
            + " orgName=" + orgName;
    }
}
