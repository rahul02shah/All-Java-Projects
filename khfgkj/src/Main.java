import java.io.Serializable;
import java.io.*;
class Employee implements Serializable{
    int id;
    String Name;
    public Employee(int id,String Name){
        this.Name = Name;
        this.id = id;
    }
}
public class Main {
    public static void main(String[] args) {
        try{
            Employee obj = new Employee(20,"Rahul Shah");
            FileOutputStream Fout = new FileOutputStream("file.txt");
            ObjectOutputStream Out = new ObjectOutputStream(Fout);
            Out.writeObject(obj);
            Out.flush();
            Out.close();
            System.out.println("Success");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}