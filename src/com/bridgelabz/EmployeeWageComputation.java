package com.bridgelabz;

public class EmployeeWageComputation {
    static final int IS_FULL_TIME = 2;
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 16;

    static int checkAttendance() {
        return (int) (Math.random() * 10) % 3;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int attendance;
        int dailyWage = 0;

        attendance = checkAttendance();
        if (attendance == IS_FULL_TIME) {
            dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
        }
        else {
            System.out.println("Employee is Absent");
        }

        System.out.println("Daily Wage:" + dailyWage);

    }
}
