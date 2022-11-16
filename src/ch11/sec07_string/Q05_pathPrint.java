package ch11.sec07_string;

public class Q05_pathPrint {

	public static void main(String[] args) {
		
		String paths = System.getenv("PATH");
		System.out.println(paths);
		String[] pathArr = paths.split(";");
//		for(String a : pathArr) {
//			System.out.println(a);
//		}
		
		String pathStr = String.join("\n", pathArr);
		System.out.println(pathStr);
	}

}
