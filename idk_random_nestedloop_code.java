import java.util.Scanner;

class idk_random_nestedloop_code {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row, column;
        String symbol;
        System.out.println("Enter the # of rows: ");
        row = s.nextInt();
        System.out.println("Enter the # of columns: ");
        column = s.nextInt();
        s.nextLine();
        System.out.println("Enter the symbol to use: ");
        symbol = s.nextLine();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print(symbol.charAt(0));
            }
            System.out.println();
        }
        s.close();
    }
}