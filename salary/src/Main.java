class Salary{
    private Double Salary = 20000.78;
    void getSalary(){
        System.out.println(this.Salary);
    }
}
public class Main {
    public static void main(String[] args) {
        Salary obj = new Salary();
        obj.getSalary();
    }
}