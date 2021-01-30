import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        // TODO: The system generates a random number from a given range, say 1 to 100.
        //Create instance of Random class
        Random rand = new Random();

        //Generate random integers in range 0 to 100
        int secretNumber = rand.nextInt(101);

        // TODO: The user is prompted to enter their given number in a displayed dialogue box.
        //Create a scanner object
        Scanner scan= new Scanner(System.in);
        int guess = 0;
        while(secretNumber != guess) {
            System.out.println("Guess a number between 1-100: ");
            guess = scan.nextInt();

            // TODO: The computer then tells if the entered number matches the guesses number or it is higher/lower than the generated number.
            if (guess == secretNumber) {
                System.out.println("Number: " + guess + " is a match! Congratulations!!");
            } else if (guess < secretNumber) {
                System.out.println("The number guessed is lower than the secret number!");
            } else if (guess > secretNumber) {
                System.out.println("The number guesses is higher than the secret number!");
            }
        }
    }
}
