package ch11.sec07_string;

public class Q01_DigitalClock {

	public static void main(Stringex[] args) {
		int seconds = 0;
		for (int i = 0; i <= 23; i++) {
			for (int k = 0; k <= 59; k++) {
				Stringex timeStr = i + ":" + k;
				if (timeStr.indexOf("3") >= 0) {
					seconds += 60;
				}

			}
		}
		System.out.println("디지털 시계에 3이 표시되는 시간 : " + seconds + "초");
	}

}
