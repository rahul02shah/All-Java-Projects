import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Open the input file for reading
            BufferedReader reader = new BufferedReader(new FileReader("src/input.txt"));

            // Open the output file for writing
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/output.txt"));

            // Initialize the word count to zero
            int wordCount = 0;

            // Read each line of the input file
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line into words using whitespace as the delimiter
                String[] words = line.split("\\s+");
                // Increment the word count by the number of words in the line
                wordCount += words.length;
            }

            // Write the word count to the output file
            writer.write("Word count: " + wordCount);

            // Close the input and output files
            reader.close();
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}