package mysql.erd.shopping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;


public class Order {
	public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	private int oid;
	private LocalDateTime odate;
	private int totalprice;
	private String uid;
	private Set<Cart> cartSet;
	
	
	public Order(int oid, LocalDateTime odate, int totalprice, String uid, Set<Cart> cartSet) {
		super();
		this.oid = oid;
		this.odate = odate;
		this.totalprice = totalprice;
		this.uid = uid;
		this.cartSet = cartSet;
	}
	
	public Order(int oid, String odate, int totalprice, String uid, Set<Cart> cartSet) {
		super();
		this.oid = oid;
		this.odate = LocalDateTime.parse(odate, dtf);
		this.totalprice = totalprice;
		this.uid = uid;
		this.cartSet = cartSet;
	}

	
	@Override
	public String toString() {
//		return "" + oid + ", " + odate.toString().replace('T', ' ').substring(2,16) + ", " + totalprice + ", " + uid;
		return String.format("[%d Order] ● %-5s\t| %-,10d\t| %s", oid,uid,totalprice,odate.toString().replace('T', ' ').substring(2,16));
	}

	public static DateTimeFormatter getDtf() {
		return dtf;
	}

	public int getOid() {
		return oid;
	}

	public LocalDateTime getOdate() {
		return odate;
	}

	public int getTotalprice() {
		return totalprice;
	}

	public String getUid() {
		return uid;
	}

	public Set<Cart> getCartSet() {
		return cartSet;
	}
	
	
	
	
	
	
}
