public class Student {
    // record student name and age and roll number
    private String name;
    private int age;
    private int rollNumber;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
    }
    public int getRollNumber(){
        return rollNumber;
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Rahul");
        s.setAge(20);
        s.setRollNumber(1);
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
        System.out.println("Roll Number: " + s.getRollNumber());
    }
}
