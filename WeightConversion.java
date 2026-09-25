import java.util.Scanner;
public class WeightConversion {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Weight Conversiopn Program");
        int choice;
        double weight,to_lbs,to_kgs;
        System.out.println("""
                1: Convert lbs to kgs
                2: Convert kgs to lbs
                """); 
        System.out.println("choose an option: ");
        choice = s.nextInt();
        if(choice == 1 || choice == 2){
                if (choice == 1) {
                    System.out.println("Enter the weight in lbs: ");
                    weight = s.nextDouble();
                    to_kgs = weight/2.20462;
                    System.out.printf("Your weight in kgs in: %f", to_kgs);
                }
                else{
                    System.out.println("Enter the weight in kgs: ");
                    weight = s.nextDouble();
                    to_lbs = weight*2.20462;
                    System.out.printf("Your weight in lbs in: %f", to_lbs);
                }
        }
        else{
            System.out.println("you have entered an invalid choice, Please choose between 1 or 2.");
        }
        s.close();
    }
}
