package ch08;

public class Ex03_Main {

	public static void main(String[] args) {
		Ex03_SmartTv smartTv = new Ex03_SmartTv();
		smartTv.turnOn();
		smartTv.search("네이버");
		smartTv.setVolume(4);
		smartTv.turnOff();
		
		Ex01_RemoteControllable re = new Ex03_SmartTv();
		
	}

}
