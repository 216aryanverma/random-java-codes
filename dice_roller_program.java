import java.util.Scanner;
import java.util.Random;
class dice_roller_program {
    static void printDie(int dice){
        String dice1,dice2,dice3,dice4,dice5,dice6;
        dice1 = """
            +-------+
            |       |
            |   o   |
            |       |
            +-------+
        """;

        dice2 = """
            +-------+
            | o     |
            |       |
            |     o |
            +-------+
        """;

        dice3 = """
            +-------+
            | o     |
            |   o   |
            |     o |
            +-------+
        """;
                        
        dice4 = """
            +-------+
            | o   o |
            |       |
            | o   o |
            +-------+
        """;

        dice5 = """
            +-------+
            | o   o |
            |   o   |
            | o   o |
            +-------+
        """;
                        
        dice6 = """
            +-------+
            | o   o |
            | o   o |
            | o   o |
            +-------+ 
        """;

        switch (dice) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
        }
    } 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random random = new Random();
        int ch, dice, count=0;
        System.out.println("Enter the no of dice to roll: ");
        ch = s.nextInt();
        if (ch>0){
            System.out.printf("Rolling %d dice...\n", ch);
            for (int i = 1; i<=ch; i++){
                dice = random.nextInt(1,7);
                printDie(dice);
                System.out.printf("You rolled: %d\n", dice);
                count = count + dice;   
            }
            System.out.printf("Total of all rolls: %d", count);
        }
        else{
            System.out.println("Invalid input. Please try again...");
        }
        s.close();
    }   
} 