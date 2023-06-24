class person{
    protected String name;
    protected int id;
    public void setdata(String name, int id){
        this.name = name;
        this.id = id;
    }
    public void display (){
        System.out.println("Name Is : "+ this.name);
        System.out.println("Id is : "+ this.id);
    }
}
class employee extends person {
    protected String Department;
    protected int salary;
    public void getdata(String name,int id,String Department,int salary){
        setdata(name, id);
        this.salary = salary;
        this.Department = Department;
    }
    public void displyemployeedetails(){
        display();
        System.out.println("Department is : "+Department);
        System.out.println("Salary is : "+ salary);
    }
}
public class Main2 {
    public static void main(String[] args) {
        employee obj = new employee();
        obj.getdata("Rahul Shah",20,"IT",20000);
        obj.displyemployeedetails();
    }
}
