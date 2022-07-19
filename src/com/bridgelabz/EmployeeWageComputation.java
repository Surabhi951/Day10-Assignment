package com.bridgelabz;

public class EmployeeWageComputation {
    static final int IS_FULL_TIME = 2;
    static final int FULL_DAY_HOUR = 16;
    static final int IS_PART_TIME = 1;
    static final int PART_TIME_HOUR = 8;
    private final String company;
    private final int wagePerHour;
    private final int maxDays;
    private final int maxHours;
    private int totalWage;

    public EmployeeWageComputation(String company, int wagePerHour, int maxDays, int maxHours){
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.maxDays = maxDays;
        this.maxHours = maxHours;
    }

    static int checkAttendance() {

        return (int) (Math.random() * 10) % 3;
    }

    public void computeEmpWage() {

        int attendance;
        int dailyWage = 0;
//        int totalWage = 0;
        int day = 1;
        int totalWorkingHour = 0;

        while (day <= maxDays && totalWorkingHour < maxHours) {
            attendance = checkAttendance();
            switch (attendance) {
                case IS_FULL_TIME:
                    dailyWage = wagePerHour * FULL_DAY_HOUR;
                    totalWorkingHour += FULL_DAY_HOUR;
                    break;

                case IS_PART_TIME:
                    dailyWage = wagePerHour * PART_TIME_HOUR;
                    totalWorkingHour += PART_TIME_HOUR;
                    break;
                default:
                    break;
            }
            totalWage += dailyWage;
            System.out.println("Daily Wage:" + day + " = " + dailyWage);
            day++;

        }
        System.out.println("Total Days:" + (day-1));
        System.out.println("Total Working Hour:" + totalWorkingHour);
    }

    @Override
    public String toString(){
        return "Total Wage for company:" + company + " is: " +totalWage;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        EmployeeWageComputation amazon = new EmployeeWageComputation("Amazon", 20, 2, 10 );
        EmployeeWageComputation meesho = new EmployeeWageComputation("Meesho", 10, 4, 20 );
        EmployeeWageComputation reliance = new EmployeeWageComputation("Reliance", 10, 3, 10 );
        EmployeeWageComputation flipcart = new EmployeeWageComputation("Flipcart", 15, 5, 30 );
        amazon.computeEmpWage();
        System.out.println(amazon);
        meesho.computeEmpWage();
        System.out.println(meesho);
        reliance.computeEmpWage();
        System.out.println(reliance);
        flipcart.computeEmpWage();
        System.out.println(flipcart);

    }
}
