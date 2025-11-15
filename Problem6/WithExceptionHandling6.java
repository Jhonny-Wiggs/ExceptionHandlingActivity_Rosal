package Problem6;

import javax.swing.JOptionPane;

public class WithExceptionHandling6 {
    public static void withdraw(double balance, double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient funds!");
        } else {
            balance -= amount;
            JOptionPane.showMessageDialog(null, "Withdrawal successful! Remaining balance: " + balance);
        }
    }

    public static void main(String[] args) {
        double balance = 1000;
        try {
            String input = JOptionPane.showInputDialog("Enter withdrawal amount:");
            double amount = Double.parseDouble(input);
            withdraw(balance, amount);
        } 
        catch (InsufficientBalanceException arayko1) {
            JOptionPane.showMessageDialog(null, "Transaction error: " + arayko1.getMessage());
        } 
        catch (NumberFormatException arayko2) {
            JOptionPane.showMessageDialog(null, "Error: Suwata Lageg Tarung Gaw!! Number Lage Na !!");
        } 
        finally {
            JOptionPane.showMessageDialog(null, "Transaction completed.");
        }
        
    }
}
