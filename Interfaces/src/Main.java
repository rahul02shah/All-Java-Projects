interface Dog{
    void Bark();
}
interface Cat{
    void Meow();
}
class Animal implements Dog,Cat{
   public  void Bark(){
        System.out.println("Bow Bow");
    }
    public void Meow(){
        System.out.println("Meow Meow");
    }
}
public class Main{
    public static void main(String[] args) {
        Animal obj = new Animal();
        obj.Bark();
        obj.Meow();
    }
}