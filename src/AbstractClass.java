
public class AbstractClass {

    public static void main(String[] args) {
        Shape shape1 = new Circle();
        shape1.draw();
        shape1.display();

        Shape shape2 = new Square();
        shape2.draw();
    }
}

abstract class Shape {

    // Abstract method
    abstract void draw();

    // Concrete method
    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing a Circle.");
    }
}

class Square extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing a Square.");
    }
}
