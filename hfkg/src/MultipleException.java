public class MultipleException {
    public static void main(String[] args) {
        int a [] = new int [7];
        try{
            a[5]=30/0;
        }catch (ArithmeticException e){
            System.out.println("can't divide zero");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("index out of bound");
        }catch(Exception e){
            System.out.println("some error occurs");
        }
        System.out.println("rest of code");
    }
}
