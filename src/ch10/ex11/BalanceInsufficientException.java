package ch10.ex11;

public class BalanceInsufficientException extends RuntimeException{
	BalanceInsufficientException() { }

	BalanceInsufficientException(String message) {
		super(message);
	}
}
