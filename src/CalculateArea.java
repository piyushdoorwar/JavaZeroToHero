
import java.util.Scanner;

public class CalculateArea {

    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static double area(double length, double breadth) {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.print("Choose an option to calculate Area: ");
        int option = sc.nextInt();
        System.out.println("");
        switch (option) {
            case 1:
                System.out.print("Enter Radius: ");
                double r = sc.nextDouble();
                System.out.println("Area of Circle: " + area(r));
                break;

            case 2:
                System.out.print("Enter Length: ");
                double l = sc.nextDouble();
                System.out.print("Enter Breadth: ");
                double b = sc.nextDouble();
                System.out.println("Area of Rectangle: " + area(l, b));
                break;

            default:
                System.out.println("Invalid option.");
                break;
        }
        sc.close();
    }
}
