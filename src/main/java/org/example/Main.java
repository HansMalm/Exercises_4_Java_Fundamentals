package org.example;

import java.util.Scanner;

public class Main {
    static void main() {

        //Exercise 1: Write a Java program to print 'Hello' on screen and then print your name on a separate line.
        System.out.println("Hello");
        System.out.println("Hans!");

        //Exercise 2: Create a program that takes a year as input from user and print if it’s leap year or not.
        Scanner scanner = new Scanner(System.in);
        int yearInput;
        System.out.print("Input year to check for leap year:");
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
    }
}
