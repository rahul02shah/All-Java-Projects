
public class Main {
    static int id = 20;
    static String Name = "Lobi";
    static void DisplayData(){
        System.out.println("NAme : "+ Name);
        System.out.println("ID : "+ id);
    }
    void DisplayDatas(){
        System.out.println("NAme : "+ Name);
        System.out.println("ID : "+ id);
    }
    public static void main(String[] args) {
        Main obj  = new Main();
        obj.DisplayDatas();
        DisplayData();
    }
}