package ch13_generic.sec03_Multigeneric02;

public class HomeAgency implements Rentable<Home>{

	@Override
	public Home rent() {
		return new Home();
	}

}
