import java.util.Scanner;
class main6 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        double temp = s.nextDouble();

        s.nextLine();

        System.out.println("Convert to Celsius or Fahrenheit? (C or F): ");
        String choice = s.nextLine();
        if(choice.toUpperCase().equals("C")){
            double convert = (temp * (9.0/5.0)) + 32;
            System.out.printf("%f°C", convert);
        }
        else if (choice.toUpperCase().equals("F")){
            double convert = (temp - 32) * (5.0/9.0);
            System.out.printf("%f°F", convert);
        }
        else{
            System.out.println("you have entered an invalid input.");
        }
        s.close();
    }
}