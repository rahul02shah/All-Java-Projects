class Vechile{
    String Model;
    int Year;
    int Speed;
    Vechile(){};
    Vechile(String model,int Year){
        this.Model = model;
        this.Year = Year;
        this.Speed = 0;
    }
    public void StartVechile(){
        System.out.println("Starting The Vechile ");
    }
    public void StopVechile(){
        System.out.println("Stopping The Vechile ");
    }
    public void IncreaseSpeed(){
        this.Speed = this.Speed+10;
        System.out.println("Increasing Speed "+this.Speed+ "kmph");
    }
    public void DecreaseSpeed(){
        this.Speed = this.Speed-10;
        System.out.println("Decresing speed "+this.Speed+" kmph");
    }
}
class Car extends Vechile{
    String Colour;
    int FuelLevel;
    boolean IsEngineRunning;
    Car(String model,String colour,int year,int fuelLevel){
        super(model,year);
        this.Colour = colour;
        this.FuelLevel = fuelLevel;
        this.IsEngineRunning = true;
    }
    void DisplayDetails(){
        System.out.println("Model: "+super.Model);
        System.out.println("Colour : "+this.Colour);
        System.out.println("Year : "+super.Year);
        System.out.println("IsEngineRunning : "+this.IsEngineRunning);
        System.out.println("Fuel Level : "+this.FuelLevel+"%");
    }
}
public class Main {
    public static void main(String[] args) {
        Car mycar = new Car("Toyota","Black",2023,100);
        mycar.StartVechile();
        mycar.IncreaseSpeed();
        mycar.IncreaseSpeed();
        mycar.DisplayDetails();
        mycar.StopVechile();
    }
}