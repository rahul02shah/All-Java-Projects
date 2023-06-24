// recoding employee information usinng method and Set get method
class RecordEmployee {
    String name;
    int age;
    float salary;
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setAge(int a){
        age = a;
    }
    public int getAge(){
        return age;
    }
    public void setSalary(float s){
        salary = s;
    }
    public float getSalary(){
        return salary;
    }
}

public class Employees {
    public static void main(String[] args) {
        RecordEmployee e1 = new RecordEmployee();
        e1.setName("Rahul");
        e1.setAge(19);
        e1.setSalary(45000);
        System.out.println(e1.getName());
        System.out.println(e1.getAge());
        System.out.println(e1.getSalary());
    }
}
