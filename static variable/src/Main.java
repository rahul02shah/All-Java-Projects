class StaticExample{
    static {
        System.out.println("i am static block");
    }
    static void setdata(){
        System.out.println("i'm static function");
    }
}
public class Main {
    static  int a = 10;
    public static void main(String[] args) {
        StaticExample.setdata();
        System.out.println(a);
    }
}