package ch14_lambda_self;

public class Ex03_Button {
	
	// 정적 멤버 인터페이스
	public static interface ClickListener{
		void onClick();
	}
	
	private ClickListener clickListener;
	
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {
		this.clickListener.onClick();
	}
	
}
