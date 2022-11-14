package ch13_generic.Quiz;

public class Pair<K,V>{
	private K key;
	private V value;
	
	public Pair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
}

class ChildPare<K, V> extends Pair<K,V>{

	public ChildPare(K key, V value) {
		super(key, value);
	}
	
}

class Otherpair<K,V>{
	private K key;
	private V value;
	
	public Otherpair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
	
}
