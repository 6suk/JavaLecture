package mysql.baseballPlayer;

import java.time.LocalDate;

public class Player {
	private int num;
	private String name;
	private String position;
	private LocalDate bDay;
	private int height;
	private int bye;

	public Player() {
	}

	public Player(int num, String name, String position, LocalDate bDay, int height) {
		super();
		this.num = num;
		this.name = name;
		this.position = position;
		this.bDay = bDay;
		this.height = height;
	}

	public Player(int num, String name, String position, int height) {
		super();
		this.num = num;
		this.name = name;
		this.position = position;
		this.height = height;
	}

	public Player(int num, String name, String position, LocalDate bDay, int height, int bye) {
		super();
		this.num = num;
		this.name = name;
		this.position = position;
		this.bDay = bDay;
		this.height = height;
		this.bye = bye;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public LocalDate getbDay() {
		return bDay;
	}

	public void setbDay(LocalDate bDay) {
		this.bDay = bDay;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getBye() {
		return bye;
	}

	public void setBye(int bye) {
		this.bye = bye;
	}

	@Override
	public String toString() {
		return String.format("  %-4d | %-6s | %-6s | %s | %-3d", num, name, position, bDay, height);
	}

}
