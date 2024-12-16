
public class VariableScope {

    int instanceVar = 10;
    static int staticVar = 20;

    public void display() {
        int localVar = 5;
        System.out.println("Display - Local Var: " + localVar);
        System.out.println("Display - Instance Var: " + instanceVar);
        System.out.println("Display - Static Var: " + staticVar);
    }

    public static void main(String[] args) {
        VariableScope vs = new VariableScope();
        vs.display();

        System.out.println("Main - Static Var: " + staticVar);
        System.out.println("Main - Instance Var: " + vs.instanceVar);
    }
}
