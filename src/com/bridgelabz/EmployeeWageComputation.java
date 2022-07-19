package com.bridgelabz;

public class EmployeeWageComputation {
    static final int IS_FULL_TIME = 2;
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 16;
    static final int IS_PART_TIME = 1;
    static final int PART_TIME_HOUR = 8;

    static int checkAttendance() {
        return (int) (Math.random() * 10) % 3;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int attendance;
        int dailyWage = 0;

        attendance = checkAttendance();
        switch (attendance){
            case IS_FULL_TIME:
                dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                break;

            case IS_PART_TIME:
                dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                break;
            default:
                break;
        }

        System.out.println("Daily Wage:" + dailyWage);

    }
}
