package com.gitinspector.domain.recordable;

/**
 * A enum to represent the various types of entities that can be recorded in a git inspector report.
 */
public enum RecordableType {
    STATISTIC("statistic"), VIOLATION("violation");

    private String printableValue;

    RecordableType(String printableValue) {
        this.printableValue = printableValue;
    }

    public String getPrintableValue() {
        return printableValue;
    }
}
