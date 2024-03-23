public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1 = "9.81"; 
        String strVar2 = "15.5"; 
 
        // Convert strings to floats 
        float var1 = Float.parseFloat(strVar1); 
        float var2 = Float.parseFloat(strVar2); 
 
        // Calculate sum and multiplication 
        float sum = var1 + var2; 
        float multiplication = var1 * var2; 
 
        // Display results 
        System.out.println("Sum: " + sum); 
        System.out.println("Multiplication: " + multiplication); 

	}

}
