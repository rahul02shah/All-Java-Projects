class Base {
    Base(){
        System.out.println("Rahull shah");
    };
    Base (int a , int b){
        System.out.println(a+b);
    }
}
class Derive extends Base{
    Derive (){
        System.out.println("monekry man");
    }
}
public class Main {
    public static void main(String[] args) {
        Derive obj = new Derive();
    }
}