class Player{
    String Name = "Jasprit Bumrah";
    String TeamName = "India";
    Float EconomyRate = 4.5F;
    void  PlayerDetails(){
        System.out.println("Name : "+ Name);
        System.out.println("Economy Rate : "+ EconomyRate);
    }

}
class Derived extends Player{
    void DisplayData(){
        System.out.println(super.TeamName);
        super.PlayerDetails();
    }
}
public class Main {
    public static void main(String[] args) {
        Derived object = new Derived();
        object.DisplayData();
    }
}