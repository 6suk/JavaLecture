package ch13_generic.sec03_Multigeneric02;

public class CarAgency implements Rentable<Car>{

	@Override
	public Car rent() {
		return new Car();
	}

}
