package mysql.erd.shopping;

import java.util.Objects;

public class Cart {
	private int oid;
	private int pid;
	private int quantity;
	private String pname;
	private int price;
	
	public String getPname() {
		return pname;
	}

	public int getPrice() {
		return price;
	}

	public Cart() {}
	


	public Cart(int oid, int pid, int quantity, String pname, int price) {
		super();
		this.oid = oid;
		this.pid = pid;
		this.quantity = quantity;
		this.pname = pname;
		this.price = price;
	}

	
	@Override
	public String toString() {
//		return "Cart [oid=" + oid + ", pid=" + pid + ", quantity=" + quantity + ", pname=" + pname + ", price=" + price
//				+ "]";
		return String.format("[%d Cart ] ● %-5s\t| %,-10d * %dea  | total %,-10d", oid,pname,price,quantity,quantity*price);
	}

	public int getOid() {
		return oid;
	}

	public int getPid() {
		return pid;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(oid,pid);
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Cart)) return false;
		Cart c = (Cart) obj;
		return oid == c.getOid() && pid == c.getPid();
	}
	
	
	
}
