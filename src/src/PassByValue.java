
public class PassByValue {

    public static void changeValue(int num) {
        num = 20;
        System.out.println("Inside Method: " + num);
    }

    public static void main(String[] args) {
        int num = 10;
        changeValue(num);
        System.out.println("Outside Method: " + num);
    }
}
