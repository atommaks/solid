package ru.atom.solid.srp.employee;

public class ReportFormatter {
    String formattedOutput;

    public ReportFormatter(Object o, FormatType type) {
        switch (type) {
            case CSV -> formattedOutput = convertObjectToCsv(o);
            case XML -> formattedOutput = convertObjectToXml(o);
            default -> formattedOutput = "default";
        }
    }

    private String convertObjectToXml(Object o) {
        return "Converted to xml object: " + o.toString();
    }

    private String convertObjectToCsv(Object o) {
        return "Converted to csv object: " + o.toString();
    }
}
