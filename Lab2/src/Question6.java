import java.io.BufferedReader; 
import java.io.BufferedWriter; 
import java.io.FileReader; 
import java.io.FileWriter; 
import java.io.IOException; 
 
public class FileReadWrite { 
    public static void main(String[] args) { 
        String inputFile = "input.txt"; 
        String outputFile = "output.txt"; 
 
        try { 
            // Reading from input file 
            BufferedReader reader = new BufferedReader(new FileReader(inputFile)); 
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile)); 
 
            String line; 
            while ((line = reader.readLine()) != null) { 
                // Writing to output file 
                writer.write(line); 
                writer.newLine(); // Adding newline character 
            } 
 
            // Closing resources 
            reader.close(); 
            writer.close(); 
 
            System.out.println("File successfully read from and written to."); 
        } catch (IOException e) { 
            System.out.println("An error occurred: " + e.getMessage()); 
            e.printStackTrace(); 
        } 
    } 
}