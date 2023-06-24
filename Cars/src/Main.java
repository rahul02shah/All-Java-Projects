class Car{
    Car(){
        System.out.println("Deafault Constructor");
    };
    Car(String Name){
        System.out.println(Name);
    }
    Car(String Name, String Colour){
        System.out.println("Car : "+Name);
        System.out.println("Colour : "+ Colour);
    }
    Car(String Name, String Colour,Double Price ){
        System.out.println("Car : "+Name);
        System.out.println("Colour : "+ Colour);
        System.out.println("Price is : "+Price);
    }
}
public class Main {
    public static void main(String[] args) {
        Car obj1 = new Car();
        Car obj2 = new Car("Ford");
        Car obj3 = new Car("Royals Race","Black");
        Car obj4 = new Car("Toyota","Black",129588.755);
    }
}