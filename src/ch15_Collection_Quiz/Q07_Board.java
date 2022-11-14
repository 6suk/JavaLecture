package ch15_Collection_Quiz;
import java.util.List;
public class Q07_Board {

	/** Board Class */
	private String title;
	private String content;

	public Q07_Board(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	/** Main Class */
	public static void main(String[] args) {
		Q07_BoardDao dao = new Q07_BoardDao();
		List<Q07_Board> list = dao.getBoardList();
		list.forEach(x -> System.out.println(x.getTitle() + " - " + x.getContent()));

	}

}
