package Problem2;

import javax.swing.JOptionPane;

public class WithExceptionHandling2 {

	public static void main(String[] args) {
		
		int[] grades = {67, 67, 67, 67, 67};
		
		try {
			int index = Integer.parseInt(JOptionPane.showInputDialog("Enter student index (0-4): "));
			JOptionPane.showMessageDialog(null, "Grade: " + grades[index]);
		}
		catch(ArrayIndexOutOfBoundsException arayko1) {
			JOptionPane.showMessageDialog(null, "Error: Invalid student index!");
		}
		catch(NumberFormatException arayko2) {
			JOptionPane.showMessageDialog(null, "Error: Invalid input!");
		}
	}
}
