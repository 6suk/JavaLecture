package mysql.erd.bbs;

import java.time.LocalDate;

public class Users {
	private String uid;
	private String pwd;
	private String uname;
	private String email;
	private LocalDate regdate;
	private Integer isdel;
	
	public Users() {}
	
	public Users(String uid, String pwd, String uname, String email) {
		super();
		this.uid = uid;
		this.pwd = pwd;
		this.uname = uname;
		this.email = email;
	}

	public Users(String uid, String pwd, String uname, String email, LocalDate regdate, Integer isdel) {
		super();
		this.uid = uid;
		this.pwd = pwd;
		this.uname = uname;
		this.email = email;
		this.regdate = regdate;
		this.isdel = isdel;
	}
	public Users(String uid, String pwd, String uname, String email, String regdate, Integer isdel) {
		super();
		this.uid = uid;
		this.pwd = pwd;
		this.uname = uname;
		this.email = email;
		this.regdate = LocalDate.parse(regdate);
		this.isdel = isdel;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getRegdate() {
		return regdate;
	}

	public void setRegdate(LocalDate regdate) {
		this.regdate = regdate;
	}
	
	public void setRegdate(String regdate) {
		this.regdate = LocalDate.parse(regdate);
	}

	public Integer getIsdel() {
		return isdel;
	}

	public void setIsdel(Integer isdel) {
		this.isdel = isdel;
	}

	@Override
	public String toString() {
		return "Users [" + uid + ", " + pwd + ", " + uname + ", " + email + ", " + regdate
				+ ", " + isdel + "]";
//		return String.format("%-10d | %-6.6s | %-4s | %-12s | %s | %-3d", uid, pwd, uname, email, regdate, isdel);
	}
	
	
	
}
