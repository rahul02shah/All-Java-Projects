import java.util.*;

public class TODO_LIST {
    public static void main(String[] args) {
        List <String> TODOLIST = new ArrayList<>();
        TODOLIST.add("Buy chocolaate");
        TODOLIST.add("Buy mango");
        TODOLIST.add("purchase successful");
        System.out.println(TODOLIST.get(1));
        Set <String> emailaddress = new HashSet<>();
        emailaddress.add("abc@gmail.com");
        emailaddress.add("def@gmail.com");
        System.out.println(emailaddress);
    }
}
