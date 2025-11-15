package Problem1;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class WithExceptionHandling1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        try {
        	System.out.print("Enter numerator: ");
            int numerator = input.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = input.nextInt();

            int result = numerator / denominator;

            JOptionPane.showMessageDialog(null, "The Quotient is: " + result);
        } 
        catch (ArithmeticException arayko1) {
            JOptionPane.showMessageDialog(null, "Error: Division by zero!");
        } 
        catch (InputMismatchException arayko2) {
            JOptionPane.showMessageDialog(null, "Error: Number Lagi ang Input Badii !!");
        } 
        finally {
            JOptionPane.showMessageDialog(null, "Computation completed.");
        } 
        input.close();
	}
}

