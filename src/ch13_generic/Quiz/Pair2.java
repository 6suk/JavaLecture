package ch13_generic.Quiz;

public class Pair2<K, V> {
	private K key;
	private V value;

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	public Pair2(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

}
