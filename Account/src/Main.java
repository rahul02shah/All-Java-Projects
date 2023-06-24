class Account{
    String name;
    float amount;
    Account(String name,float amount){
        this.name = name;
        this.amount = amount;
    }
    float deposit (float amount){
        Float TotalAMT = this.amount + amount;
        return TotalAMT;
    }
    float withdraw(float amount){
        float withdraW = this.amount - amount;
        return withdraW;
    }
    void display(){
        System.out.println(this.name);
    }
}
public class Main {
    public static void main(String[] args) {
        Account obj = new Account("Rahul Shah",20000.78F);
        float reamainngamt = obj.deposit(2000.98F);
        float amountleft = obj.withdraw(100.89F);
        System.out.println(reamainngamt);
        System.out.println(amountleft);
        obj.display();
    }
}