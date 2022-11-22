package mysql.erd.shopping;

import java.util.Set;

public class ShoppingTest {

	public static void main(String[] args) {
		ShoppingDao dao = new ShoppingDao();
		
		Order order = dao.getOrder(102);
		System.out.println(order);
		
//		for(Cart c : order.getCartSet())
//			System.out.println(c.getPname() + c.getQuantity() +" * "+ c.getPrice()
//			+" = "+ (c.getQuantity() * c.getPrice()));
		System.out.println();
		
		Set<Cart> c = order.getCartSet();
		c.forEach(x -> System.out.println(x));
		
		
	}

}
