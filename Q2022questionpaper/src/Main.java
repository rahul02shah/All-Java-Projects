abstract class GeometricObject{
    double PI = Math.PI;
    abstract  double getArea();
    abstract double getPerimeter();
}
class Circle extends GeometricObject{
    Double Radius;
    Circle(Double radius){
        this.Radius = radius;
    }
    @Override
    public double getArea(){
        return PI*Radius*Radius;
    }
    @Override
    public double getPerimeter(){
        return 2*PI*Radius;
    }
    @Override
    public String toString(){
        return "Radius of a circle is : "+Radius;
    }
}
class Rectangle extends GeometricObject{
    double Length,Breadth;
    Rectangle(double length, double breadth){
        this.Length = length;
        this.Breadth = breadth;
    }
    @Override
    public double getArea(){
        return Length*Breadth;
    }
    @Override
    public double getPerimeter(){
        return 2*(Length+Breadth);
    }
    @Override
    public String toString(){
        return "Length and Breadth is "+Length+Breadth;
    }
}
interface  Resizeable {
    void resize(int Percent);
}
class ResizeableCircle extends Circle implements Resizeable{
    ResizeableCircle(double radius){
        super(radius);
    }
    @Override
    public  void resize(int Percent){
        Radius *= (1+Percent/100);
    }
    @Override
    public  String toString(){
        return "resized Radius is : "+Radius;
    }
}
class ResizeableRectangle extends  Rectangle implements Resizeable{
    ResizeableRectangle(double length,double breadth){
        super(length,breadth);
    }
    @Override
    public  void resize(int Percent){
        Length *= (1+Percent/100);
        Breadth *= (1+Percent/100);
    }
    @Override
    public String toString(){
        return "Resize length and breadth is "+Length+Breadth;
    }
}
public class Main {
    public static void main(String[] args) {
        Circle obj1 = new Circle(7D);
        System.out.println(obj1.getArea());
        System.out.println(obj1.getPerimeter());
        System.out.println(obj1.toString());
        Rectangle obj2 = new Rectangle(7,9);
        System.out.println(obj2.getArea());
        System.out.println(obj2.getPerimeter());
        System.out.println(obj2.toString());
        ResizeableRectangle obj3 = new ResizeableRectangle(3,4);
        obj3.resize(50);
        System.out.println(obj3.getArea());
        System.out.println(obj3.getPerimeter());
    }
}