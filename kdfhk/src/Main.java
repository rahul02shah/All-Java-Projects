import java.io.*;
public class Main {
    public static void main(String[] args) {
        String data;
        try{
            BufferedReader Reader = new BufferedReader(new FileReader("src/ input.txt"));
            while((data = Reader.readLine())!= null){
                System.out.println(data);
            }
        }catch (Exception E){
            System.out.println(E);
        }
    }
}