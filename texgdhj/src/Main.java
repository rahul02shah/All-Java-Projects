
class Employees {
    public int id = 20;
    private int salary;
}
class tdata extends Employees{
    public String name = "Rahul Kumar Sah";
}
public class Main {
    public static void main(String[] args) {
        tdata obj = new tdata();
        System.out.println(obj.name);
        System.out.println(obj.id);
    }
}