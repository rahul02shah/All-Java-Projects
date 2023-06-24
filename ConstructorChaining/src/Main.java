
class Player{
    String Name;
    int Strikerate;
    String TeamName;
    int Run_Score;
    Player(){
        System.out.println("Default Constructor :) ");
    }
    Player(String Name,int StrikeRate,String TeamName){
        this();
        this.TeamName = TeamName;
        this.Name = Name;
        this.Strikerate = StrikeRate;
    }
    Player(String Name,int StrikeRate,String TeamName,int Run_Score){
        this(Name,StrikeRate,TeamName);
        this.Run_Score = Run_Score;
    }
    void DisplayPlayerData(){
        System.out.println("Name : "+ Name);
        System.out.println("TeamName : "+ TeamName);
        System.out.println("Run_Score : "+ Run_Score);
    }
}
class Inherit extends Player{
    Inherit(){
        super.Player();
    }
}
public class Main {
    public static void main(String[] args) {
        Player object = new Player("Ravindra Jadega",118,"India",1800);
        object.DisplayPlayerData();
        Inherit obj = new Inherit();
    }
}