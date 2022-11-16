package ch11.sec11_arrays;

import java.util.Comparator;

public class Ex05_MemberComparator implements Comparator<Ex05_Member>{

	@Override
	public int compare(Ex05_Member o1, Ex05_Member o2) {
		return o1.name.compareTo(o2.name);
	}

}
