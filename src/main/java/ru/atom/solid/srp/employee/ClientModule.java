package ru.atom.solid.srp.employee;

public class ClientModule {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Andrew", "IT", true);
        hireNewEmployee(e1);
        printEmployeeReport(e1, FormatType.XML);
        Employee e2 = new Employee(2, "Sasha", "Analytics", false);
    }

    public static void hireNewEmployee(Employee employee) {
        EmployeeDAO dao = new EmployeeDAO();
        dao.saveEmployee(employee);
    }

    public static void terminateEmployee(Employee employee) {
        EmployeeDAO dao = new EmployeeDAO();
        dao.deleteEmployee(employee);
    }

    public static void printEmployeeReport(Employee employee, FormatType type) {
        EmployeeReportFormatter employeeReportFormatter = new EmployeeReportFormatter(employee, type);
        System.out.println(employeeReportFormatter.getFormattedOutput());
    }
}
