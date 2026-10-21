import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors {
    
    static void condition_check(String user_choice, String computer_choice) {
        if (user_choice.equals(computer_choice)) {
            System.out.println("Draw");
        } else {
            if (user_choice.equals("rock") && computer_choice.equals("paper")
                    || user_choice.equals("paper") && computer_choice.equals("scissors")
                    || user_choice.equals("scissors") && computer_choice.equals("rock")) {
                System.out.println("Computer Won!");
            } else {
                System.out.println("You won!");
            }
        }
    }

    static String computer(String... game) {
        Random random = new Random();
        String computer_choice = game[random.nextInt(3)];
        return computer_choice;
    }
    public static void main(String[] args) {
        boolean replay = true;
        while (replay) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your move (rock, paper, scissors): ");
            String user_choice = scanner.nextLine().toLowerCase();
            if (!user_choice.equals("rock") && !user_choice.equals("paper") && !user_choice.equals("scissors")) {
                System.out.println("Invalid Choice.");
            } else {
                String computer_choice = computer("rock", "paper", "scissors");
                System.out.printf("Computer choice: %s\n", computer_choice);
                condition_check(user_choice.toLowerCase(), computer_choice.toLowerCase());
                System.out.println("Play again? (yes/no):");
                String retry = scanner.nextLine();
                if (retry.equals("no")) {
                    break;
                }
            }
        }
    }
}