public class PersonClass {
    public static void main(String[] args) {
        // Using Default Constructor
        Person person1 = new Person();
        person1.displayDetails();

        // Using Parameterized Constructor
        Person person2 = new Person("Alice", 25);
        person2.displayDetails();
    }
}

class Person {
    String name;
    int age;

    // Default Constructor
    Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized Constructor
    Person(String n, int a) {
        name = n;
        age = a;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

