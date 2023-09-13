import java.util.Scanner;
import java.lang.Math;

public class GuessingGame {
  public static void main(String[] args) {
    // generate a random number between 1 and 100
    int answer = (int)(Math.random() * 100) + 1;
    // number of trials that the user has to guess the number
    int ch = 5;
    Scanner input = new Scanner(System.in);
    boolean correct = false;
    System.out.println("\t     Hello Friends!\n       Welcome To The NUMBER GUESSING GAME!!\n\n  I'm thinking of a number between 1 and 100.\n  You have only 5 tries to guess the number.");
    while (ch > 0) {
      System.out.println("Enter your guess: ");
     int guess = input.nextInt();

      if (guess == answer) {
        System.out.println("  You guessed the number!\n           You win!");
        break;
      }
      else if (guess > answer) {
        System.out.println("  Your guess is too high.\n  You have " + (ch - 1) + " tries left.");
        ch--;
      }
      else {
        System.out.println("  Your guess is too low.\n  You have " + (ch - 1) + " tries left.");
      }
      ch--;
    }
    // if the user has run out of trials, print the message and exit the program

    if (correct == false) {
      System.out.println("\n\n  You ran out of tries.\n\n     You lose!\n     Better Luck next time:)");
    }
  }
}
