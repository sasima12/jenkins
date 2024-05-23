import java.util.Scanner;

public class FindStringLength {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        if (scanner.hasNextLine()) {
            
            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();

            
            int length = inputString.length();

            
            System.out.println("The length of the string is: " + length);
        } else {
            System.out.println("No input provided.");
        }

        
        scanner.close();
    }
}