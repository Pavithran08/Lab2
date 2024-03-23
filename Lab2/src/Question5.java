import java.io.*; 
 
class MyReader extends FileReader { 
    File file; 
 
    MyReader(File file) throws Exception { 
        super(file); 
        this.file = file; 
    } 
 
    MyReader(String filename) throws Exception { 
        super(filename); 
        file = new File(filename); 
    } 
 
    public String readContent() throws Exception { 
        StringBuilder stringBuilder = new StringBuilder(); 
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) { 
            String line; 
            while ((line = bufferedReader.readLine()) != null) { 
                stringBuilder.append(line); 
            } 
        } 
        return stringBuilder.toString(); 
    } 
 
    public static void main(String[] args) throws Exception { 
        MyReader reader = new MyReader("Welcome.txt"); 
        System.out.println(reader.readContent()); 
 
        File file = new File("Welcome.txt"); 
        MyReader reader2 = new MyReader(file); 
        System.out.println(reader2.readContent()); 
    } 
}
