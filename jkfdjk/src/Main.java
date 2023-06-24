class Vechile{
    int Year;
    int Speed;
    String Model;
    Vechile(){};
    Vechile (int year, String model){
        this.Year = year;
        this.Speed = 0;
        this.Model = model;
    }
    public void StartVechile(){
        System.out.println("Starting The Vechile");
    }
    public void StopVechile(){
        System.out.println("Stopping The Vechile");
    }
    public void IncreaseSpeed(){
        this.Speed = this.Speed + 10;
        System.out.println("increasing speed to "+this.Speed+"kmph");
    }
    public void DecreaseSpeed(){
        this.Speed = this.Speed - 10;
        System.out.println("Decreasing speed to "+this.Speed+" kmph");
    }
}
class Car extends Vechile{
    String Colour;
    int FuelLevel;
    boolean IsEngineRunning;
    public Car(String model,int year,String colour, int fuellevel){
        super(year,model);
        this.Colour = colour;
        this.FuelLevel = fuellevel;
        this.IsEngineRunning = true;
    }
    public void DisplayDetails(){
        System.out.println("Model : "+super.Model);
        System.out.println("Year : "+super.Year);
        System.out.println("Colour : "+this.Colour);
        System.out.println("Fuel Level : "+this.FuelLevel+"%");
        System.out.println("Engine Running : "+this.IsEngineRunning);
    }
}
public class Main {
    public static void main(String[] args) {
        Car mycar = new Car("Toyota Camry",2023,"Black",100);
        mycar.StartVechile();
        mycar.IncreaseSpeed();
        mycar.IncreaseSpeed();
        mycar.DisplayDetails();
        mycar.DecreaseSpeed();
        mycar.StopVechile();
    }
}