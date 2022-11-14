package ch07;

public class Ex02_Main {

	public static void main(String[] args) {
		Ex02_Parent parent1 = new Ex02_Parent();
		parent1.parentInt = 10;
		parent1.parentMethod();	//	Parent : 10
		
		Ex02_Child child1 = new Ex02_Child();
		child1.childInt = 5;
		child1.parentInt = 300;
		
		child1.parentMethod();	//	Child : 300
		child1.childMethod();	//	Parent : 300, Child : 5
		

		
		
	}

}
