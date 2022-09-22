package ru.atom.solid.srp.employee;

public class EmployeeDAO {
    public void saveEmployee(Employee employee) {
        System.out.println("Saved entity: " + employee.toString());
    }

    public void deleteEmployee(Employee employee) {
        System.out.println("Deleted entity: " + employee.toString());
    }
}
