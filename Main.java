package com.company;

public class Main {

    public static void main(String[] args) {
        final int ISFULLTIME = 1;
        final int ISPARTTIME = 2;
        int PerHourWage = 20;
        int workingHours = 0;
        int monthlyHours = 0;
        int totalWorkingDays = 1;

        for (int i = 0; i < 21; i++) {
            int random = (int) Math.floor(Math.random() * 10) % 3;
            switch (random) {
                case ISFULLTIME:
                    workingHours = 8;
                    System.out.println("Full time employee is present");
                    totalWorkingDays++;
                    break;
                case ISPARTTIME:
                    workingHours = 8;
                    System.out.println("Part time employee present");
                    totalWorkingDays++;
                    break;
                default:
                    workingHours = 0;
                    System.out.println("Employee is absent");
            }
            monthlyHours = monthlyHours + workingHours;
        }
        int daily_wage = PerHourWage * monthlyHours;
        System.out.println("today wage is: " + daily_wage);
    }
}

