public class NestedExceptions {
    public static void main(String[] args) {
        try{
            try{
                System.out.println("dividing by zero");
                int a = 30/0;
            }catch (ArithmeticException e){
                System.out.println(e);
            }
            try{
                System.out.println("index out of bound exception");
                int a[]= new int[8];
                System.out.println(a[11]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
            try{
                System.out.println("loop");
                for(int i =0;i<10;i++){
                    System.out.println(i);
                    Thread.sleep(1000);
                }
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }catch (Exception e){
            System.out.println("all exception handeled");
        }
    }
}
