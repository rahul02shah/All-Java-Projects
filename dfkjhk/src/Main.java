import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File MyFile = new File("output.txt");
        try{
            MyFile.createNewFile();
        }catch (Exception e){
            e.printStackTrace();
        }
        try{
            FileWriter fileWriter = new FileWriter("Output.txt");
            fileWriter.write("Hello Myself Rahul Kumar shah \n i'm from Rajbiraj ");
            fileWriter.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            Scanner sc = new Scanner(MyFile);
            while(sc.hasNextLine()){
                String Line = sc.nextLine();
                System.out.println(Line);
            }
            sc.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}