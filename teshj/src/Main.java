interface Parent{
    void Parent();
}
interface Child{
    void Child();
}
class GrandChild implements Parent,Child{
    public void Parent(){
        System.out.println("Hello I'm Parent");
    }
    public void Child(){
        System.out.println("Hello I'm Child");
    }
}
public class Main{
    public static void main(String[] args) {
        GrandChild obj = new GrandChild();
        obj.Child();
        obj.Parent();
    }
}