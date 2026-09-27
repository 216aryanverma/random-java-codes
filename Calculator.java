import java.util.Scanner;
class Calculator { 
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        Double num1,num2;
        char operator;
        System.out.println("Enter the first number: ");
        num1 = s.nextDouble();
        // s.nextLine();
        System.out.println("Enter the operator (+,-,*,/,^): ");
        operator = s.next().charAt(0);
        System.out.print("Enter the second number: ");
        num2 = s.nextDouble();
        switch (operator) {
            case '+' -> System.out.print(num1 + num2);
            case '-' -> System.out.print(num1 - num2);
            case '*' -> System.out.print(num1 * num2);
            case '/' -> {
                if(num2 == 0){
                    System.out.println("cannot divide by zero!");
                }
                else{
                    System.out.println(num1/num2);}
                }
            case '^' -> System.out.print(Math.pow(num1,num2));
        }
        s.close();
    }    
}