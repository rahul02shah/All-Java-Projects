import java.lang.Math.*;
class Circle{
    int radius;
    Circle(int radius){
        this.radius = radius;
        System.out.println("radius is : "+this.radius);
    }
    int daimeter(){
        return this.radius*2;
    }
    Double area(){
        return Math.PI*this.radius*this.radius;
    }
    Double perimeter(){
        return  Math.PI*2*this.radius;
    }
}
public class Main {
    public static void main(String[] args) {
        Circle obj = new Circle(7);
        obj.daimeter();
        Double area = obj.area();
        Double perimeter = obj.perimeter();
        System.out.println("area of circle : "+area);
        System.out.println("perimeter is : "+perimeter);
    }
}