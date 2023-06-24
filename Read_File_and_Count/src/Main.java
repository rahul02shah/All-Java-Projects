import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
public class Main {
 public static    int global=0;
    static void SetCountedData(int count){
        try{
            FileWriter fileWriter = new FileWriter("output.txt");
            fileWriter.write("Counted Data iS : "+count);
            fileWriter.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        File MyFile = new File("src/input.txt");
        try{
            if(MyFile.exists()){
                Scanner sc = new Scanner(MyFile);
                while(sc.hasNextLine()){
                    String Words = sc.nextLine();
                    String []ArrayWords= Words.split("\\s+");
                    int wordcount =0;
                    wordcount = wordcount + ArrayWords.length;
                    global=wordcount;
                    System.out.println(global);
                }


            }else{
                throw new Exception("file Not found");
            }
        }catch (Exception e){
            System.out.println(e);
        }
        try{
            File Myfile = new File("Output.txt");
            if(Myfile.exists()){
                SetCountedData(global);
            }else{
                Myfile.createNewFile();
                SetCountedData(global);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}