package mysql.baseballPlayer;

import java.time.LocalDate;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		DAO dao = new DAO();
		
		DTO p1 = new DTO(25, "가르시아", "내야수", LocalDate.parse("1993-03-28"), 183);
		DTO p2 = new DTO(16, "김민성", "내야수", LocalDate.parse("1988-12-17"), 181);
		DTO p3 = new DTO(106, "김유민", "내야수", LocalDate.parse("2003-01-18"), 183);
		
		DTO p4 = new DTO(113, "김도환", "외야수", LocalDate.parse("1999-09-10"), 180);
		DTO p5 = new DTO(22, "김현수", "외야수", LocalDate.parse("1988-01-12"), 188);
		DTO p6 = new DTO(8, "문성주", "외야수", LocalDate.parse("1997-02-12"), 175);
		
		dao.setPlayer(p1);
		dao.setPlayer(p2);
		dao.setPlayer(p3);
		dao.setPlayer(p4);
		dao.setPlayer(p5);
		dao.setPlayer(p6);
		
	}
}
