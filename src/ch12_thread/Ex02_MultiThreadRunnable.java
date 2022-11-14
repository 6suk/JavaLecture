package ch12_thread;

public class Ex02_MultiThreadRunnable {

	public static void main(String[] args) throws InterruptedException {
//		Runnable beepTask = new Ex02_BeepTask();
//		Thread thread = new Thread(beepTask);
		Thread thread = new Thread(new Ex02_BeepTask());
		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("Beep");
			Thread.sleep(1000);
		}
	}
	
}
