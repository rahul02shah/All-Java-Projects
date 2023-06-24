// using set get method in Student class
public class Student {
    int rollno;
    String name;
    public void setRollno (int rn){
        rollno = rn;
    }
    public int getRollno(){
        return rollno;
    }
    public void setName (String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setRollno(2);
        s1.setName("Rahul");
        System.out.println(s1.getRollno());
        System.out.println(s1.getName());
    }
}
