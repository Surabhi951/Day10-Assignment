package com.bridgelabz;

public class EmployeeWageComputation {
    static final int IS_FULL_TIME = 2;
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 16;
    static final int IS_PART_TIME = 1;
    static final int PART_TIME_HOUR = 8;
    static final int MAX_HOURS = 100;
    static final int MAX_Days = 20;

    static int checkAttendance() {

        return (int) (Math.random() * 10) % 3;
    }

    public static int computeEmpWage() {
        int attendance;
        int dailyWage = 0;
        int totalWage = 0;
        int day = 1;
        int totalWorkingHour = 0;

        while (day <= MAX_Days && totalWorkingHour < MAX_HOURS) {
            attendance = checkAttendance();
            switch (attendance) {
                case IS_FULL_TIME:
                    dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    totalWorkingHour += FULL_DAY_HOUR;
                    break;

                case IS_PART_TIME:
                    dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                    totalWorkingHour += PART_TIME_HOUR;
                    break;
                default:
                    break;
            }
            totalWage += dailyWage;
            System.out.println("Daily Wage:" + day + " = " + dailyWage);
            day++;

        }
        System.out.println();
        System.out.println("Total Days:" + (day-1));
        System.out.println("Total Working Hour:" + totalWorkingHour);
        System.out.println("Total Wage of month:" + totalWage);
        return totalWage;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        computeEmpWage();
    }
}
