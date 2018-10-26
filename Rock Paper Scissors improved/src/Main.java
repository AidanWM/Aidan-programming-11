import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        // Random number generator
        Random random = new Random();

        // Input
        Scanner scanner = new Scanner(System.in);

        int userChoice;
        int computerChoice;
        int playerWins = 0;
        int computerWins = 0;


    do {
        System.out.println("********************************************************************************************");
        System.out.println("\t");
        System.out.println("Player Wins " + playerWins);
        System.out.println("Computer Wins " + computerWins);
        System.out.println("\t");
        // User selection
        do {
            System.out.println("Choose rock, paper or scissors. '0' for rock, '1' for paper and '2' for scissors. 9 to exit");
            userChoice = scanner.nextInt();
            System.out.println("\t");
            if (userChoice == 9) {
                System.out.println("Thanks for playing ");
                System.out.println("********************************************************************************************");
                System.exit(0);
            }
            // Checking choice
            if (userChoice < 0 || userChoice > 2) {
                System.out.println("Invalid selection please try again.");
            }
        } while (userChoice < 0 || userChoice > 2);


        computerChoice = random.nextInt(3);

        //Is it a tie

        if (userChoice == computerChoice) {
            if (userChoice == 0) {
                System.out.println("Both players chose rock.");
                System.out.println("It's a tie");
            }
            else if (userChoice == 1) {
                System.out.println("Both players chose paper.");
                System.out.println("It's a tie");
            }
            else {
                System.out.println("Both players chose scissors.");
                System.out.println("It's a tie.");
            }
        }

        //Who wins

        if (userChoice == 0) {
            if (computerChoice == 1) {
                System.out.println("Player chose rock, computer chose paper.");
                System.out.println("Computer wins.");
                computerWins = computerWins + 1;
            } else if(computerChoice == 2) {
                System.out.println("Player chose rock, computer chose scissors.");
                System.out.println("Player wins.");
                playerWins = playerWins + 1;
            }
        } else if (userChoice == 1) {
            if (computerChoice == 0) {
                System.out.println("Player chose paper, computer chose rock.");
                System.out.println("Player wins.");
                playerWins = playerWins + 1;
            }
            else if (computerChoice == 2) {
                System.out.println("Player chose paper, computer chose scissors.");
                System.out.println("Computer wins.");
                computerWins = computerWins + 1;
            }
        } else {
            if (computerChoice == 0) {
                System.out.println("Player chose scissors, computer chose rock.");
                System.out.println("Computer wins.");
                computerWins = computerWins + 1;
            }
            else if (computerChoice == 1){
                System.out.println("Player chose scissors, computer chose paper.");
                System.out.println("Player wins.");
                playerWins = playerWins + 1;
            }
        }

        System.out.println("********************************************************************************************");

    }while(userChoice > 9 || userChoice < 9);
        scanner.close();
    }
}
