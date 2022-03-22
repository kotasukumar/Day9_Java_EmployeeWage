package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        double random = Math.floor(Math.random() * 10) % 2;
        if (random == 1) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent");
        }
    }
}

