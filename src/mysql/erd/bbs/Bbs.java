package mysql.erd.bbs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bbs {
	public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	
	private int bid;
	private String btitle;
	private String uname;
	private LocalDateTime modTime;
	private int viewCount;
	private int replyCount;
	
	
	public Bbs() {}
	
	public Bbs(int bid, String btitle, String uname, LocalDateTime modTime, int viewCount, int replyCount) {
		super();
		this.bid = bid;
		this.btitle = btitle;
		this.uname = uname;
		this.modTime = modTime;
		this.viewCount = viewCount;
		this.replyCount = replyCount;
	}

	public Bbs(int bid, String btitle, String uname, String modTime, int viewCount, int replyCount) {
		super();
		this.bid = bid;
		this.btitle = btitle;
		this.uname = uname;
		this.modTime = LocalDateTime.parse(modTime, dtf);
		this.viewCount = viewCount;
		this.replyCount = replyCount;
	}
	@Override
	public String toString() {
//		return "" + bid + ", " + btitle + ", " + uname + ", " + modTime.toString().replace('T', ' ').substring(2,16) + ", "
//				+ viewCount + ", " + replyCount;
		return String.format(" %3d\t| %-10s\t| %-4s\t| %s | %-2d | %-2d ", bid,btitle,uname,modTime.toString().replace('T', ' ').substring(2,16),viewCount,replyCount);
		
	}

	public int getBid() {
		return bid;
	}

	public String getBtitle() {
		return btitle;
	}

	public String getUname() {
		return uname;
	}

	public LocalDateTime getModTime() {
		return modTime;
	}

	public int getViewCount() {
		return viewCount;
	}

	public int getReplyCount() {
		return replyCount;
	}
	
	
	
	
	
}
