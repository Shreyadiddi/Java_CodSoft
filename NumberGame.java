package Java_CodSoft;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    private static final int MAX_ATTEMPTS = 10;
    private static final int LOWER_BOUND = 1;
    private static final int UPPER_BOUND = 100;

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        boolean playAgain;
        int totalScore = 0;
        int round = 1;

        do {
            System.out.println("Round " + round);
            int randomNumber = generateRandomNumber(LOWER_BOUND, UPPER_BOUND);
            int attempts = 0;
            boolean guessedCorrectly = false;

            while (attempts < MAX_ATTEMPTS && !guessedCorrectly){
                System.out.println("Enter your guess (between " + LOWER_BOUND + " and " + UPPER_BOUND + "): ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == randomNumber){
                    System.out.println("Correct! You've guessed the number in " + attempts + " attempts. ");
                    guessedCorrectly = true;
                    totalScore += (MAX_ATTEMPTS - attempts + 1);
                } else if (userGuess < randomNumber){
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (!guessedCorrectly){
                System.out.println("Sorry! You've used all " + MAX_ATTEMPTS + " attempts. The correct number was " + randomNumber + ".");
            }

            System.out.println("Your total score is: " + totalScore);

            System.out.println("Do you want to play another round? (yes/no): ");
            String response = scanner.next();
            playAgain = response. 
            equalsIgnoreCase("yes");
            round++;
        } while (playAgain);

        System.out.println("Thank you for playing! Your final score is: " + totalScore);
        scanner.close();
    }

    private static int generateRandomNumber(int lowerBound, int upperBound){
        Random random = new Random();
        return random.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }
}