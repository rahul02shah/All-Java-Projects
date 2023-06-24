import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        // creating file
        File MyFile = new File("Test.txt");
        try{
            MyFile.createNewFile();
            System.out.println("file created successfully !");
            FileWriter Writer = new FileWriter("Test.txt");
            Writer.write("Hello Myself Rahul Kumar Shah");
            Writer.close();
        }catch (Exception e){
            System.out.println(e);
        }
        // Reading File
        File MyFileObj = new File("Test.txt");
        try{
            Scanner sc = new Scanner(MyFileObj);
            while(sc.hasNextLine()){
                String Line = sc.nextLine();
                System.out.println(Line);
            }
            sc.close();
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
