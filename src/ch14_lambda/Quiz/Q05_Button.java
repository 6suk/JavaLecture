package ch14_lambda.Quiz;

public class Q05_Button {
	@FunctionalInterface
	public static interface ClickListener {
		void onClick();
	}

	// 필드
	private ClickListener clickListener;

	// 메소드
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}

	public void click() {
		this.clickListener.onClick();
	}

	public static void main(String[] args) {
		Q05_Button btnOk = new Q05_Button();
		btnOk.setClickListener(() -> System.out.println("Ok 버튼을 클릭했습니다."));
		btnOk.click();
		
		Q05_Button btnCancel = new Q05_Button();
		btnCancel.setClickListener(() -> System.out.println("Cancel 버튼을 클릭했습니다."));
		btnCancel.click();
	}
}
