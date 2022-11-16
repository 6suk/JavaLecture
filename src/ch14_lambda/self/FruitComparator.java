package ch14_lambda.self;

import java.util.Comparator;

import ch15_Collection.sec06_TreeSet.Fruit;

public class FruitComparator implements Comparator<Fruit>{

	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o1.price - o2.price; // 가격 오름차순 정렬
	}
	
}
