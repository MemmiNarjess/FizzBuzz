package wemanity.kata.FizzBuzz.common;

public final class Validation {

	/**
	 * return if the number is divisible by the divider
	 * 
	 * @param number
	 * @param divider
	 * @return Boolean
	 */
	public static Boolean isDivisibleBy(int number, int divider) {
		return number % divider == 0;
	}

	/**
	 * return if the number contains the divider
	 * 
	 * @param number
	 * @param divider
	 * @return
	 */
	public static Boolean containsNumber(int number, int divider) {
		return Integer.toString(number).contains(Integer.toString(divider));
	}

}
