import java.util.Scanner;
class Email_Separator{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Email: ");
        String email = s.nextLine();
        if (email.contains("@")){
                String username, domain;
                username = email.substring(0,email.indexOf("@"));
                domain = email.substring(email.indexOf("@")+1);
                System.out.printf("this is the username: %s\n", username);
                System.out.printf("this is the domain: %s\n", domain);
        }
        else{
            System.out.println("the following is invalid and must contains '@'.");
        }
        s.close();
    }
}