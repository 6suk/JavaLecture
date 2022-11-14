package ch12_thread;

public class Ex03_MultiThreadInheritnce {

	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Ex03_BeepThread();
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Beep");
			Thread.sleep(1000);
		}
	}
}
