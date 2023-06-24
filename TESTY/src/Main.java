import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        // 0 = paper
        // 1 = Rock
        // 2 = scissor
        Scanner obj = new Scanner(System.in);
        Random rand = new Random();
        int upperbound = 3;
        int random_num1 = rand.nextInt(upperbound);
        System.out.println("Hello Welcome To Game"+"\n====================");
        System.out.println(" Enter Your Name : ");
        String name = obj.nextLine();
        System.out.println("Ready To Go "+name+"\n1 = Scissor\n2 = Paper\n3 = Rock"+"\n=====================");
        int userinput = obj.nextInt();
        switch(userinput){
            case 1:
                if(userinput<random_num1 && random_num1== 2){
                    System.out.println("Your Choice = Scissor \nComputer = Paper");
                    System.out.println("You Won !");
                }
                break;
            case 2:
                if(userinput<random_num1 && random_num1==3){
                    System.out.println("Your Choice = Paper \nComputer = Rock");
                    System.out.println("You Won lose !");
                }
                break;
            case 3:
                if(userinput<random_num1 && random_num1==1){
                    System.out.println("Your Choice = rock \nComputer = Scissor");
                    System.out.println("You Won !");
                }
                break;

        }
    }
}