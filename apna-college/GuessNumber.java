import java.util.*;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = (int) (Math.random() * 100);  
        System.out.println("A number has been generated between 0 and 99. Try to guess it!");

        int num;  
        do {
            System.out.print("Guess the number: ");
            num = scan.nextInt();

            if (num > number) {
                System.out.println("The number is smaller.");
            } else if (num < number) {
                System.out.println("The number is bigger.");
            } else {
                System.out.println("Congratulations! You guessed the number: " + number);
            }
        } while (num != number); 
        scan.close();
    }
}
