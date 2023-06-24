class Parent{
    public void m1(){
        System.out.println("Class Parent Method");
    }
}
class Child extends Parent{
    public void m2(){
        System.out.println("Class Child Method");
    }
}
public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.m2();
        obj.m1();
    }
}