package ch14_lambda_self;

public class Ex07_StringFilter {
	public static String testString(String str, Ex07_StringPrediceate str2) {
		if(str2.resultString(str))
			return String.format("%s Yes!", str);
		else
			return String.format("%s NO!", str);
	}
	
	public static void main(String[] args) {
		String testStr1 = testString("Hello", (s) -> s.equals("Hello"));
		String testStr2 = testString("Hi", (s) -> s.equals("Hello"));
		
		System.out.println(testStr1);
		System.out.println(testStr2);
		
	}
}
