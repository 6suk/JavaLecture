package ch15_Collection_sec06_TreeSet;

import java.util.TreeSet;

import ch14_lambda_self.FruitComparator;

public class FruitMain {
	public static void main(String[] args) {

		/** Comparator */
		/** 두 매개변수 객체를 비교 */
//		TreeSet<Fruit> ts = new TreeSet<>((x, y) -> y.price - x.price);
		TreeSet<Fruit> ts = new TreeSet<>((x, y) -> {
			return (y.price == x.price) ? y.name.compareTo(x.name) : x.price - y.price;
			});
		ts.add(new Fruit("포도", 3000));
		ts.add(new Fruit("수박", 10000));
		ts.add(new Fruit("딸기", 6000));
		ts.add(new Fruit("바나나", 6000));
		ts.forEach((x) -> System.out.println(x.name + " : " + x.price));

		System.out.println();

		TreeSet<Fruit> ts2 = new TreeSet<>(new FruitComparator());
		ts2.add(new Fruit("포도", 3000));
		ts2.add(new Fruit("수박", 10000));
		ts2.add(new Fruit("딸기", 6000));
		ts2.add(new Fruit("바나나", 6000));
		ts2.forEach((x) -> System.out.println(x.name + " : " + x.price));

	}

}
