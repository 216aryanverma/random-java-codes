import java.util.Scanner;

class search {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] fruits = { "apple", "banana", "mango", "orange", "coconut", "kiwi" };

        System.out.println("Enter a fruit to search for: ");
        String search = s.nextLine();

        for (int i = 0; i < fruits.length; i++) {
            if (search.equals(fruits[i])) {
                System.out.printf("Element found at index: %d", i);
                break;
            }
        }
    }
}