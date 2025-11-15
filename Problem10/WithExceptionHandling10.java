package Problem10;

import javax.swing.JOptionPane;

public class WithExceptionHandling10 {

	public static void main(String[] args) {
		int[] scores = new int[5];
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            boolean validInput = false;
            while (!validInput) {
            	
                try {
                    String input = JOptionPane.showInputDialog("Enter score " + (i + 1) + ":");
                    int score = Integer.parseInt(input);

                    if (score < 0 || score > 100) {
                        throw new InvalidScoreException("Score must be between 0 and 100!");
                    }

                    scores[i] = score;
                    sum += score;
                    validInput = true; 
                } 
                catch (InvalidScoreException e) {
                    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                } 
                catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error: Suwatt Lagehh Og Numberr !!");
                }
            }
        }
        double average = sum / 5.0;
        JOptionPane.showMessageDialog(null, "The average score is: " + average);
	}
}
