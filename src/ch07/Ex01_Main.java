package ch07;

public class Ex01_Main {

	public static void main(String[] args) {
		Ex01_Parent parent = new Ex01_Parent();
		Ex01_Child child = new Ex01_Child();
		
		parent.parenInt = 5;
		parent.parentMethod();
		
		child.childInt = 5;
		child.chileMethod();
		
		child.parenInt = 20;	// 자식이 부모의 필드값 수정 가능
		child.parentMethod();	// 자식이 부모의 메소드 사용 가능
		
		Ex01_Child child2 = new Ex01_Child(200);
		child2.parentMethod();
	}

}
