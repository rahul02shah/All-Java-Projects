class Animal3{
    Animal3(){
        System.out.println("Animal3 called");
    }
}
class Dog3 extends Animal3{
    Dog3(){
        super();
        System.out.println("Dog3 called");
    }
}
class Main{
    public static void main(String[] args) {
        Dog3 obj = new Dog3();
    }
}