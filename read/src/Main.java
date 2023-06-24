import java.io.*;
public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader Reader = new BufferedReader(new FileReader("src/input.txt"));
            BufferedWriter Writer = new BufferedWriter(new FileWriter("Output.txt"));
            int wordcount =0;
            String Line;
            while((Line = Reader.readLine())!= null){
                String [] Words = Line.split("\\s+");
                wordcount = wordcount + Words.length;
            }
            Writer.write("Counted Words is : "+wordcount);
            Reader.close();
            Writer.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}