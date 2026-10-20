import java.util.Scanner;

class main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("What # no of food you want: ");
        int no_foods = s.nextInt();
        s.nextLine();
        String[] foods = new String[no_foods];

        for (int i = 0; i < foods.length; i++) {
            System.out.printf("Enter the %d food: ", i + 1);
            foods[i] = s.nextLine();
        }

        for (int j = 0; j <= foods.length - 1; j++) {
            System.out.printf("Here's the food no %d: %s\n", j + 1, foods[j]);
        }
    }
}
