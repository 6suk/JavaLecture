package mysql.erd.bbs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Reply {
	public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	public static BoardDao boardDao = new BoardDao();

	private int rid;
	private String rcontent;
	private LocalDateTime regtime;
	private int ismine;
	private String uid;
	private int bid;
	private int isdel = 0;

	public Reply() {
	}
	
	public Reply(int rid, String rcontent) {
		super();
		this.rid = rid;
		this.rcontent = rcontent;
	}
	
	public Reply(int rid, String rcontent, String regtime, int isMine, String uid, int bid, int isdel) {
		super();
		this.rid = rid;
		this.rcontent = rcontent;
		this.regtime = LocalDateTime.parse(regtime, dtf);
		this.ismine = isMine;
		this.uid = uid;
		this.bid = bid;
		this.isdel = isdel;
	}

	public Reply(int rid, String rcontent, LocalDateTime regtime, String uid, int bid, int isdel) {
		super();
		this.rid = rid;
		this.rcontent = rcontent;
		this.regtime = regtime;
		Board board = boardDao.getBoardInfo(bid);
		if (board.getBid() == bid)
			this.ismine = 1;
		this.uid = uid;
		this.bid = bid;
		this.isdel = isdel;
	}

	public Reply(int rid, String rcontent, String regtime, String uid, int bid, int isdel) {
		super();
		this.rid = rid;
		this.rcontent = rcontent;
		this.regtime = LocalDateTime.parse(regtime, dtf);
		Board board = boardDao.getBoardInfo(bid);
		if (board.getBid() == bid)
			this.ismine = 1;
		this.uid = uid;
		this.bid = bid;
		this.isdel = isdel;
	}

	public Reply(String rcontent, String uid, int bid) {
		super();
		this.rcontent = rcontent;
		this.uid = uid;
		this.bid = bid;
	}

	@Override
	public String toString() {
		return "[" + rid + ", " + rcontent + ", " + regtime.toString().replace('T', ' ').substring(2, 16) + ", "
				+ ismine + ", " + uid + ", " + bid + ", " + isdel + "]";
	}

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getRcontent() {
		return rcontent;
	}

	public void setRcontent(String rcontent) {
		this.rcontent = rcontent;
	}

	public LocalDateTime getRegtime() {
		return regtime;
	}

	public void setRegtime(LocalDateTime regtime) {
		this.regtime = regtime;
	}

	public int getIsmine() {
		return ismine;
	}

	public void setIsmine(int ismine) {
		this.ismine = ismine;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public int getIsdel() {
		return isdel;
	}

	public void setIsdel(int isdel) {
		this.isdel = isdel;
	}

}
