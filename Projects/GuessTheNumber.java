import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int guess = 0;
        int tries = 0;

        System.out.println("Guess the number between 1 and 100!");

        while (guess != number) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            tries++;

            if (guess < number) {
                System.out.println("Too low!");
            } else if (guess > number) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! You guessed it in " + tries + " tries.");
            }
        }
        sc.close();
    }
}
