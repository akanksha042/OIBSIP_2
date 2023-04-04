import java.util.Random;
import java.util.Scanner;

public class GuessTheRandomNumber {
    public static void main(String[] args) {
        Random random_number = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Guessing Game, where you can put your intuition and luck to the test!");
        System.out.print("Enter the number of rounds you want to play: ");
        int num_rounds = scan.nextInt();
        int total_score = 0;
        for (int round = 1; round <= num_rounds; round++) {
            int right_guess = random_number.nextInt(100);
            int turns = 0;
            System.out.println("***Round " + round + ": Guess a number between 1 to 100, You will have 10 turns!***");
            System.out.println();
            System.out.println("Each correct guess earns you 10 points, so try to guess the number in fewer turns to get a higher score.");
            System.out.println();
            System.out.println("And be careful, the number changes every round, so don't assume anything!");
            System.out.println();
            System.out.println("Best of luck!!!");
            int guess;
            int i = 0;
            boolean win = false;
            while (win == false) {
                guess = scan.nextInt();
                turns++;

                if (guess == right_guess) {
                    win = true;
                } else if (i > 8) {
                    System.out.println("Oops, you ran out of turns! The right answer was: " + right_guess);
                    System.out.println();
                    break;
                } else if (guess < right_guess) {
                    i++;
                    System.out.println("Sorry, your guess is lower than the right guess! Turns left: " + (10 - i));
                } else if (guess > right_guess) {
                    i++;
                    System.out.println("Sorry, your guess is higher than the right guess! Turns left: " + (10 - i));
                }
            }
            if (win == true) {
                int score = (11 - turns) * 10;
                System.out.println();
                System.out.println("****Congratulations, you win the round!****");
                System.out.println();
                System.out.println("You're a natural at guessing! You guessed the right number " + right_guess + " in just " + turns + " turns!");
                System.out.println();
                System.out.println("Your score for this round is " + score + " out of 100");
                total_score += score;
            } else {
                System.out.println("You lost this round! But don't worry, you can still redeem yourself in the next round.");
                System.out.println();
            }
        }
        System.out.println("Game over! Your total score for " + num_rounds + " rounds is " + total_score + " out of " + (num_rounds * 100));
        System.out.println();
        System.out.println("Thanks for playing the Guessing Game. We hope you had a great time! See you next time!");
    }
}
