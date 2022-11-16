package ch14_lambda.self;

public class Ex03_Main {
	public static void main(String[] args) {
		//OK 버튼 생성
		Ex03_Button okButton = new Ex03_Button();
		//OK 버튼 객체에 람다식 주입
		okButton.setClickListener(()->System.out.println("Ok 버튼을 클릭했습니다."));
		//OK 버튼 클릭하기
		okButton.click();
		
		//Cancel버튼 생성
		Ex03_Button cancelButton = new Ex03_Button();
		//Cancel 버튼 객체에 람다식 주입
		cancelButton.setClickListener(()->System.out.println("Cancel 버튼을 클릭했습니다."));
		//Cancel 버튼 클릭하기
		cancelButton.click();
		
	}
}
