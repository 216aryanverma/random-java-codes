import java.util.Scanner;

class Bank {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ch;
        Double balance = 0.0;
        while (true) {
            System.out.println("""
                    ********************************
                    WELCOME TO YOUR BANKING SERVICES
                    ********************************
                    1. Check Account Balance
                    2. Deposit Funds
                    3. Withdraw Funds
                    4. Exit
                    ********************************
                    """);
            System.out.println("Please enter your choice (1-4): ");
            ch = s.nextInt();
            if (ch == 4) {
                System.out.println("Thank you for banking with us. Have a pleasant day!");
                break;
            }
            switch (ch) {
                case 1:
                    show_bal(balance);
                    break;
                case 2:
                    balance = deposit(balance);
                    break;
                case 3:
                    balance = withdraw(balance);
                    break;
                default:
                    System.out.println("Invalid selection. Please choose an option between 1 and 4.");
                    break;
            }
        }
    }

    static void show_bal(double balance) {
        System.out.println("Your available balance is: " + balance);
    }

    static double deposit(double balance) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the amount to be deposited: ");
        Double depo = s.nextDouble();
        depo = depo + balance;
        return depo;
    }

    static double withdraw(double balance) {
        Scanner s = new Scanner(System.in);
        double withdraw;
        if (balance > 0) {
            System.out.println("Please enter the amount to be withdrawn: ");
            withdraw = s.nextDouble();
            if (withdraw > balance) {
                System.out.println("Transaction declined. Insufficient funds in your account.");
                return balance;
            } else {
                balance = balance - withdraw;
                System.out.printf("Withdrawal successful. Amount withdrawn: %f ", withdraw);
                return balance;
            }
        } else {
            System.out.println("Transaction declined. Your account has no available funds.");
            return balance;
        }

    }

}