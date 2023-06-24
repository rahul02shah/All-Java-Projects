// multilevel inheritance
class Grand{
    public void m1(){
        System.out.println("class grand method");
    }
}
class Parent1 extends Grand{
    public void m2(){
        System.out.println("class parent1 method");
    }
}
class Child1 extends Parent1{
    public void m3(){
        System.out.println("class parent2 method");
    }
}
public class Multilevel {
    public static void main(String[] args) {
        Child1 obj = new Child1();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}
