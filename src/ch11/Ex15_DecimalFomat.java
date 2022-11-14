package ch11;

import java.text.DecimalFormat;

public class Ex15_DecimalFomat {

	public static void main(String[] args) {
		double num = 1234567.89;
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num));
		df = new DecimalFormat("0.0");
		System.out.println(df.format(num));
		df = new DecimalFormat("00000000.00000");
		System.out.println(df.format(num));
		
		
		
		df = new DecimalFormat("#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("###########.###############");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#,###");
		System.out.println(df.format(num));
		
		
		
	}


}
