package ch11_sec07_string;

public class Ex12_join {

	public static void main(String[] args) {
		String[] arr = {"감", "밤", "귤", "배"};
		
		// 위 배열을 하나의 배열으로
		System.out.println(String.join(",", arr));
		System.out.println(String.join(" ", arr));
		System.out.println(String.join("", arr));
		
		
	}

}
