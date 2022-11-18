package mysql.customer;

import java.io.*;
import java.time.LocalDate;
import java.util.List;

public class MainApp {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static DAO dao = new DAO();

	public static void main(String[] args) throws NumberFormatException, IOException {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("  1.고객목록 | 2.고객등록 | 3.정보수정 | 4.고객탈퇴 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("  - 선택 > ");
			int selectNo = Integer.parseInt(br.readLine());
			System.out.println();

			switch (selectNo) {
			case 1:
				listUser();
				break;
			case 2:
				regUser();
				break;
			case 3:
				updateUser();
//				updateUser2();
				break;
			case 4:
				delUser();
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

	/** 고객 목록 */
	public static void listUser() throws IOException {
		System.out.println("----------------------------------------------------------");
		System.out.println("  ▶ 고객 목록");
		System.out.println("----------------------------------------------------------");
		List<Customer> list = dao.getCustomers();
		list.forEach(x -> {
			System.out.printf("  %-12s | %-6s | %s | %s\n", x.getUid(), x.getName(), x.getRegDate(), x.getIsDeleted());
		});
		System.out.println();
	}

	/** 고객 등록 */
	public static void regUser() throws IOException {
		System.out.println("----------------------------------------------------------");
		System.out.println("  ▶ 고객 등록");
		System.out.println("----------------------------------------------------------");
		String id = null;
		while (true) {
			System.out.print("  - 가입 아이디 입력 : ");
			id = br.readLine();
			Customer c = dao.getUserInfo(id);
			if (c.getUid() == null)
				break;
			System.out.println("  [중복된 아이디] 다시 입력하세요.");
		}
		System.out.print("  - 이름 입력 : ");
		String name = br.readLine();
		System.out.println();

		Customer c = new Customer(id, name);
		dao.insertUser(c);
	}

	/** 정보 수정 */
	public static void updateUser() throws IOException {
		System.out.println("----------------------------------------------------------");
		System.out.println("  ▶ 정보 수정");
		System.out.println("----------------------------------------------------------");
		System.out.print("  - 아이디 입력 : ");
		String id = br.readLine();
		Customer c = dao.getUserInfo(id);
		System.out.println("  - 기존 이름 : " + c.getName());
		System.out.print("  - 변경할 이름 입력 : ");
		String name = br.readLine();
		System.out.println();
		dao.updateUser2(id, name);
	}
	
	/** 정보 수정2 */
	public static void updateUser2() throws IOException {
		System.out.println("----------------------------------------------------------");
		System.out.println("  ▶ 정보 수정");
		System.out.println("----------------------------------------------------------");
		System.out.print("  - 아이디 입력 : ");
		String id = br.readLine();
		Customer c = dao.getUserInfo(id);
		System.out.println("  - 기존 이름 : " + c.getName());
		System.out.print("  - 변경할 이름 입력 : ");
		String name = br.readLine();
		System.out.print("  - 변경할 등록일 입력 : ");
		LocalDate regDate = LocalDate.parse(br.readLine());
		System.out.println();
		Customer nc = new Customer(id, name, regDate, 0);
		dao.updateUser(nc);
	}

	/** 고객 탈퇴 */
	public static void delUser() throws IOException {
		System.out.println("----------------------------------------------------------");
		System.out.println("  ▶ 고객 탈퇴");
		System.out.println("----------------------------------------------------------");
		System.out.print("  - 탈퇴할 아이디 입력 : ");
		String uid = br.readLine();
		System.out.println();
		dao.deleteUser(uid);
	}

}
