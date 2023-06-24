import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int array[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        try{
            int result = x/y;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (NumberFormatException e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}