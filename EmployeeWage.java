package com.company;

public class EmployeeWage {
    public void getParameters(String companyName, int wagePerHour, int noOfWorkingDays, int totalMonthlyHours) {

        final int ISFULLTIME = 1;
        final int ISPARTTIME = 0;
        int workingHours = 0;
        int monthlyHours = 0;
        int totalWorkingDays = 1;
        int monthlyWage = 0;

        while (monthlyHours <= totalMonthlyHours || totalWorkingDays <= noOfWorkingDays) {
            int random = (int) Math.floor(Math.random() * 10) % 3;
            switch (random) {
                case ISFULLTIME:
                case ISPARTTIME:
                    workingHours = 8;
                    totalWorkingDays++;
                    break;
                default:
                    workingHours = 0;
            }
            monthlyHours = monthlyHours + workingHours;
            monthlyWage = wagePerHour * monthlyHours;
        }
        System.out.println("monthly wage of : " + companyName + " is " + monthlyWage);
    }

}
