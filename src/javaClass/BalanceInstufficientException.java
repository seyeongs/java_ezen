package javaClass;
//사용자 정의 예외 처리
public class BalanceInstufficientException extends Exception{
	public BalanceInstufficientException() {}
	public BalanceInstufficientException(String message) {
		super(message);
	}
	
	
}
