import java.io.*;
public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader Reader = new BufferedReader(new FileReader("src/input.txt"));
            String line;
            while((line = Reader.readLine())!= null){
                System.out.println(line);
            }
            Reader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}