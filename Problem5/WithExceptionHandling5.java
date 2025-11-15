package Problem5;

import javax.swing.JOptionPane;

public class WithExceptionHandling5 {
	
	// Step 2: Method that checks age and throws exception if below 18
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Access denied – Age must be 18 or older.");
        } else {
            JOptionPane.showMessageDialog(null, "Access granted.");
        }
    }

    public static void main(String[] args) {
        try {
            String input = JOptionPane.showInputDialog("Enter your age:");
            int age = Integer.parseInt(input);
            checkAge(age);
        } 
        catch (InvalidAgeException arayko1) {
            JOptionPane.showMessageDialog(null, "Error: " + arayko1.getMessage());
        }
        catch (NumberFormatException arayko2) {
            JOptionPane.showMessageDialog(null, "Error: Input Lageg Number Dong !!");
        }
    }
}
