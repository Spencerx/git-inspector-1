package com.gitinspector.domain.recordable.violations;

import com.gitinspector.domain.recordable.RecordableType;
import com.gitinspector.domain.recordable.ReportingRecordable;

/**
 * Represents a git rule violation.
 */
public class Violation extends ReportingRecordable {

    public Violation(String orgName, String repoFullName) {
        super(RecordableType.VIOLATION, orgName, repoFullName);
    }

}
