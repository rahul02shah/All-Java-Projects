class Cuboid{
    int length;
    int breadth;
    int height;
    void setdata(int l,int b,int h){
        this.breadth = b;
        this.length = l;
        this.height = h;
    }
    void displayVolume(){
        System.out.println("volume of cuboid is : "+2*(length*breadth+breadth*height+length*height));
    }
}
public class Main {
    public static void main(String[] args) {
        Cuboid obj = new Cuboid();
        obj.setdata(2,3,4);
        obj.displayVolume();
    }
}