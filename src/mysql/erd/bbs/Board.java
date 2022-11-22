package mysql.erd.bbs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Board {
	public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	private int bid;
	private String btitle;
	private String bcontent;
	private String uid;
	private LocalDateTime modtime;
	private int viewcount;
	private int replycount;
	private int isdel;

	public Board() {
	}

	public Board(int bid, String btitle, String bcontent, String uid, LocalDateTime modtime, int viewcount,
			int replycount, int isdel) {
		super();
		this.bid = bid;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.uid = uid;
		this.modtime = modtime;
		this.viewcount = viewcount;
		this.replycount = replycount;
		this.isdel = isdel;
	}

	public Board(int bid, String btitle, String bcontent, String uid, String modtime, int viewcount, int replycount,
			int isdel) {
		super();
		this.bid = bid;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.uid = uid;
		this.modtime = LocalDateTime.parse(modtime, dtf);
		this.viewcount = viewcount;
		this.replycount = replycount;
		this.isdel = isdel;
	}

	public Board(String btitle, String bcontent, String uid) {
		super();
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.uid = uid;
	}
	public Board(String btitle, String bcontent, int bid) {
		super();
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bid = bid;
	}

	@Override
	public String toString() {
//		return "Board [" + bid + ", " + btitle + ", " + bcontent + ", " + uid + ", " + modtime.toString().replace('T', ' ').substring(2,16) + ", " + viewcount + ", "
//				+ replycount + ", " + isdel + "]";
		return String.format("  [ %d | %s ]\n  작성자 [%s] | 작성일 [%s] | 조회수 [%d] | 댓글수 [%d]\n\n  %s\n",bid,btitle ,uid,modtime.toString().replace('T', ' ').substring(2,10),viewcount,replycount,bcontent);
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public String getBcontent() {
		return bcontent;
	}

	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public LocalDateTime getModtime() {
		return modtime;
	}

	public void setModtime(LocalDateTime modtime) {
		this.modtime = modtime;
	}

	public int getViewcount() {
		return viewcount;
	}

	public void setViewcount(int viewcount) {
		this.viewcount = viewcount;
	}

	public int getReplycount() {
		return replycount;
	}

	public void setReplycount(int replycount) {
		this.replycount = replycount;
	}

	public int getIsdel() {
		return isdel;
	}

	public void setIsdel(int isdel) {
		this.isdel = isdel;
	}

}
