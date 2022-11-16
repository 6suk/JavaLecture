package ch11.sec03_object;

public class Key {
	public int number;

	public Key(int number) {
		super();
		this.number = number;
	}

	@Override
	public int hashCode() {
		return number;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key compareKey = (Key) obj;
			if (number == compareKey.number)
				return true;
		}

		return super.equals(obj);
	}

}
