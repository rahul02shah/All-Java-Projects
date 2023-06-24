import java.util.Scanner;
class Circle{
    Float PI = 3.14F;
    void Area(int radius){
        Float area = PI*radius*radius;
        System.out.println(area);
    }
    void Perimeter(int radius){
        Float Perimeter = 2*PI*radius;
        System.out.println(Perimeter);
    }
}
public class Main {
    public static void main(String[] args) {
        Circle obj1 = new Circle();
        Scanner Obj = new Scanner(System.in);
        System.out.println("Enter The Radius of Circle: ");
        int radius = Obj.nextInt();
        obj1.Area(radius);
        obj1.Perimeter(radius);
    }
}