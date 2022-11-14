package ch14_lambda;


public class Ex01_NoArgsNoReturnMain {
	public static void main(String[] args) {
		Ex01_MyFunctionalInterface fi;
		fi = ()->{
			String str = "method call";
			System.out.println(str);
		};
		fi.method();
		
		fi = () -> {System.out.println("method call");};
		fi.method();
		
		Runnable r = () -> System.out.println("method call");
		r.run();
		
		fi = () -> System.out.println("method call"); /** 중요 !! */
		fi.method();
	}
}
