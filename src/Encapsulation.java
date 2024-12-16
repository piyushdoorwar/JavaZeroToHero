public class Encapsulation {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setAge(12);
        emp.setName("Piyush");

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Age: " + emp.getAge());

        emp.setAge(-5);
    }
}

class Employee {
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age > 0){
            this.age = age;
        }
        else{
            System.out.println("Age must be positive!");
        }
    }
}
