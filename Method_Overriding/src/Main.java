class Base {
    protected void print(){
        System.out.println("Hello From Base");
    }
}
class Derived extends Base{
    protected void print(){
        System.out.println("Hello From Derived");
    }
}
public class Main {
    public static void main(String[] args) {

        Base b = new Derived();
        b.print();

    }
}