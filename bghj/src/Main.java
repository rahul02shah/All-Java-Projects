import java.io.*;
public class Main {
    public static void main(String[] args) {
        String Line;
        try{
            BufferedReader Reader = new BufferedReader(new FileReader("src/input.txt"));
            while((Line=Reader.readLine())!= null){
                System.out.println(Line);
            }
        }catch (Exception E){
            System.out.println(E);
        }
    }
}