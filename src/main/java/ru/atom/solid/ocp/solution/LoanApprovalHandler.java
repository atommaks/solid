package ru.atom.solid.ocp.solution;

public class LoanApprovalHandler {
    public void approveLoan(Validator validator) {
        if (validator.isValid()) {
            //some logic
        }
    }
}