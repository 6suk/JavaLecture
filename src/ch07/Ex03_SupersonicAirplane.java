package ch07;

public class Ex03_SupersonicAirplane extends Ex03_Airplane{
	// NORMAL - 1, SUPERSONIC -2
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	int flymode = NORMAL;

	// source > Override Method
	@Override
	public void fly() {
		if(flymode == SUPERSONIC)
			System.out.println("초음속 비행합니다.");
		else
			super.fly();
	}
}
