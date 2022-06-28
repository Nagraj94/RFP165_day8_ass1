package com.bridgelabz;

public class EmployeeWages {
    final static int EMP_FULL_TIME = 1;
    final static int EMP_PART_TIME = 2;
    final static int WAGES_PER_HRS = 20;
    final static int DAYS_PER_MONTH = 20;
    final static int TOTAL_WORKING_HRS = 100;

    static void calWages(){
        int empHrs = 0;
        int totalWages = 0;
        int totalDays = 0;
        int totalHrs = 0;
        while (totalHrs<=TOTAL_WORKING_HRS && totalDays<DAYS_PER_MONTH){
            totalDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck){
                case EMP_FULL_TIME:
                    System.out.println("employee is present for full time ");
                    empHrs = 8;
                    break;
                case EMP_PART_TIME:
                    System.out.println("employee is present for part time ");
                    empHrs = 4;
                    break;
                default:
                    System.out.println("employee is absent");
                    empHrs = 0;
                    break;
            }
            totalHrs += empHrs;
            System.out.println("at day " + totalDays + " employee hrs is "+ totalHrs);
        }
        totalWages =totalHrs * WAGES_PER_HRS;
        System.out.println("total employee wages is: " + totalWages);
    }
    public static void main(String[] args) {
        calWages();
    }
}
