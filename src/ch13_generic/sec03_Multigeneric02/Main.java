package ch13_generic.sec03_Multigeneric02;

public class Main {

	public static void main(String[] args) {
		HomeAgency homeAgency = new HomeAgency();
		Home home = homeAgency.rent();
		home.turnOfLight();
		
		CarAgency carAgency = new CarAgency();
		Car car = carAgency.rent();
		car.run();
	}

}
