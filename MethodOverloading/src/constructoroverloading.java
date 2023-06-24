
class car {
    String name;
    int price;
    car (int price){
        System.out.println("constructor is called");
        this.price = price;
        System.out.println(price);
    }
    car (){
        System.out.println("This is  defaultconlstructor ");
    }
    car(String name , int price){
        this.price = price;
        this.name = name;
        System.out.println("price of a car is "+ price);
        System.out.println("Name of a car is "+ name);
    }

}
public class constructoroverloading {
    public static void main(String[] args) {
        car obj ;
        obj = new car(12000);
        car obj1 = new car();
        car boj2 = new car("ford",12989);
    }
}
