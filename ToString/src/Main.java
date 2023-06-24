class Employee{
    String Name;
    int Id;
    Employee(String Name,int id){
        this.Name = Name;
        this.Id = id;
    }
    @Override
    public String toString(){
        return "Name :"+this.Name+" ID: "+this.Id;
    };
}
public class Main {
    public static void main(String[] args) {
       Employee obj = new Employee("Rahul Shah",20);
       String StringRepresentation = obj.toString();
        System.out.println(StringRepresentation);
    }
}