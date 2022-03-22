package com.company;

public class Main {

    public static void main(String[] args) {
        int ISFULLTIME = 1;
        int ISPARTTIME = 2;
        int PerHourWage = 20;
        int WorkingHours = 0;

        double random = Math.floor(Math.random() * 10) % 3;
        if(random == ISFULLTIME){
            WorkingHours = 8;
            System.out.println("Full time employee is present");
        }
        else if (random == ISPARTTIME){
            WorkingHours = 8;
            System.out.println("Part time employee present");
        }
        else{
            WorkingHours = 0;
            System.out.println("Employee is absent");
        }
        int daily_wage = PerHourWage * WorkingHours;
        System.out.println("today wage is: " + daily_wage);
    }
}

