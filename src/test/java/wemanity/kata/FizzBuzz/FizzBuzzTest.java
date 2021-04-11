package wemanity.kata.FizzBuzz;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import wemanity.kata.FizzBuzz.Entity.Rule;

@RunWith(MockitoJUnitRunner.class)
public class FizzBuzzTest {

	private FizzBuzz fizzBuzz;
	private List<Rule> rules;

	@Before
	public void setUp() {
		fizzBuzz = new FizzBuzz();
		rules = new ArrayList<Rule>();
		rules.add(buildRule(3, "Fizz"));
		rules.add(buildRule(5, "Buzz"));
	}

	@Test
	public void getValueToPrint_should_return_1() {
		String result = fizzBuzz.getValueToPrint(1, StringUtils.EMPTY, rules);
		assertEquals("1", result);
	}

	@Test
	public void getValueToPrint_should_return_Fizz() {
		String result = fizzBuzz.getValueToPrint(3, StringUtils.EMPTY, rules);
		assertEquals("Fizz", result);
		result = fizzBuzz.getValueToPrint(13, StringUtils.EMPTY, rules);
		assertEquals("Fizz", result);
	}

	@Test
	public void getValueToPrint_should_return_Buzz() {
		String result = fizzBuzz.getValueToPrint(5, StringUtils.EMPTY, rules);
		assertEquals("Buzz", result);
		result = fizzBuzz.getValueToPrint(56, StringUtils.EMPTY, rules);
		assertEquals("Buzz", result);
	}

	@Test
	public void getValueToPrint_should_return_FizzBuzz() {
		String result = fizzBuzz.getValueToPrint(15, StringUtils.EMPTY, rules);
		assertEquals("FizzBuzz", result);
	}

	@Test
	public void isDivisibleBy_should_return_true() {
		Boolean result = fizzBuzz.isDivisibleBy(3, 3);
		assertTrue(result);
	}

	@Test
	public void isDivisibleBy_should_return_false() {
		Boolean result = fizzBuzz.isDivisibleBy(3, 5);
		assertFalse(result);
	}
	
	@Test
	public void containsNumber_should_return_true() {
		Boolean result = fizzBuzz.containsNumber(3, 3);
		assertTrue(result);
	}
	
	@Test
	public void containsNumber_should_return_false() {
		Boolean result = fizzBuzz.containsNumber(5, 3);
		assertFalse(result);
	}

	public Rule buildRule(int number, String value) {
		return new Rule(number, value);
	}

}
