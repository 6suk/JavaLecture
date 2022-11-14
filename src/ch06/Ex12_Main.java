package ch06;

public class Ex12_Main {

	public static void main(String[] args) {
		Ex12_Car car = new Ex12_Car();	// 객체 생성 : 외부에서 사용 시 생성
		
		car.company = "현대자동차";
		car.color = "Black";
		car.model = "Ionic6";
		car.maxSpeed = 200;
		System.out.printf("%s + %s + %s + %d%n",car.company,car.color,car.model,car.maxSpeed);
		System.out.println(car);
		
		// 읽고 쓰기가 가능하다. (class > field)
		
		Ex12_Car bus = new Ex12_Car();	// 객체 생성
		bus.company = "기아자동차";
		bus.color = "Pink";
		bus.model = "리무진";
		bus.maxSpeed = 180;
		bus.printField();
		System.out.println(bus.toString()); // source > Generate ToString()
		
		//class = 붕어빵 기계 / 객체 = 붕어빵
		
		Ex12_Car taxi = new Ex12_Car("기아자동차");
		System.out.println(taxi);
		
	}

}
