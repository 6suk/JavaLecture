package mysql.customer;
/** DTO(Data Transfer Object) */
import java.time.LocalDate;

public class Customer {
	private String uid, name;
	private LocalDate regDate;
	private int isDeleted;

	public Customer() {
	}

	public Customer(String uid, String name, LocalDate regDate, int isDeleted) {
		super();
		this.uid = uid;
		this.name = name;
		this.regDate = regDate;
		this.isDeleted = isDeleted;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getRegDate() {
		return regDate;
	}

	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}

	public int getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Override
	public String toString() {
		return "Customer [" + uid + ", " + name + ", " + regDate + ", " + isDeleted + "]";
	}

	
}
