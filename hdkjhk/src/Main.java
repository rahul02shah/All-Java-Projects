import java.io.*;
class Serilization{
    public static void main(String[] args) {
        Student s1 = new Student("Rahul Kumar Shah",78);
        try{
            FileOutputStream Fout = new FileOutputStream("output.txt");
            ObjectOutputStream Out = new ObjectOutputStream(Fout);
            Out.writeObject(s1);
            Out.close();
            Fout.close();
            System.out.println("object serilization saved to output.txt");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
class Student extends Serilization{
    private  String name;
    private  int age;
    Student(String name, int age){
        this.name = name;
        this.age = age;
    };
    String GetName(){
        return this.name;
    }
    int GetAge(){
        return  this.age;
    }

}