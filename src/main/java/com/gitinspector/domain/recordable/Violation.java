/*
 * Copyright Homeaway, Inc 2015-Present. All Rights Reserved.
 * No unauthorized use of this software.
 */
package com.gitinspector.domain.recordable;

import com.gitinspector.domain.RecordableType;

/**
 * Represents a git rule violation.
 */
public class Violation extends ReportingRecordable {

    public Violation(String orgName, String repoFullName, String owner) {
        super(RecordableType.VIOLATION, orgName, repoFullName, owner);
    }

    @Override
    public String getStringVersion() {
        return this.toString();
    }

}