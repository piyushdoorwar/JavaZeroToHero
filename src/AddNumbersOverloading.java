public class AddNumbersOverloading {
    public static int add(int a, int b){
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Sum: " + add(5, 10));
        System.out.println("Sum: " + add(5.5, 10.2));
    }
}
