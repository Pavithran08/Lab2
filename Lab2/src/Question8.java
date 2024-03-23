import java.io.File; 
import java.io.FileWriter; 
import java.io.IOException; 
 
public class Question8 { 
 
    public static void main(String[] args) { 
        String fileName = "example.txt"; 
        File file = new File(fileName); 
 
        try { 
            if (file.exists()) { 
                // Append the file with "Software Engineering Department" 
                FileWriter fileWriter = new FileWriter(fileName, true); 
                fileWriter.write("Software Engineering Department\n"); 
                fileWriter.close(); 
                System.out.println("Text appended to existing file."); 
            } else { 
                // Create a new file "WelcomeAgain.txt" and write "Welcome to UTeM" 
                FileWriter fileWriter = new FileWriter("WelcomeAgain.txt"); 
                fileWriter.write("Welcome to UTeM\n"); 
                fileWriter.close(); 
                System.out.println("New file created and text written."); 
            } 
        } catch (IOException e) { 
            System.out.println("An error occurred."); 
            e.printStackTrace(); 
        } 
    } 
}