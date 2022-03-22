package com.company;

public class Main {

    public static void main(String[] args) {
        final int ISFULLTIME = 1;
        final int ISPARTTIME = 2;
        int PerHourWage = 20;
        int WorkingHours = 0;

        int random = (int) Math.floor(Math.random() * 10) % 3;
        switch (random) {
            case ISFULLTIME :
                WorkingHours = 8;
                System.out.println("Full time employee is present");
                break;
            case ISPARTTIME:
                WorkingHours = 8;
                System.out.println("Part time employee present");
                break;
            default:
                WorkingHours = 0;
                System.out.println("Employee is absent");
        }
        int daily_wage = PerHourWage * WorkingHours;
        System.out.println("today wage is: " + daily_wage);
    }
}

