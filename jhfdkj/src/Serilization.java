import java.io.*;
public class Serilization {
    public static void main(String[] args) {
        Person obj1 = new Person("Rahul shah",89);
        try{
            FileOutputStream Fout = new FileOutputStream("output.txt");
            ObjectOutputStream out = new ObjectOutputStream(Fout);
            out.writeObject(obj1);
            out.close();
            Fout.close();
            System.out.println("object serilized succesfully");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
class Person implements Serializable{
    private String name;
    private  int id;
    public Person (String name, int id){
        this.name = name;
        this.id = id;
    }
    public String Getname(){
        return  name;
    }
     public int id (){
        return id;
    }
}