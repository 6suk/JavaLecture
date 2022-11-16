package ch11.sec03_object;

public class Key2 {
	int key;
	
	public Key2() {}
	
	public Key2(int key) {
		super();
		this.key = key;
	}

	@Override
	public int hashCode() {
		return key;
	}
	
	
	
	
}
