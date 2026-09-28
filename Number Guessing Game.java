import java.util.Scanner;
import java.util.Random;
class main8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int rand_number = random.nextInt(1,101),guess,attempts = 1;
        System.out.println("Number Guessing Game");
        System.out.println("Enter a guess: ");
        guess = input.nextInt();

// 1st Approach

        // while(guess>=1 && guess<=100){
        //     if(rand_number == guess){
        //         System.out.println("You won, you have guessed the right number!");
        //         System.out.printf("Total attempt: %d", attempts); 
        //         break;
        //     }
        //     else{
        //         if (rand_number>guess) {
        //             System.out.println("TOO LOW! Try again");
        //             System.out.println("Enter a guess: ");
        //             guess = input.nextInt();
        //             attempts++;
        //         }
        //         else{
        //             System.out.println("TOO HIGH! Try again");
        //             System.out.println("Enter a guess: ");
        //             guess = input.nextInt();
        //             attempts++;
        //         }
        //     }
        // }


// 2nd Approach

        if (guess>=1 && guess<=100){
            while (rand_number != guess) {
                if (rand_number>guess) {
                     System.out.println("TOO LOW! Try again");
                     System.out.println("Enter a guess: ");
                     guess = input.nextInt();
                     attempts++;
                 }
                 else{
                     System.out.println("TOO HIGH! Try again");
                     System.out.println("Enter a guess: ");
                     guess = input.nextInt();
                     attempts++;
                 }
            }
            System.out.println("You won, you have guessed the right number!");
            System.out.printf("Total attempt: %d", attempts);
        }
        input.close();
    }
}