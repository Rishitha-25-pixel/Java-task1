import java.util.Random;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        boolean playAgain = true;

        while (playAgain) {
            int number = random.nextInt(100) + 1;
            int attempts = 5;
            boolean guessed = false;

            System.out.println("\nGuess the number between 1 and 100");
            System.out.println("You have " + attempts + " attempts.");

            while (attempts > 0) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();

                if (guess == number) {
                    System.out.println("Correct! You guessed the number.");
                    score++;
                    guessed = true;
                    break;
                } else if (guess < number) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }

                attempts--;
                System.out.println("Attempts left: " + attempts);
            }

            if (!guessed) {
                System.out.println("You lost! The number was: " + number);
            }

            System.out.println("Score: " + score);

            System.out.print("Play again? (yes/no): ");
            String choice = sc.next();
            playAgain = choice.equalsIgnoreCase("yes");
        }

        System.out.println("Final Score: " + score);
        sc.close();
    }
}