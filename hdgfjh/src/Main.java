class Base{
    void Method(){
        System.out.println("Hello From Base");
    }
}
class Derived extends Base{
    void Method(){
        System.out.println("Hello From Base");
    }
}
public class Main {
    public static void main(String[] args) {
        Base obj = new Derived();
        Derived obj1 = (Derived)obj;
        obj.Method();
        obj1.Method();
    }
}