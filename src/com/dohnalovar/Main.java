/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
*/
package com.dohnalovar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int three = 3;
        int five = 5;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Get the limit for Sum of 3 and 5 multiples : ");
        int limit = sc.nextInt();

        while (three < limit || five < limit) {
            if (three < five) {
                sum += three;
                three += 3;
            } else if (five < three) {
                sum += five;
                five += 5;
            } else {
                sum += three;
                three += 3;
                five += 5;
            }
        }
        System.out.println("Sum is : "+sum);
    }
}
