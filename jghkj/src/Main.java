import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File MyFile = new File("Input.txt");

        try{
            MyFile.createNewFile();
            FileWriter Writer = new FileWriter("Input.txt");
            Writer.write("Hello Sir myself Rahul Kumar Shah \n ragjhdg ");
            Writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        try{
            Scanner sc = new Scanner(MyFile);
            while(sc.hasNextLine()){
                String Line = sc.nextLine();
                System.out.println(Line);
            }
            sc.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}