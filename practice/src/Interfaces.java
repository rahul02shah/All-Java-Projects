interface Employees{
    int id =9;
    String Name = "Rahul Kumar Shah";
    Double Salary = 98454.44;
}
class EmpDetails implements Employees{

}
public class Interfaces{
    public static void main(String[] args) {
        EmpDetails obj = new EmpDetails();
        System.out.println(obj.Name);

    }
}