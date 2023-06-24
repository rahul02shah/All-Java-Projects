class Student{
    private String Name;
    void setname(String Name){
        this.Name = Name;
    }
    void getName(){
        System.out.println(this.Name);
    }
}
public class Main {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setname("Rahul Shah");
        obj.getName();
    }
}