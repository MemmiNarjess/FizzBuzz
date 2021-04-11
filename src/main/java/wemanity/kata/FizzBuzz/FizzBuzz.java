package wemanity.kata.FizzBuzz;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

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
		// TODO
	}

	/**
	 * 
	 * @param i            : the number
	 * @param valueToPrint : initiate the value
	 * @param rules:       rules to apply
	 * @return string to print
	 */
	public String getValueToPrint(int i, String valueToPrint, List<Rule> rules) {
		// TODO
		return StringUtils.EMPTY;
	}

	/**
	 * return if the number is divisible by the divider
	 * 
	 * @param number
	 * @param divider
	 * @return Boolean
	 */
	public Boolean isDivisibleBy(int number, int divider) {
		// TODO
		return true;
	}

}
