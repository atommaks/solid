package ru.atom.solid.ocp.violation;

/**
 * Нарушает OCP, т.к. каждый метод заточен под определенный экземпляр класса.
 */
public class LoanApprovalHandler {
    public void approveLoan(PersonalLoanValidator validator) {
        if (validator.isValid()) {
            //process loan
        }
    }

    public void approveVehicleLoan(VehicleLoanValidator validator) {
        if (validator.isValid()) {
            //process loan
        }
    }
}

class PersonalLoanValidator {
    public boolean isValid() {
        //validation process
        return true;
    }
}

class VehicleLoanValidator {
    public boolean isValid() {
        //validation process
        return true;
    }
}