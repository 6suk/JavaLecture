package ch08_Ex12;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("========Ex12_InterfaceC타입 = ImplementClass==========================");
		InterfaceC ic = new ImplementClass();
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
		System.out.println("========ImplementClass타입 = ImplementClass==========================");
		ImplementClass ipc = new ImplementClass();
		ipc.methodA();
		ipc.methodB();
		ipc.methodC();
		
		System.out.println("============Ex12_Misc타입 = Ex12_Misc======================");
		Misc misc = new Misc();
		misc.methodA();
		misc.methodB();
		misc.methodC();
		misc.methodParent();
		
		System.out.println("============ImplementClass타입 = Ex12_Misc======================");
		ic = misc; //다형성 interface의 메소드만 사용할 수 있다.
		misc.methodA();
		misc.methodB();
		misc.methodC();
		
	}

}
