class A{
    public void m1(){
        System.out.println("Method of class A");
    }
}
class B extends A{
    public void m2(){
        System.out.println("Method Of class B");
    }
}
class C extends  A{
    public void m3(){
        System.out.println("Method Of class C");
    }
}
public class Hierarchical {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        C obj3 = new C();
        obj1.m1();
        obj2.m2();
        obj3.m3();
    }
}
