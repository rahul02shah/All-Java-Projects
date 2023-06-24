class Employee{
     static String name;
     static int age;
     public void setName(String name) {
         this.name = name;
     }
     public void setAge(int age) {
            this.age = age;
        }

}
class Bonus extends Employee{
    private int bonus;
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    public void display (){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Bonus b = new Bonus();
        emp.setName("John");
        emp.setAge(30);
        b.setBonus(1000);
        b.display();

    }
}