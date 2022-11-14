package ch07;

public class Ex13_Vehicle {
	public void run() {
		System.out.println("차량이 달립니다.");
	}
}

class Bus extends Ex13_Vehicle {
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}

}

class Taxi extends Ex13_Vehicle {
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}

}

//class Drive extends Ex13_Vehicle{
//	super.run();
//}