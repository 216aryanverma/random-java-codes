import java.util.Scanner;
class main2{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the raduis:");
        double radius = s.nextDouble();
        double c =  2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("Circumference is: " + c);
        System.out.println("area is: " + area);
        System.out.println("Volume is: " + volume);
        s.close();

    }
}
