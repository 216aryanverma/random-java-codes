import java.util.Scanner;
class for_while_loop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to set countdown : ");
        int num = s.nextInt();

//              for LOOP EXAMPLE

        // for(int i = num ; i>0 ; i--){
        //     System.out.println(i);
        // }
        // System.out.println("Happy Birthday!");

//              While LOOP EXAMPLE

        while(num<0){
            System.out.println(num);
            num--;
        }
        System.out.println("Happy Birthday!");
        s.close();   
    }
}