package ch13_generic.Quiz;

public class Util2 {
	public static <K, V> V getValue2(Pair2<K, V>p, K k) {
		if(p.getKey().equals(k))
			return p.getValue();
		else {
			return null;
		}
		
	}
	
	
}
