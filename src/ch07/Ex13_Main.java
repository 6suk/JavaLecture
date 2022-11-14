package ch07;

public class Ex13_Main {

	public static void main(String[] args) {
		Ex13_Driver driver = new Ex13_Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(taxi);
		driver.drive(bus);
		
		System.out.println("=================================");
		
		Ex13_Vehicle vehicel = new Ex13_Vehicle();
		Ex13_Vehicle bus2 = new Bus();
		Ex13_Vehicle taxi2 = new Taxi();
		
		vehicel.run();
		bus2.run();
		taxi2.run();
		
		
		
	}

}
