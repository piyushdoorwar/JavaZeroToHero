
import java.util.Scanner;

public class Factorial {

    public static int calculateFact(int num) {
        int fact = 1;
        while (num >= 1) {
            fact *= num;
            num--;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Factorial is " + calculateFact(number));
        scanner.close();
    }
}
