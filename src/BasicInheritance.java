public class BasicInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  
        myDog.bark(); 
        Animal aDog = new Dog();
        aDog.sound();
    }
}

class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }

    void sound() {
        System.out.println("Animals make sounds.");
    }

}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }

    @Override
    void sound() {
        System.out.println("The dog barks.");
    }

    void eat() {
        super.eat();
        System.out.println("Dog eats meat.");
    }
}
