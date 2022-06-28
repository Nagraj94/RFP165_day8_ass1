package com.bridgelabz;

public class EmployeeWages {
    final static int EMP_PRESENT = 1;
    public static void main(String[] args) {
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (EMP_PRESENT == empCheck )
        {
            System.out.println("employee is present");
        }
        else
        {
            System.out.println("employee is absent");
        }
    }
}
