import java.util.Scanner;
import java.util.Random;
class Customer{
    int id;
    String name;
    String address;
    void setData(String name,String address, int id){
        this.address = address;
        this.id = id;
        this.name = name;
    }
    String MailGenerate(String name, int number){

        return name+number+"@gmail.com";
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Customer obj = new Customer();
        Random number = new Random();
        int limit = 100;
        int randomnumber = number.nextInt(limit);
        System.out.println("Enter Your Name");
        String Name = input.nextLine();
        System.out.println("Enter Your Address");
        String Address = input.nextLine();
        System.out.println("Enter the ID : ");
        int ID = input.nextInt();
        obj.setData(Name,Address,ID);
        String MailAddress = obj.MailGenerate(Name,randomnumber);
        System.out.println("mail is : "+MailAddress);
    }
}