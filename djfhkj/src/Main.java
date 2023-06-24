import org.w3c.dom.css.Rect;

class Parent{
    int length = 5;
    int breadth = 6;
    int radius = 7;
    float PI = 3.14F;
}
class Square_child extends Parent{
    void areaSquare(){
        System.out.println(this.length*this.length);
    }
}
class Rectangle_child extends Parent{
    void areaRectangle(){
        System.out.println(this.length*this.breadth);
    }
}
class Circle_child extends Parent{
    void areaCircle(){
        System.out.println(this.PI*this.radius*this.radius);
    }
}
public class Main{
    public static void main(String[] args) {
        Square_child obj1 = new Square_child();
        Rectangle_child obj2 = new Rectangle_child();
        Circle_child obj3 = new Circle_child();
        obj1.areaSquare();
        obj2.areaRectangle();
        obj3.areaCircle();
    }
}