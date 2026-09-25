import java.util.Scanner;
class ShoppingCart{
    public static void main(String[] args) {
        // Shopping Cart Program
        Scanner s = new Scanner(System.in);
        System.out.println("What item would you like to buy?:");
        String item = s.nextLine();
        System.out.println("What is the price for each?:");
        double price = s.nextDouble();
        System.out.println("How many would you like?:");
        int quant = s.nextInt();
        System.out.println("you have bought " + quant + " " + item + "/s");
        double totalamt = price * quant;
        System.out.println("Your total is $" + totalamt);
        s.close();
    }
}