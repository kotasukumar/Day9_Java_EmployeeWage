package com.company;

public class Main {

    public static void main(String[] args) {
        int PerHourWage = 20;
        int WorkingHours = 0;

        double random = Math.floor(Math.random() * 10) % 2;
        if(random == 1){
            WorkingHours = 8;
            System.out.println("Employee is present");
        }
        else{
            WorkingHours = 0;
            System.out.println("Employee is absent");
        }
        int daily_wage = PerHourWage * WorkingHours;
        System.out.println("today wage is: " + daily_wage);
    }
}

