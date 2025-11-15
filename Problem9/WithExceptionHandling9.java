package Problem9;

import javax.swing.JOptionPane;

public class WithExceptionHandling9 {

    public static void validateContactNumber(String contact) throws InvalidContactException {
        if (contact.length() != 11 || !contact.startsWith("09")) {
            throw new InvalidContactException("Invalid contact number format!");
        }
    }

    public static void main(String[] args) {
        try {
            String input = JOptionPane.showInputDialog("Enter contact number:");
     
            validateContactNumber(input);
            
            JOptionPane.showMessageDialog(null, "Valid contact number: " + input);
        } 
        catch (InvalidContactException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
}
