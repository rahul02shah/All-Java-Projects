import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num ;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if(num<1 && num!=0){
            throw new ArithmeticException("number is negative cannot calculate square");
        } else if (num==0) {
            throw new ArithmeticException("cannot square zero");
        } else {
            System.out.println("squaare is "+(num*num));
        }
    }
}