package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program ");

        EmployeeWage employeeWage = new EmployeeWage();
        employeeWage.getParameters("TATA", 25, 19, 95);
        employeeWage.getParameters("WIPRO", 20, 20, 100);
    }
}

