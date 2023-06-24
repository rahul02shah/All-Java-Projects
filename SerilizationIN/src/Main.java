import java.io.*;
class Person implements Serializable{
    private String Name;
    int id;
    Person (String Name,int id){
        this.Name = Name;
        this.id = id;
    }
}
public class Main {
    public static void main(String[] args) {
        Person P1 = new Person("Rahul Shah",45);
        try{
            FileOutputStream Fout = new FileOutputStream("person.txt");
            ObjectOutputStream Out = new ObjectOutputStream(Fout);
            Out.writeObject(P1);
            Out.close();
            Fout.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}