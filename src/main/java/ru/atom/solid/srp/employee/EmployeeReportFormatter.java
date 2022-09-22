package ru.atom.solid.srp.employee;

public class EmployeeReportFormatter extends ReportFormatter {
    public EmployeeReportFormatter(Object o, FormatType type) {
        super(o, type);
    }

    public String getFormattedOutput() {
        return formattedOutput;
    }
}
