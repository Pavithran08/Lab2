import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		 
        System.out.println("Insert your first number:"); 
        double firstNumber = scanner.nextDouble(); 
 
        System.out.println("Insert your second number:"); 
        double secondNumber = scanner.nextDouble(); 
 
        double sum = firstNumber + secondNumber; 
 
        System.out.println("The sum of the two values is: " + sum); 

	}

}
