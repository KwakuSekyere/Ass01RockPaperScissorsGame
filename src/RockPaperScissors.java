import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choiceA, choiceB;
        boolean playAgain = true;

        while (playAgain) {
            // Get move choice from playerA
            System.out.println("Player A, enter your move (R/P/S): ");
            choiceA = scanner.next().toUpperCase().charAt(0);
            while (choiceA != 'R' && choiceA != 'P' && choiceA != 'S') {
                System.out.println("Invalid move! Please enter R, P, or S: ");
                choiceA = scanner.next().toUpperCase().charAt(0);
            }

            // Get move choice from playerB
            System.out.println("Player B, enter your move (R/P/S): ");
            choiceB = scanner.next().toUpperCase().charAt(0);
            while (choiceB != 'R' && choiceB != 'P' && choiceB != 'S') {
                System.out.println("Invalid move! Please enter R, P, or S: ");
                choiceB = scanner.next().toUpperCase().charAt(0);
            }

            // Display results
            System.out.println("Player A chose: " + choiceA);
            System.out.println("Player B chose: " + choiceB);
            if (choiceA == choiceB) {
                System.out.println("Rock vs Rock it's a Tie!");
            } else if ((choiceA == 'R' && choiceB == 'S') ||
                    (choiceA == 'P' && choiceB == 'R') ||
                    (choiceA == 'S' && choiceB == 'P')) {
                System.out.println(getResultPhrase(choiceA, choiceB) + " Player A wins!");
            } else {
                System.out.println(getResultPhrase(choiceB, choiceA) + " Player B wins!");
            }

            // Prompt the user to play again
            System.out.println("Do you want to play again? (Y/N)");
            char playAgainChoice = scanner.next().toUpperCase().charAt(0);
            playAgain = (playAgainChoice == 'Y');
        }

        // Close the scanner
        scanner.close();
    }

    // Statement After Result
    private static String getResultPhrase(char winner, char loser) {
        String result = "";
        if (winner == 'R' && loser == 'S') {
            result = "Rock breaks Scissors,";
        } else if (winner == 'P' && loser == 'R') {
            result = "Paper covers Rock,";
        } else if (winner == 'S' && loser == 'P') {
            result = "Scissors cuts Paper,";
        }
        return result;
    }
}
