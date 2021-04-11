package wemanity.kata.FizzBuzz;

import java.util.List;

import wemanity.kata.FizzBuzz.Entity.Range;
import wemanity.kata.FizzBuzz.Entity.Rule;

public class FizzBuzz {

	public FizzBuzz() {
		super();
	}

	/**
	 * The method prints the numbers in the range using the defined rules
	 * 
	 * @param range : range of numbers
	 * @param rules : rules to apply
	 */
	public void print(Range range, List<Rule> rules) {
		for (int i = range.getFrom(); i <= range.getTo(); i++) {
			String stringToprint = getValueToPrint(i, "", rules);
			System.out.println(stringToprint);
		}
	}

	/**
	 * 
	 * @param i            : the number
	 * @param valueToPrint : initiate the value
	 * @param rules:       rules to apply
	 * @return string to print
	 */
	public String getValueToPrint(int i, String valueToPrint, List<Rule> rules) {
		for (Rule rule : rules) {
			if (isDivisibleBy(i, rule.getNumber()) || containsNumber(i, rule.getNumber())) {
				valueToPrint += rule.getValue();
			}
		}
		return valueToPrint == "" ? Integer.toString(i) : valueToPrint;
	}

	/**
	 * return if the number is divisible by the divider
	 * 
	 * @param number
	 * @param divider
	 * @return Boolean
	 */
	public Boolean isDivisibleBy(int number, int divider) {
		return number % divider == 0;
	}

	/**
	 * return if the number contains the divider
	 * 
	 * @param number
	 * @param divider
	 * @return
	 */
	public Boolean containsNumber(int number, int divider) {
		return Integer.toString(number).contains(Integer.toString(divider));
	}

}
