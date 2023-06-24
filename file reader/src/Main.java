import java.io.*;
public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader Reader = new BufferedReader(new FileReader("src/input.txt"));
            BufferedWriter Writer = new BufferedWriter(new FileWriter("output.txt"));
            String Line ;
            int wordcount = 0;
            while ((Line = Reader.readLine())!=null){
                String [] words = Line.split("\\s+");
                wordcount = wordcount + words.length;
            }
            Writer.write("counted words : "+wordcount);
            Reader.close();
            Writer.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}