package ch13_generic.Quiz;

public class Q02 {

	public static void main(String[] args) {
		Container<String> container = new Container<>();
		container.set("홍길동");
		System.out.println(container.get());
		
		Container<Integer> container2 = new Container<>();
		container2.set(6);
		System.out.println(container2.get());
	}
}

class Container<T>{
	private T value;
	
	public T get() {
		return value;
	}
	public void set(T value) {
		this.value = value;
	}
	
}
