package ch08;

public class Ex01_Audio implements Ex01_RemoteControllable {
	private int volume;

	@Override
	public void turnOn() { // 실체 메소드
		System.out.println("오디오를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		if(volume > Ex01_RemoteControllable.MAX_VOLUME)
			this.volume = Ex01_RemoteControllable.MAX_VOLUME;
		else if(volume < Ex01_RemoteControllable.MIN_VOLUME)
			this.volume = Ex01_RemoteControllable.MIN_VOLUME;
		else
			this.volume = volume;
		
		System.out.println("볼륨 : " + this.volume);
	}
}
