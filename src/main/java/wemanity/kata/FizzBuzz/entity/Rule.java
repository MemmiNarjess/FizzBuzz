package wemanity.kata.FizzBuzz.entity;

public class Rule {

	private int number;

	private String value;

	public Rule(int number, String value) {
		super();
		this.number = number;
		this.value = value;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
