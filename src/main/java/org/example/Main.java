package org.example;

import java.util.Scanner;

import java.util.Random;

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

        //Exercise 6: Create a program that asks user to input two numbers and print the
        // sum,multiplication, division and subtraction of those numbers.
        int numbers1, numbers2, result;
        System.out.println("\nInput two numbers to calculate.");
        System.out.print("Input first number: ");
        numbers1 = scanner.nextInt();
        System.out.print("Input second number: ");
        numbers2 = scanner.nextInt();
        result = numbers1 + numbers2;
        System.out.println(numbers1 + " + " + numbers2 + " = " + result );
        result = numbers1 * numbers2;
        System.out.println(numbers1 + " * " + numbers2 + " = " + result);
        result = numbers1 / numbers2;
        System.out.println(numbers1 + " / " + numbers2 + " = " + result);
        result = numbers1 - numbers2;
        System.out.println(numbers1 + " - " + numbers2 + " = " + result);

        //Exercise 7: Create a program that converts seconds to hours,minutes and seconds.
        int inputSeconds = 86399; int hours, minutes, seconds;
        hours = inputSeconds / 60 / 60;
        minutes = inputSeconds % 60;
        seconds = minutes % 60;
        System.out.println("\n" + inputSeconds + " seconds equals: " + hours + ":" + minutes + ":" + seconds);

        //Exercise 8: Write a program that generates and stores a random number between 1 and 500.
        //Then let the user guess the number. If the user types the correct number they should see
        // a message including number of guesses made. If a guess is greater or smaller than the random
        // number, display "Your guess was too small" or "Your guess was too big". The program should run
        // until the user guess the correct number.
        Random random = new Random();
        int randomNumber = random.nextInt(500) + 1; int numberOfGuess = 0; int guess;
        System.out.println("\nWelcome to the number guess game!");
        System.out.println("The number is between 1 and 500.");
        
        while (true) {
            numberOfGuess++;
            System.out.print("Input a guess: ");
            guess = scanner.nextInt();
            if (guess < randomNumber) {
                System.out.println("Your guess was too small.");
            } else if (guess > randomNumber) {
                System.out.println("Your guess was too big.");
            } else {
                break;
            }
        }
        System.out.println("The number is " + randomNumber + " and you guessed " + numberOfGuess + " times!");
    }
}
