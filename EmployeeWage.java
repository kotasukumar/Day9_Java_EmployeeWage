package com.company;

public class EmployeeWage {
    final int ISFULLTIME = 1;
    final  int ISPARTTIME = 0;
    int wagePerHour;
    int workingHours = 0;
    int monthlyHours = 0;
    int totalWorkingDays = 1;

    public void Calculation(){
        while (monthlyHours <= 100 || totalWorkingDays <= 20) {
            int random = (int) Math.floor(Math.random() * 10) % 3;
            switch (random) {
                case ISFULLTIME:
                    workingHours = 8;
                    System.out.println("Full time employee is present");
                    totalWorkingDays++;
                    break;
                case ISPARTTIME:
                    workingHours = 8;
                    System.out.println("Part time employee is present");
                    totalWorkingDays++;
                    break;
                default:
                    workingHours = 0;
                    System.out.println("Employee is absent");
            }
            monthlyHours = monthlyHours + workingHours;
            int monthlyWage = wagePerHour * monthlyHours;
            System.out.println("monthly wage is: " + monthlyWage);
        }
    }
}
