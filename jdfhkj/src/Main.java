import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = 10;
        int b = obj.nextInt();
        try{
            int ans = a/b;
            System.out.println(ans);
        }catch(Exception e){
            System.out.println("can't divide by zero");
        }finally{
            System.out.println("la lala la la");
        }
    }
}