package ch13_generic.sec03_Multigeneric;

public class Main {

	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<>();
		product1.setKind(new Tv());
		product1.setModel("Smart TV");
		
		Tv tv = product1.getKind();
		String tvMode1 = product1.getModel();
		
		Product<Car, String> product2 = new Product<>();
		product2.setKind(new Car());
		product2.setModel("SUV Car");
		
		Car car = product2.getKind();
		String carMode2 = product2.getModel();
		
		
	}

}
