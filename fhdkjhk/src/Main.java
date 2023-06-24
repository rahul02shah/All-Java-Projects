abstract class GeometricObject {
    public static final double PI = Math.PI;

    abstract double getPerimeter();

    abstract double area();
}

class Circle extends GeometricObject {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    double area() {
        return PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle with radius " + radius;
    }
}

class Rectangle extends GeometricObject {
    double length, breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double getPerimeter() {
        return 2 * (length + breadth);
    }

    @Override
    double area() {
        return length * breadth;
    }

    @Override
    public String toString() {
        return "Rectangle with length " + length + " and breadth " + breadth;
    }
}

interface Resizeable {
    void resize(int percent);
}

class ResizeableCircle extends Circle implements Resizeable {
    ResizeableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        radius *= (1 + percent / 100.0);
    }

    @Override
    public String toString() {
        return "Resizeable circle with radius " + radius;
    }
}

class ResizeableRectangle extends Rectangle implements Resizeable {
    ResizeableRectangle(double length, double breadth) {
        super(length, breadth);
    }

    @Override
    public void resize(int percent) {
        length *= (1 + percent / 100.0);
        breadth *= (1 + percent / 100.0);
    }

    @Override
    public String toString() {
        return "Resizeable rectangle with length " + length + " and breadth " + breadth;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(1.0);
        System.out.println(c1);
        System.out.println("Area of circle: " + c1.area());
        System.out.println("Perimeter of circle: " + c1.getPerimeter());

        Rectangle r1 = new Rectangle(1, 1);
        System.out.println(r1);
        System.out.println("Area of rectangle: " + r1.area());
        System.out.println("Perimeter of rectangle: " + r1.getPerimeter());

        ResizeableCircle rc1 = new ResizeableCircle(2.0);
        System.out.println(rc1);
        System.out.println("Area of resizable circle: " + rc1.area());
        System.out.println("Perimeter of resizable circle: " + rc1.getPerimeter());
        rc1.resize(50);
        System.out.println("Resized circle: " + rc1);
        System.out.println("Area of resized circle: " + rc1.area());
        System.out.println("Perimeter of resized circle: " + rc1.getPerimeter());

        ResizeableRectangle rr1 = new ResizeableRectangle(2, 3);
        System.out.println(rr1);
        System.out.println("Area of resizable rectangle: " + rr1.area());
        System.out.println("Perimeter of resizable rectangle: " + rr1.getPerimeter());
        rr1.resize(50);
        System.out.println("Resized rectangle: " + rr1);
        System.out.println("Area of resized rectangle: " + rr1.area());
        System.out.println("Perimeter of resized rectangle: " + rr1.getPerimeter());
    }
}