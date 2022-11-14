package ch06;

import java.util.Arrays;

public class Ex17_Main {

	public static void main(String[] args) {
		
//		Ex17_Product product1 = new Ex17_Product(101,"노트북",1200000,"컴퓨터");
//		Ex17_Product product2 = new Ex17_Product(102,"데스크탑",1000000,"컴퓨터");
//		Ex17_Product product3 = new Ex17_Product(103,"모니터",200000,"컴퓨터");
//		Ex17_Product product4 = new Ex17_Product(104,"TV",1500000,"가전");
//		Ex17_Product product5 = new Ex17_Product(105,"선풍기",50000,"가전");

//		System.out.println(product1.getId());
//		System.out.println(product1);
		
		String[] productNames = {"노트북","데스크탑","모니터","TV","선풍기"};
		int[] productPrice = {1200000,1000000,200000,1500000,50000};
		String[] productCategory = {"컴퓨터","컴퓨터","컴퓨터","가전","가전"};
		
		Ex17_Product[] products = new Ex17_Product[5];

		for(int i=0; i < products.length; i++) {
			products[i] = new Ex17_Product(101+i, productNames[i],productPrice[i],productCategory[i]);
		}
		
		System.out.println(Arrays.toString(products));
		
	}

}
