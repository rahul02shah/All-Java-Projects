class Employee{
    void display(){
        System.out.println("hello from super class");
    }
}
class Subclass extends  Employee{

    void display(){
        System.out.println("hello from subsclass");
    }
}
public class Main {
    public static void main(String[] args) {
        Employee obj = new Subclass();
        obj.display();
    }
}