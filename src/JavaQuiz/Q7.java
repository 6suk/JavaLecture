package javaQuiz;

public class Q7 {

	public static void main(String[] args) {
		ColorTv mytv = new ColorTv(32, 1024);
		mytv.printProperty();
		
		IPTV iptv = new IPTV(3, 2048, "192.1.1.2");
		iptv.printProperty();
	}
}

class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}

}

class ColorTv extends TV {

	private int color;

	public ColorTv(int size, int color) {
		super(size);
		this.color = color;
	}

	public int getColor() {
		return color;
	}

	public void printProperty() {
		System.out.println(this.getSize() + "인치 " + this.color + "컬러");

	}

}

class IPTV extends ColorTv{
	
	private String ip;

	public IPTV(int size, int color, String ip) {
		super(size, color);
		this.ip = ip;
	}
	
	public void printProperty() {
		System.out.println("나의 IPTV는 "+ this.ip + " 주소의 "+ this.getSize() + "인치 " + this.getColor() + "컬러");

	}
	
	
}