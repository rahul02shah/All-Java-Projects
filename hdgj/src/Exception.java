public class Exception {
    public static void main(String[] args) {
        int a = 0;
        int b = 20;
        int c;
        try{
            System.out.println(c=b/a);
        }catch (ArithmeticException e){
            System.out.println("cannot divide");
        }
    }
}
