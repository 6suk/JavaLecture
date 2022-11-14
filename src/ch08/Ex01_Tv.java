package ch08;

public class Ex01_Tv implements Ex01_RemoteControllable {
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > Ex01_RemoteControllable.MAX_VOLUME)
			this.volume = Ex01_RemoteControllable.MAX_VOLUME;
		else if (volume < Ex01_RemoteControllable.MIN_VOLUME)
			this.volume = Ex01_RemoteControllable.MIN_VOLUME;
		else
			this.volume = volume;

		System.out.println("볼륨 : " + this.volume);
	}


}
