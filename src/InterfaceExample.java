
public class InterfaceExample 
{
    public static void main(String[] args) {
        IAnimal myDog = new DogAnimal();
        myDog.sound();

        IAnimal myCat = new CatAnimal();
        myCat.sound();
    }
}

interface IAnimal {

    void sound(); // Abstract method
}

class DogAnimal implements IAnimal {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class CatAnimal implements IAnimal {

    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}
