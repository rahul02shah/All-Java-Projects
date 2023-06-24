abstract class Animal{
    public abstract void MakeSound();
}
class Cat extends Animal{
    public void MakeSound(){
        System.out.println("Meow Meow");
    }
}
class Dog extends Animal{
    public void MakeSound(){
        System.out.println("Bow Bow");
    }
}
public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.MakeSound();
    }
}