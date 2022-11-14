package ch12_thread;

import java.awt.Toolkit;

public class Ex01_SingleThread {
	
	public static void main(String[] args) throws InterruptedException {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			Thread.sleep(1000); // 1000ms 만큼 중지
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Beep");
			Thread.sleep(1000);
		}
	}
	
}
