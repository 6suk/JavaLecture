package ch13_generic.Quiz;

public class Q03 {

	public static void main(String[] args) {
		ContainerA<String, String> container1 = new ContainerA<>();
		container1.set("홍길동","도적");
		String name = container1.getKey();
		String job = container1.getValue();
		
		ContainerA<String, Integer> container2 = new ContainerA<>();
		container2.set("홍길동",35);
		String name2 = container2.getKey();
		Integer age = container2.getValue();
		
		System.out.println(container1.toString());
		System.out.println(container2.toString());
		container1.toString();
		container2.toString();
	}
}

class ContainerA<K,V>{
	
	private K key;
	private V value;
	
	public void set(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "ContainerA [key=" + key + ", value=" + value + "]";
	}
	
	
}