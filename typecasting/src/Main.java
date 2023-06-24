import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Start Calculator Y : Yes And N : No ");
        char c = sc.next().charAt(0);
        if (c=='Y'){
            System.out.println("Enter Symbol For Calculation : ");
            System.out.println("add : +\nsub : -\ndiv : /\nmul : *");
            char choice = sc.next().charAt(0);
            System.out.println(choice);
            switch(choice){
                case '+':
                    System.out.println("Enter Any Two Number : ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println("Sum Is : "+(a+b));
                case '-':
                    System.out.println("Enter Any Two Number : ");
                     a = sc.nextInt();
                     b = sc.nextInt();
                    System.out.println("Sub Is : "+(a-b));
                case '*':
                    System.out.println("Enter Any Two Number : ");
                     a = sc.nextInt();
                     b = sc.nextInt();
                    System.out.println("Mul Is : "+(a*b));
                case '/':
                    System.out.println("Enter Any Two Number : ");
                     a = sc.nextInt();
                     b = sc.nextInt();
                    System.out.println("Div Is : "+(a/b));
            }
        }
    }
}
