import java.io.File;
import java.io.FileWriter;
//import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args) {
        File MyFile = new File("rahul.txt");

        if(MyFile.exists()){
            try{
                FileWriter Write = new FileWriter("rahul.txt");
                Write.write("Hello Myself Rahul kumar shah");
                Write.close();
            }catch (Exception e){
                System.out.println(e);
            }
        }else{
            try{
                MyFile.createNewFile();
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}