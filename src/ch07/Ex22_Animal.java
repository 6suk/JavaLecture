package ch07;

public abstract class Ex22_Animal {
	String kind;
	String sound;

	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	public abstract void print();
}

class Cow extends Ex22_Animal {
	
	
	Cow() {
		this.kind = "소";
		this.sound = "음메";
	}


	@Override
	public void print() {
		System.out.println(kind + " = " + sound);
	}
	
	
}

class Cock extends Ex22_Animal {
	Cock() {
		this.kind = "닭";
		this.sound = "꼬끼오";
	}


	@Override
	public void print() {
		System.out.println(kind + " = " + sound);
	}
	
	
	
}