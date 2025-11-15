package Problem7;

import java.util.InputMismatchException;// para mogana ang samok nga exception, nganu ipaagi pani scanner sir huhuhu
import java.util.Scanner; 
import javax.swing.JOptionPane;

public class WithExceptionHandling7 {

	public static void main(String[] args) {
        String[] products = {"iPhone 13 512GB", "iPhone 14 512GB", "iPhone 15 512GB", "iPhone 16 Pro 1TB", "iPhone 17 Pro Max 1TB"};
        double[] prices = {57990.00, 53990.00, 62990.00, 101990.00, 116990.00};

        Scanner input = new Scanner(System.in);
        System.out.print("Enter product index (0–4): ");

        try {
        	int index = input.nextInt();

            JOptionPane.showMessageDialog(null, "Product: " + products[index] + "\nPrice: ₱" + prices[index]);
        } 
        catch (ArrayIndexOutOfBoundsException arayko1) {
                JOptionPane.showMessageDialog(null, "Error: Ayaw lageg lapas sa Index Range Dong!! Aynakoo :( ");
        }
        catch (InputMismatchException arayko2) {
            JOptionPane.showMessageDialog(null, "Error: Please enter a numeric index!");
        } 
        finally {
            JOptionPane.showMessageDialog(null, "Inventory lookup complete.");
        }
        input.close();
	}
}
