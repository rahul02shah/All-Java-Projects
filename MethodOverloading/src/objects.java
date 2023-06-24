public class objects {
    public static void main(String[] args) {
        Student s [];
        s = new Student[10];
        for(int i =0 ;i<10;i++){
            s[i]=new Student();
            s[i].setRollno(i);
            s[i].setName("John");
            System.out.println(s[i].getRollno());
            System.out.println(s[i].getName());


        }
        Employee obj = new Employee();
        obj.setEmpid(12);
        obj.setName("Rahul");
        System.out.println(obj.getEmpid());
        System.out.println(obj.getName());
    }
}
class Employee{
    private int empid;
    private String name;
    public void setEmpid(int empid){
        this.empid = empid;
    }
    public int getEmpid(){
        return empid;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
