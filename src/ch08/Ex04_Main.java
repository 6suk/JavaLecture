package ch08;

public class Ex04_Main {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Taxi taxi = new Taxi();
		Bus bus = new Bus();

		taxi.run();
		bus.run();
		
		driver.drive(taxi);
		driver.drive(bus);
		
	}

}

class Taxi implements Ex04_Vehicle {

	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}

}

class Bus implements Ex04_Vehicle {

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}

}

class Driver{
	void drive(Ex04_Vehicle vehicle) {
		vehicle.run();
	}
}
