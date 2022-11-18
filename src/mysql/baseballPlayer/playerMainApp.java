package mysql.baseballPlayer;

import java.io.*;
import java.time.LocalDate;
import java.util.List;

import mysql.customer.Customer;

public class playerMainApp {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static DAO dao = new DAO();

	public static void main(String[] args) throws IOException {
		boolean run = true;
		while (run) {
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("  1.선수목록 | 2.선수등록 | 3.선수수정 | 4.선수방출 | 5.선수재입단 | 6.종료 ");
			System.out.println("-----------------------------------------------------------------------");
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
				welcomePlayer();
				break;
			case 6:
				System.out.println("  [프로그램 종료]");
				br.close();
				run = false;
				break;
			default:
				System.out.println("  [오류] : 1에서 5까지의 숫자만 입력하세요!");
			}
		}
	}

	
	/** 1. 선수 목록 */
	public static void playerList() {
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("  ▶ 선수목록");
		System.out.println("-----------------------------------------------------------------------");
		List<Player> player = dao.getPlayerList();
		player.forEach(x -> System.out.println("  " + x));
		System.out.println();
	}

	/** 2. 선수 등록 */
	public static void newPlayer() throws IOException {
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("  ▶ 선수등록 / 되돌아가기 0번");
		System.out.println("-----------------------------------------------------------------------");
		
		int num;
		while (true) {
			System.out.print("  - 백넘버 입력 : ");
			num = Integer.parseInt(br.readLine()); 
			if(num == 0) return;
			Player p = dao.getPlayer(num);
			if (p.getNum() == 0)
				break;
			System.out.println("  [중복된 백넘버] 다시 입력하세요.");
		}
		
		System.out.print("  - 선수 이름 > ");
		String name = br.readLine();
		if(name.equals("0")) return;
		System.out.print("  - 포지션 > ");
		String position = br.readLine();
		if(position.equals("0")) return;
		System.out.print("  - 생년월일 > ");
		String btmp = br.readLine();
		if(btmp.equals("0")) return;
		LocalDate b = LocalDate.parse(btmp);
		System.out.print("  - 키 > ");
		int h = Integer.valueOf(br.readLine());
		if(h==0)return;

		Player p = new Player(num, name, position, b, h);
		dao.setPlayer(p);
	}

	/** 3. 선수 수정 */
	public static void updatePlayer() throws IOException {
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("  ▶ 선수수정 / 되돌아가기 0번");
		System.out.println("-----------------------------------------------------------------------");

		System.out.print("  - 수정할 선수 등번호 > ");
		int num = Integer.parseInt(br.readLine());
		if(num == 0) return;
		System.out.println();
		System.out.println("  [기존정보] ");
		
		Player p = dao.getPlayer(num);
		
		System.out.println("  "+p);
		System.out.println();

		System.out.print("  - 변경할 선수 이름 > ");
		String name = br.readLine();
		if(name.equals("0"))return;
		name = (name.equals("")) ? p.getName() : name;
		
		System.out.print("  - 변경할 포지션 > ");
		String position = br.readLine();
		if(position.equals("0"))return;
		position = (position.equals("")) ? p.getPosition() : position;
		
		System.out.print("  - 변경할 키 > ");
		String h = br.readLine();
		if(h.equals("0"))return;
		int height = (h.equals("")) ? p.getHeight() : Integer.valueOf(h);

		Player uP = new Player(num, name, position, height);
		dao.updatePlayer(uP);
	}

	/** 4. 선수 방출 */
	public static void byePlayer() throws NumberFormatException, IOException {
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("  ▶ 선수방출 / 되돌아가기 0번");
		System.out.println("-----------------------------------------------------------------------");

		List<Player> player = dao.getPlayerList();
		player.forEach(x -> System.out.println("  " + x));
		System.out.println();
		
		
		System.out.print("  - 방출할 선수 등번호 > ");
		int num = Integer.valueOf(br.readLine());
		if (num == 0) return;

		dao.byePlayer(num);
	}

	/** 5. 선수 재입단 */
	public static void welcomePlayer() throws IOException {
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("  ▶ 선수 재영입 / 되돌아가기 0번");
		System.out.println("-----------------------------------------------------------------------");
		
		System.out.println("  [퇴출된 선수 명단] ");
		List<Player> p = dao.byePlayerList();
		p.forEach(x -> System.out.println("  "+x));
		System.out.println();
		System.out.print("  - 재영입할 선수 등번호 > ");
		int num = Integer.valueOf(br.readLine());
		if(num == 0) return;
		dao.welcomPlayer(num);
	}

}