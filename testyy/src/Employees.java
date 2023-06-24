import java.util.*;
class Employees {
    public String name;
    private double salary;
    void setname(String empname){
        name = empname;
    }
    void setSalary(int empsalary){
        salary = empsalary;
    }
    void empdisplay(){
        System.out.println(name);
        System.out.println(salary);
    }
    public static void main (String[] args){
        Employees obj = new Employees();
        obj.setname("Rahul Shah");
        obj.setSalary(20000);
        obj.empdisplay();
    }
}