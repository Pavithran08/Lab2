import java.io.*; 
 
class MyFileAPI extends File { 
    MyFileAPI(String filename) { 
        super(filename); // Calls the constructor of the superclass (File) with the provided filename 
    } 
 
    public static void main(String[] ar) throws Exception { 
        MyFileAPI myfile = new MyFileAPI("My.txt"); // Creates an instance of MyFileAPI with the filename "My.txt" 
        if (myfile.exists()) { // Checks if the file exists 
            System.out.println("File Exists!"); 
        } else { 
            System.out.println("File does not exist! Try another file name"); 
        } 
    } 
}