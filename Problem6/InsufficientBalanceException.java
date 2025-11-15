package Problem6;

@SuppressWarnings("serial")
public class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String message) {
        super(message);
    }
}
