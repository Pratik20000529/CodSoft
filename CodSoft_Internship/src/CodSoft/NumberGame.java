package CodSoft;

import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowest_num = 1;
        int highest_num = 100;
        int secretNumber = random.nextInt(highest_num - lowest_num + 1) + lowest_num;
        int maxAttempts = 10; 

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've generated a number between " + lowest_num + " and " + highest_num + ".");
        System.out.println("Try to guess it within " + maxAttempts + " attempts.");

        int attempts = 0;
        boolean guessedCorrectly = false;

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == secretNumber) {
                guessedCorrectly = true;
                break;
            } else if (userGuess < secretNumber) {
                System.out.println("Too low! Try a higher number.");
            } else {
                System.out.println("Too high! Try a lower number.");
            }
        }

        if (guessedCorrectly) {
            System.out.println("Congratulations! You guessed the correct number: " + secretNumber);
        } else {
            System.out.println("Sorry, you've reached the maximum number of attempts.");
            System.out.println("The secret number was: " + secretNumber);
        }

        scanner.close();
    }
}

