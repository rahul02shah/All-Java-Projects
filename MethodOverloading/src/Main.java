public class Main {
    public static void main(String[] args) {
        int length = 10;
        int breadth = 5;
        int height = 7;
        System.out.println("Area Of Rectangle : "+ area(length, breadth));
        System.out.println("Area Of Triangle : "+ area(length, breadth, height));
        System.out.println("Area Of Circle : "+ area(length));
    }
    static int area(int length, int breadth) {
        return length * breadth;
    }
    static int area(int length, int breadth, int height) {
        return length * breadth * height;
    }
    static double area(int radius) {
        return 3.14 * radius * radius;
    }
}