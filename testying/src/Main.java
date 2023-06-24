class car {
    String name;
    String Colour;
    int price;
    void setData(String name,String colour,int price){
        this.name = name;
        this.price= price;
        this.Colour = colour;
    }
    void displaydata(){
        System.out.println(this.name+this.Colour+this.price);
    }
}
public class Main {
    public static void main(String[] args) {
        car obj = new car();
        obj.setData("Ford","Phantom Purple",2000000000);
        obj.displaydata();
    }
}