class Moon{
    void shine(){
        System.out.println("won't be displayed");
    }
}
class Stars extends Moon{
    void shine(){
        System.out.println("Sparkling....");
    }
}
public class Main {
    public static void main(String[] args) {
        Moon obj = new Stars();
        obj.shine();
        Stars obj1 = (Stars) obj;
        obj1.shine();
    }
}