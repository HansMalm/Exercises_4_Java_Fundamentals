package org.example;

import java.util.Scanner;

public class Main {
    static void main() {

        //Exercise 1: Write program that prints 'Hello' on screen and then print your name on a separate line.
        System.out.println("\nHello");
        System.out.println("Hans!");

        //Exercise 2: Create a program that takes a year as input from user and print if it’s leap year or not.
        Scanner scanner = new Scanner(System.in);
        int yearInput;
        System.out.print("\nInput year to check for leap year:");
        yearInput = scanner.nextInt();
        if (yearInput % 4 == 0 && yearInput % 100 != 0) {
            System.out.println(yearInput + " is a leap year!");
        }
        else if (yearInput % 100 == 0 && yearInput % 400 == 0) {
            System.out.println(yearInput + " is a leap year!");
        }
        else {
            System.out.println(yearInput + " is not a leap year.");
        }

        //Exercise 3: Write a program that prints out sum of 41 + 11, multiplication of 12 * 4,
        // division of 24 by 6 and subtraction of 55 by 12.
        int sum1 = 45; int sum2 = 11; int sumResult = sum1 + sum2;
        System.out.println("\n" + sum1 + " + " + sum2 + " = " + sumResult);
        int multi1 = 12; int multi2 = 4; int multiResult = multi1 * multi2;
        System.out.println(multi1 + " * " + multi2 + " = " + multiResult);
        int div1 = 24; int div2 = 6; int divResult = div1 / div2;
        System.out.println(div1 + " / " + div2 + " = " + divResult);
        int sub1 = 55; int sub2 = 12; int subResult = sub1 - sub2;
        System.out.println(sub1 + " - " + sub2 + " = " + subResult);

        //Exercise 4: Print the average of the numbers 23,11 and 77.
        int num1 = 23, num2 = 11,  num3 = 77;
        int average = (num1 + num2 + num3) / 3;
        System.out.println("\n(" + num1 + " + " + num2 + " + " + num3 + ")/3 = " + average);

        //Exercise 5: Create a program that asks the user to input their name and store it in a variable.
        // Then print "Hello username" with the name that was input.
        String userName;
        System.out.print("\nInput your username: ");
        userName = scanner.next();
        System.out.println("Hello " + userName);
    }
}
