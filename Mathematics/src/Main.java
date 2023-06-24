class Cuboid{
    int length;
    int width;
    int height;

    public Cuboid(int length, int width, int height){
        this.length = length;
        this.width = width;
        this.height = height;
    }
    void getVolume(){
        System.out.println("Volume of Cuboid is: " + (length * width * height));
    }
    void getSurfaceArea(){
        System.out.println("Surface Area of Cuboid is: " + (2 * (length * width + length * height + width * height)));
    }

        }
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Cuboid c = new Cuboid(2, 3, 4);
        c.getVolume();
        c.getSurfaceArea();

    }
}