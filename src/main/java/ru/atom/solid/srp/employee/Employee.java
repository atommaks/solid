package ru.atom.solid.srp.employee;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
    private int id;
    private String name;
    private String department;
    private boolean working;
}
