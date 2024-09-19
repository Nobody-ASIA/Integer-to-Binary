import java.util.Scanner;

public class BinaryCalcu {
    /*Saldua, Gio Brix R.
     CC1-1B   09/17/24*/
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        while (true) { //loop
        	
            System.out.println("Enter a number to convert to binary or type 'exit' to quit the program: ");
            
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            
            try {
                // Convert the input to an integer
                int number = Integer.parseInt(input);
                
                // Convert the integer to binary using Integer.toBinaryString
                String binaryString = Integer.toBinaryString(number);
                
                System.out.println("Binary representation: " + binaryString);
                
            } catch (NumberFormatException e) {
            	
                System.out.println("Invalid input. Please enter a valid integer or 'exit' to quit.");
            }
        }
        
        scanner.close();
    }
}