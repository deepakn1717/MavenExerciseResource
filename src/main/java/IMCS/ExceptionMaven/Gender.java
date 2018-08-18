package IMCS.ExceptionMaven;

public enum Gender {
	MALE(1), FEMALE(2);

	private int number;

	Gender(int number) {
		this.number = number;
	}

	public int getValue() {
		return number;
	}

	public static Gender getMenuByNumber(int number) {
		for (Gender e : Gender.values()) {
			if (number == e.number)
				return e;
		}
		return null;
	}
}
