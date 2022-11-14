package ch10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex08_TryWithResource {

	public static void main(String[] args) {

		/**
		 * try - with - resources
		 * 
		 * try()로 오픈한 resource를 자동으로 close해줌
		 */

		try (FileInputStream fis = new FileInputStream("Ex01_NullpointerException")) {
			fis.read();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

//		FileInputStream fis = null;
//		try {
//			fis = new FileInputStream("Ex01_NullpointerException");
//			try {
//				fis.read();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			try {
//				fis.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}

	}

}
