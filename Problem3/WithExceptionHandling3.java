package Problem3;

import javax.swing.JOptionPane;

public class WithExceptionHandling3 {

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("Enter a numeric value:");
		try {
			int numValue = Integer.parseInt(input);
			JOptionPane.showMessageDialog(null, "" + numValue);
		}
		catch(NumberFormatException arayko) {
			JOptionPane.showMessageDialog(null, "Error: Please enter a valid integer!");
		}
	}
}
