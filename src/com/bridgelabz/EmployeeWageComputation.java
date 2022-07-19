package com.bridgelabz;

public class EmployeeWageComputation {
    static final int IS_FULL_TIME = 2;
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 16;
    static final int IS_PART_TIME = 1;
    static final int PART_TIME_HOUR = 8;
    static final int NO_OF_WORKING_DAYS = 2;

    static int checkAttendance() {
        return (int) (Math.random() * 10) % 3;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int attendance;
        int dailyWage = 0;
        int totalWage = 0;
        int day = 0;

        for (day = 0; day < NO_OF_WORKING_DAYS; day++) {
            attendance= checkAttendance();
            switch (attendance) {
                case IS_FULL_TIME:
                    dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    break;

                case IS_PART_TIME:
                    dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                    break;
                default:
                    break;
            }
            totalWage += dailyWage;
            System.out.println("Daily Wage:" + dailyWage);
            System.out.println("Total Wage of month:" + totalWage);
        }
        System.out.println("Total Days:" + (day-1));
    }

}
