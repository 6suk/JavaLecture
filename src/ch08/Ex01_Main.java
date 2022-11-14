package ch08;

public class Ex01_Main {

	public static void main(String[] args) {
		Ex01_RemoteControllable rc = null;
		rc = new Ex01_Audio();

		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		Ex01_RemoteControllable.changeBattery();
		rc.turnOff();
		
		System.out.printf("%n==================================%n%n");
		
		rc = new Ex01_Tv();
		rc.turnOㅜ();
		rc.setVolume(5);
		rc.setMute(true);
		Ex01_RemoteControllable.changeBattery();
		rc.turnOff();

	}
}
