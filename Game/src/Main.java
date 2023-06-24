import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random generate = new Random();
        int random_num1 = generate.nextInt(3);
        System.out.println("You Wanna Play Game Y :  Yes and N : No :] ");
        char a = sc.next().charAt(0);
        switch (a){
            case 'Y':
                System.out.println("0= Rock ; 1=paper ; 2=scissor ");
                System.out.println("Enter Your Choice : ");
                int choice = sc.nextInt();
                if(choice>0 && choice>1){
                    System.out.println("You Won");
                }
                else if(choice==1 && random_num1 < 2){
                    System.out.println("You Won");
                }
                else if (choice==0 && random_num1==2){
                    System.out.println("You Won");
                }
                else {
                    System.out.println("You Loose The game Buddy :) ");
                }
            case 'N':
                System.out.println("Exiting.....");
                break;
            default:
                System.out.println("Undefined");
        }
    }
}