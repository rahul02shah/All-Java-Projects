import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        File MyFile = new File("myfile.txt");

        // create file and write data in file
        try{
            if(MyFile.exists()){
                FileWriter Write = new FileWriter("myfile.txt");
                Write.write("Hello Myself Rahul Kumar Shah \n Never Messed Up ");
                Write.close();
            }else{
                MyFile.createNewFile();
                System.out.println("File Has Been Created");
            }
        }catch (Exception e){
            System.out.println(e);
        }
        // read data from file
        try{
            Scanner Input = new Scanner(MyFile);
            while(Input.hasNextLine()){
                String Data = Input.nextLine();
                System.out.println(Data);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}