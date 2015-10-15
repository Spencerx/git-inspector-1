package com.gitinspector.domain.recordable.statistics;

import com.gitinspector.domain.recordable.RecordableType;
import com.gitinspector.domain.recordable.ReportingRecordable;

/**
 * A simple statistic that maintains a key value pair as Strings.
 */
public class StringStatistic extends ReportingRecordable {

    private String key;

    private String value;

    public StringStatistic(String orgName, String repoFullName, String key, String value) {
        super(RecordableType.STATISTIC, orgName, repoFullName);
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return super.toString() + " " + key + "=" + value;
    }
}
