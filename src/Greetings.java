
import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name: ");

        String name = scanner.nextLine();
        System.out.println("Hello, "+ name + " Welcome");
    }
}
