class Student{
    String Name;
    int RollNo;
    Double Marks;
    Student(String name,int rollno,Double marks){
        this.Name = name;
        this.RollNo = rollno;
        this.Marks = marks;
    }
    public void DisplayDetails(){
        System.out.println("Name : "+this.Name);
        System.out.println("Roll No : "+this.RollNo);
        System.out.println("Marks :"+this.Marks);
    }
}
public class Main {
    public static void main(String[] args) {
        Student obj = new Student("Rahul Shah",12,92.5D);
        obj.DisplayDetails();
    }
}