package ch08;

public interface Ex01_RemoteControllable {
	
	// 상수 (Constant)
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	// 추상 메소드
	public void turnOn(); // abstract 생략
	public abstract void turnOff();	
	public abstract void setVolume(int volume);
	
	// 디폴트 메소드(Java 1.8부터 지원)
	public default void setMute(boolean mute) {
		if(mute)
			System.out.println("무음 처리합니다.");
		else
			System.err.println("무음 해제합니다.");
	}
	
	// 정적 메소드
	public static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
