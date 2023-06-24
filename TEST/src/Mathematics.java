class Cuboid{
    int length;
    int breadth;
    int height;
    public Cuboid(int l,int b,int h){
        this.length = l;
        this.breadth = b;
        this.height = h;
    }
    void CalculateVolume(){
        System.out.println("Volume of cuboid is "+(length*breadth*height));
    }
    int Calculatearea(){
        return 2*(length*breadth+length*height+breadth*height);
    }
}
public class Mathematics {
    public static void main(String[] args) {
        Cuboid c = new Cuboid(10,20,30);
        System.out.println(c.length);
        System.out.println(c.breadth);
        System.out.println(c.height);
        c.CalculateVolume();
        System.out.println(c.Calculatearea());
        int a = c.Calculatearea();
        System.out.println(a);
    }

}
