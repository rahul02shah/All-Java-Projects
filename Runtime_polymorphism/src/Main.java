import java.util.Scanner;
class Cricketor{
    String TeamName;
    String Name;
    int Run_scored;
    int Wicket;
    int Economy;
}
class Bowler extends Cricketor{
    void SetData(int Run_Scored,String TeamName,String Name){
        this.Run_scored = Run_Scored;
        this.Name = Name;
        this.TeamName = TeamName;
    }
}
class Batter extends Cricketor{
    void SetData(int Wicket,int Economy,String Name){
        this.Economy = Economy;
        this.Wicket = Wicket;
        this.TeamName = Name;
    }
    void Display(){
        System.out.println("Name"+this.Name);
        System.out.println("Team Name"+ this.TeamName);
        System.out.println("Run Scored"+ this.Run_scored);
    }
}
public class Main {
    public static void main(String[] args) {
//        int Run_scored,Wicket,Economy;
//        String Name,TeamName;
        Bowler obj = new Bowler();
        Batter obj1 = new Batter();
        Scanner input = new Scanner(System.in);
        System.out.println("1 : Cricket \n2: Bowler");
        System.out.println("Enter Your Choice : ");
        int choice = input.nextInt();
        if(choice==1){
            System.out.println("Enter The player name : ");
            obj1.Name = input.nextLine();
            System.out.println("Enter The TeamName : ");
            obj1.TeamName = input.nextLine();
            System.out.println("Enter The Run_scored : ");
            obj1.Run_scored = input.nextInt();
            System.out.println("data recorded successfully");
        } else if (choice==2){
            System.out.println("Enter The player name : ");
            obj.Name = input.nextLine();
            System.out.println("Enter The Economy rate : ");
            obj.Economy = input.nextInt();
            System.out.println("Enter the wickets : ");
            obj.Wicket = input.nextInt();
        }else {
            System.out.println("undefined");
            int a = input.nextInt();
        }
        obj1.Display();
    }
}