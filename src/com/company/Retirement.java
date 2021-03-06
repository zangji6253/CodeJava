package com.company;

import java.util.*;

/**
 * This program demonstrates a <code>while</code> loop.
 * （千万不要使用这个程序安排退休计划。这里忽略了通货膨胀和所期望的生活水准。）
 */
public class Retirement {

    public static void main(String[] args) {
	    // read inputs
        Scanner in = new Scanner(System.in);

        System.out.print("How much money do you need to retire? ");
        double goal = in.nextDouble();

        System.out.print("How much money will you contribute every year? ");
        double payment = in.nextDouble();

        System.out.print("Interest rate in %: ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;

        // update account balance while goal isn't reached
        while (balance < goal)
        {
            // add this year's payment and interest
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
            System.out.println("year: " + years + " balance: " + balance);
        }

        System.out.println("You can retire in " + years + " years.");
    }
}
