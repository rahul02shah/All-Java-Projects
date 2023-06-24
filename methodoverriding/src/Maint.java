import java.util.Scanner;
interface LoginCredietials{
    void Input();
    void Output();
}
public class Maint implements LoginCredietials {
    String Username, password;
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The UserName : ");
         Username = sc.nextLine();
        System.out.println("Enter The Password : ");
        password = sc.nextLine();
    }
    public void Output(){
        System.out.println("username : "+this.Username+" Password : "+this.password);
    }
    public static void main(String[] args) {
        LoginCredietials obj = new Maint();
        obj.Input();
        obj.Output();
    }
}
