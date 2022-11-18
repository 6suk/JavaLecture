package mysql.baseballPlayer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.List;

public class playerMainApp {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static DAO dao = new DAO();
	
	public static void main(String[] args) throws IOException {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("  1.선수목록 | 2.선수등록 | 3.선수수정 | 4.선수방출 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("  - 선택 > ");
			int selectNo = Integer.parseInt(br.readLine());
			System.out.println();

			switch (selectNo) {
			case 1:
				playerList();
				break;
			case 2:
				newPlayer();
				break;
			case 3:
				updatePlayer();
				break;
			case 4:
				byePlayer();
				break;
			case 5:
				System.out.println("  [프로그램 종료]");
				br.close();
				run = false;
				break;
			default:
				System.out.println("  [오류] : 1에서 5까지의 숫자만 입력하세요!");
			}
		}
	}

	/** 1.선수목록 | 2.선수등록 | 3.선수수정 | 4.선수방출 | 5.종료 */
	
	public static void playerList() {
		System.out.println("----------------------------------------------------------");
		System.out.println("  ▶ 선수목록");
		System.out.println("----------------------------------------------------------");
		List<DTO> player = dao.getPlayerList();
		player.forEach(x -> System.out.println("  "+x));
		System.out.println();
	}
	
	public static void newPlayer() throws IOException {
		System.out.println("----------------------------------------------------------");
		System.out.println("  ▶ 선수등록");
		System.out.println("----------------------------------------------------------");
		System.out.print("  - 선수 이름 > ");
		String name = br.readLine();
		System.out.print("  - 등번호 > ");
		int num = Integer.valueOf(br.readLine()); 
		System.out.print("  - 포지션 > ");
		String position = br.readLine();
		System.out.print("  - 생년월일 > ");
		LocalDate b = LocalDate.parse(br.readLine()); 
		System.out.print("  - 키 > ");
		int h = Integer.valueOf(br.readLine()); 
		
		DTO p = new DTO(num, name, position, b, h);
		dao.setPlayer(p);
	}
	
	public static void updatePlayer() throws IOException {
		System.out.println("----------------------------------------------------------");
		System.out.println("  ▶ 선수수정");
		System.out.println("----------------------------------------------------------");
		
		System.out.print("  - 등번호 > ");
		int num = Integer.valueOf(br.readLine()); 
		System.out.println("  [기존정보] ");
		System.out.println(dao.getPlayer(num));
		
		
		System.out.print("  - 변경할 선수 이름 > ");
		String name = br.readLine();
		System.out.print("  - 변경할 포지션 > ");
		String position = br.readLine();
		System.out.print("  - 변경할 키 > ");
		int h = Integer.valueOf(br.readLine()); 
		
		DTO p = new DTO(num, name, position, h);
		dao.updatePlayer(p);
	}
	
	public static void byePlayer() throws NumberFormatException, IOException {
		System.out.println("----------------------------------------------------------");
		System.out.println("  ▶ 선수퇴출");
		System.out.println("----------------------------------------------------------");
		
		System.out.print("  - 퇴출할 선수 등번호 > ");
		int num = Integer.valueOf(br.readLine()); 
		
		dao.byePlayer(num);
	}
	
	
}