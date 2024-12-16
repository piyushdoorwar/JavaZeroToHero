
import java.util.Scanner;

public class UserInputDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        System.out.print("Enter a string: ");
        String text = scanner.next();

        System.out.println("You entered: " + number + " and " + text);
    }
}
