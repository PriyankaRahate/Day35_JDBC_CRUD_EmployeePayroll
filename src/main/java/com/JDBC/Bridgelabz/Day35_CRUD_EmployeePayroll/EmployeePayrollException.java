package com.JDBC.Bridgelabz.Day35_CRUD_EmployeePayroll;


public class EmployeePayrollException extends Exception {

   
    private static final long serialVersionUID = 1L;

    
    public enum Exception {
        DATA_NULL,INSERTION_FAILED
    }

    public Exception type;


    public EmployeePayrollException(Exception type, String message) {
        super(message);
        this.type = type;
    }
}