class Rectangle {
    int length;
    int breadth;

    void setdata (int l,int b){
        this.breadth=b;
        this.length=l;
    };
    void area(){
        System.out.println("area is:"+this.breadth*this.length);
    }
    void perimeter(){
        System.out.println("perimenetr is : "+ 2*(length+breadth) );
    }
}
public class Main {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.setdata(4,5);
        obj.area();
        obj.perimeter();
    }
}