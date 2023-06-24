class Employee{
    int Id = 98 ;
    String Name = new String("Ramesh");
    String Department = new String("Technical");
    Employee(){
    }
    Employee(String naam, int iid){
        this.Id =iid;
        this.Name = naam;
    }
    void setData(int a,String b, String c){
        this.Id = a;
        this.Name = b;
        this.Department = c;
    }
    void getData(){
        System.out.println(this.Id+" "+this.Name+" "+this.Department);
    }
}
public class Try {
    public static void main(String[] args) {
        Employee obj = new Employee();
        Employee obj1 = new Employee("Rahul",78);
        System.out.println(obj.Id+" "+obj.Name+" "+obj.Department);
        System.out.println(obj1.Id+" "+obj1.Name);
        obj.setData(45,"Mango","tingo");
        obj.getData();
;    }
}