class Cuboid{
    double length;
    double breadth;
    double height;
    double volume;
    double surfaceArea;
    Cuboid(double length, double breadth, double height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    void calculateVolume(){
        volume = length * breadth * height;
    }
    void calculateSurfaceArea(){
        surfaceArea = 2 * (length * breadth + breadth * height + height * length);
    }
    void display(){
        System.out.println("Volume: " + volume);
        System.out.println("Surface Area: " + surfaceArea);
    }
}
public class Test2 {
    public static void main(String[] args) {
        Cuboid c1 = new Cuboid(10, 5, 7);
        c1.calculateVolume();
        c1.calculateSurfaceArea();
        c1.display();
    }
}
