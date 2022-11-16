package ch11.sec03_object;

public class CloneMember implements Cloneable {
	public String id;
	public String name;
	public String pw;

	public CloneMember(String id, String name, String pw) {
		super();
		this.id = id;
		this.name = name;
		this.pw = pw;
	}

	public CloneMember getMember() {
		CloneMember cloned = null;
		try {
			cloned = (CloneMember) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;

	}

	@Override
	public String toString() {
		return "CloneMember [id=" + id + ", name=" + name + ", pw=" + pw + "]";
	}

}
