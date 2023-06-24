// using constructor
class  EmployeesDetails{
    float salary;
    String name;
    int age;
    public EmployeesDetails(String n, int a, float s){
        name = n;
        age = a;
        salary = s;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
    }
}
public class Test1 {
    public static void main(String[] args) {
        EmployeesDetails e1 = new EmployeesDetails("Rahul", 19, 45000);
        EmployeesDetails e2 = new EmployeesDetails("John", 20, 50000);
        e1.display();
        e2.display();
    }
}
