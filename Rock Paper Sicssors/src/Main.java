import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        // Random number generator
        Random random = new Random();

        // Input
        Scanner scanner = new Scanner(System.in);

        int userChoise;
        int computerChoise;

        // User selection
        System.out.println("Choose rock, paper or scissors. '0' for rock, '1' for paper and '2' for scissors.");
        userChoise = scanner.nextInt();

        // Checking choice
        if(userChoise < 0 || userChoise > 2)
        { System.out.println("Invalid selection please try again.");
            System.exit(0);
        }

        computerChoise = random.nextInt(3);

        //Is it a tie
        if(userChoise == computerChoise)
        {
            if (userChoise == 0)
            {
                System.out.println("Both players chose rock.");
                System.out.println("It's a tie");
            }
            else if (userChoise == 1)
            {
                System.out.println("Both players chose paper.");
                System.out.println("It's a tie");
            }
            else
            {
                System.out.println("Both players chose scissors.");
                System.out.println("It's a tie.");
            }

            //Exit program
            System.exit(0);
        }
        if(userChoise == 0)
        {
            if(computerChoise == 1)
            {
                System.out.println("Player chose rock, computer chose paper.");
                System.out.println("Computer wins.");
            }
            else
            {
                System.out.println("Player chose rock, computer chose scissors.");
                System.out.println("Player wins.");
            }
        }
        else if(userChoise == 1)
        {
            if(computerChoise == 0)
            {
                System.out.println("Player chose paper, computer chose rock.");
                System.out.println("Player wins.");
            }
            else
            {
                System.out.println("Player chose paper, computer chose scissors.");
                System.out.println("Computer wins.");
            }
        }
        else
        {
            if(computerChoise == 0)
            {
                System.out.println("Player chose scissors, computer chose rock.");
                System.out.println("Computer wins.");
            }
            else
            {
                System.out.println("Player chose scissors, computer chose paper.");
                System.out.println("Player wins.");
            }
        }
        scanner.close();
    }
}

