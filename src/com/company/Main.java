package com.company;

import java.util.Scanner;

/**
 * Design an application that will prompt the user for the numerical value of two cards. The program will receive the
 * two numbers and display their sum on the screen. If the calculated sum is 21, an asterisk is to be displayed beside the sum.
 * <p>
 * The program shall end when two zeros are entered.The program shall print a welcome message when it is first started
 * and an goodbye message when it terminates.
 * <p>
 * Bonus:
 * Modify the application to allow the user to enter the face cards as J,Q,K or A. If the user enters J, Q, or K then
 * convert the entered value to 10. If the user enters A then count the value as 11 points.
 * <p>
 * Bonus Bonus:
 * Modify the algorithm to allow the user who receives the A to designate it either as 1 or 11.
 * <p>
 * <h3>Objective</h3>
 * Define the problem by constructing an algorithm using pseudocode
 * What control structures (sequence, selection and repetition) are required?
 * What variables are required?
 * Show a check of your solution with test data for at least two valid test cases
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome");
        while (true) {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Enter 1st number: ");
            String a = keyboard.next();
            int n = getNumber(a);

            System.out.print("Enter 2nd number: ");
            String b = keyboard.next();
            int m = getNumber(b);

            if (m == 0 && n == 0) {
                break;
            } else {
                int sum = m + n;
                if (sum < 21) {
                    System.out.println(sum);
                } else {
                    System.out.println(sum + "*");
                }
            }
        }
        System.out.println("Good Bye");
    }

    public static int getNumber(String str) {
        if (str.equalsIgnoreCase("J") || str.equalsIgnoreCase("Q") || str.equalsIgnoreCase("K")) {
            return 10;
        } else if (str.equalsIgnoreCase("A")) {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Enter 1 or 11 number: ");
            int a = keyboard.nextInt();
            return a;
        }
        return Integer.parseInt(str);
    }
}
