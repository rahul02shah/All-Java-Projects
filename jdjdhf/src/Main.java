public class Main {
    public static void main(String[] args) {
        try{
            int numerator = 10;
            int denominator = 0;
            int result = numerator/denominator;
            System.out.println(result);
        }catch (ArithmeticException E){
            System.out.println(E);
        }finally {
            System.out.println("this will always be executed ");
        }
    }
}