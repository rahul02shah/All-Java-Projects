class Student{
    String Name,Gender;
    int Age;
    Float GPA;
    Student(String Name,String Gender,int Age,Float Gpa){
        this.Name = Name;
        this.Age = Age;
        this.GPA = Gpa;
    }
    void SetName(String Name){
        this.Name = Name;
    }
    void SetAge(int Age){
        this.Age = Age;
    }
    void SetGpa(Float Gpa){
        this.GPA = Gpa;
    }
    String GetName(){
        return this.Name;
    }
    int GetAge(){
        return Age;
    }
    Float GetGPA(){
        return GPA;
    }
    void PrintInfo(){
        System.out.println("Name: "+GetName());
        System.out.println("Age: "+GetAge());
        System.out.println("GPA : "+GetGPA());
    }
}
public class Main {
    public static void main(String[] args) {
        Student S1 = new Student("Rahul Shah","Male",18,3.9F);
        S1.PrintInfo();
    }
}