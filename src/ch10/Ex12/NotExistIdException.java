package ch10.Ex12;

/*
 * NotExistIdException - ID가 틀린 경우 
 */

public class NotExistIdException extends RuntimeException{
	NotExistIdException() { }	//생성자

	NotExistIdException(String message) {	//String message 매개변수 생성자
		super(message);
	}
	
	
	
}

/*
 * WrongPasswordException - Password가 틀린경우
 * 새로운 클래스 파일로 만드는걸 권장
 * 
 */


class WrongPasswordException extends RuntimeException{
	WrongPasswordException() { }

	WrongPasswordException(String message) {
		super(message);
	}
}