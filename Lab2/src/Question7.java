import java.io.*; 
 
public class Question7 { 
    public static void main(String[] args) { 
        // File path 
        String filePath = "Welcome.txt"; 
        // Text to insert 
        String textToInsert = "Welcome To UTeM"; 
 
        try { 
            // Open the file in append mode 
            FileWriter fileWriter = new FileWriter(filePath, true); 
            // Create a BufferedWriter object to write to the file 
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); 
             
            // Write the text to the file 
            bufferedWriter.write(textToInsert); 
            // Write a new line for better readability 
            bufferedWriter.newLine(); 
             
            // Close the BufferedWriter 
            bufferedWriter.close(); 
             
            System.out.println("Text inserted successfully into the file."); 
        } catch (IOException e) { 
            // Handle IO Exception 
            System.out.println("Error occurred: " + e.getMessage()); 
        } 
    } 
}