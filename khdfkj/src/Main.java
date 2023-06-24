import java.io.*;

public class Main {
    public static void main(String[] args) {
        String line;
        int wordCount = 0;
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            BufferedReader reader = new BufferedReader(new FileReader("src/input.txt"));
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
            writer.write("Number of words: " + wordCount);
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}