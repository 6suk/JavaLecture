package ch15_Collection_sec01_arrayList;

import java.util.*;

public class VectorExam {
	public static void main(String[] args) throws InterruptedException {
//		List<Board> list = new Vector<>();
		List<Board> list = new ArrayList<>();

		Thread threadA = new Thread(() -> {
			for (int i = 1; i <= 1000; i++)
				list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
		});

		Thread threadB = new Thread(() -> {
			for (int i = 1001; i <= 2000; i++)
				list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
		});

		threadA.start();
		threadB.start();

		// 작업 스레드들이 모두 종료될 때까지 메인 스레드를 기다리게함
		threadA.join();
		threadB.join();

		// 저장된 총 객체수 얻기
		int size = list.size();
		System.out.println("총 객체 수 : " + size);
	}
}
