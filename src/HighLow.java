import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String playAgain = "";
        do {
            int cpuNumber = (int) (Math.random() * 100 + 1);
            int numberOfTries = 0;
            int playerGuess = 0;
            while (playerGuess != cpuNumber) {
                System.out.println("Guess a number between 1-100");
                playerGuess = input.nextInt();
                numberOfTries = numberOfTries + 1;
                if (playerGuess < cpuNumber) {
                    System.out.println("Your number is too low, try again.");
                } else if (playerGuess > cpuNumber) {
                    System.out.println("Your number is too high, please enter a lower number.");
                } else
                    System.out.println(playerGuess + " is correct, congratulations!" + " It took you " + numberOfTries +
                            " tries!");
                System.out.println("You entered : " + playerGuess);

            }
            System.out.println("Would you like to play again? Y/N");
            playAgain = input.next();
        } while (playAgain.equalsIgnoreCase("y"));
        System.out.println("Thanks for playing, goodbye!");
        input.close();
    }
}
