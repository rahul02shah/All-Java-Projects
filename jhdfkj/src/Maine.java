class Student{
    String Name;
    int Age ;
    String Gender;
    float GPA;
    Student(String name, int age, String Gender,float GPA){
        this.Name = name;
        this.Age = age;
        this.Gender = Gender;
        this.GPA = GPA;
    }
    String GetData(){
        String Managed_Data = "Hello Myself "+this.Name+". age = "+this.Age+"gender : "+this.Gender+"and i've scored "+this.GPA+"GPA";
        return Managed_Data;
    }
    void PrintInfo(){
        String data = this.GetData();
        System.out.println(data);
    }
}
public class Maine {
    public static void main(String[] args) {
        Student obj = new Student("Rahul shah",19,"Male",3.56F);
        obj.PrintInfo();
    }
}
