class Employees{
    private String name;
    private int salary;
    public void setdata(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public void display (){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
}
class empdetails extends Employees{
    String address;
    int bonus;
    public void empdetailss(int salary,int bonus,String name, String Address){
        this.setdata(name, salary);
        this.bonus = bonus;
        this.address = Address;
    }
    public void displaymaon() {
        System.out.println("bonus: "+bonus);
        System.out.println("Address: "+address);
    }
}
public class Main1 {
    public static void main(String[] args) {
        empdetails emp = new empdetails();
        emp.empdetailss(1000, 2000, "John", "USA");
        emp.display();
        emp.displaymaon();
    }
}
