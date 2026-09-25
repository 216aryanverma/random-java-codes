import java.util.Scanner;
class Compound_interest_calculator {
    public static void main(){
        Scanner s = new Scanner(System.in);
        double principal,C_interest, interest;
        int times, year;  
        System.out.println("Enter the principal amount: ");
        principal=s.nextDouble();
        System.out.println("Enter the interest rate (in %): ");
        interest=s.nextDouble();
        System.out.println("Enter the # of times compound per year: ");
        times=s.nextInt();
        System.out.println("Enter the # of years: ");
        year=s.nextInt();

        C_interest = principal * Math.pow(1 + (interest/100)/times, times*year);

        System.out.printf("The amout after %d year is $%f",times,C_interest);
        s.close();
    }    
}
