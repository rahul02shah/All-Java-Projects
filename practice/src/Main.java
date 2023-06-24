abstract class Employee{
    Double Salary;
    String Name;
    abstract public int AddData(int a,int b);
}
class EmpData extends Employee{
    public int AddData(int a,int b){
        return a+b;
    }
}
public class Main{
    public static void main(String[] args) {
        Employee obj = new EmpData();
//        EmpData obj1 = new Employee();
        int add = obj.AddData(4,5);
        System.out.println(add);
    }
}