package ch07;

public class Ex03_Main {

	public static void main(String[] args) {
		Ex03_SupersonicAirplane ss = new Ex03_SupersonicAirplane();
		ss.takeOff();
		ss.fly();
		ss.flymode = ss.SUPERSONIC;
		ss.fly();
		ss.flymode = ss.NORMAL;
		ss.fly();
		ss.land();
		
	}

}
