class Person {
    private String name;
    private int age;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public double getTax() {
        double tax = 0;
        if (salary < 50000) {
            tax = salary * 0.1;
        } else if (salary >= 50000 && salary <= 100000) {
            tax = salary * 0.2;
        } else if (salary > 100000) {
            tax = salary * 0.3;
        }
        return tax;
    }
}
public class Main{
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        person.setAge(35);
        person.setSalary(75000);

        double tax = person.getTax();
        System.out.println("Tax amount: $" + tax);
    }
}