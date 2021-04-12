package wemanity.kata.FizzBuzz.component;

import static org.junit.Assert.assertEquals;

import org.apache.commons.lang3.StringUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import wemanity.kata.FizzBuzz.component.Buzz;
import wemanity.kata.FizzBuzz.component.CompoundRule;
import wemanity.kata.FizzBuzz.component.Fizz;

@RunWith(MockitoJUnitRunner.class)
public class CompoundRuleTest {

	private CompoundRule compoundRule;
	private Fizz fizz;
	private Buzz buzz;

	@Before
	public void setUp() {
		compoundRule = new CompoundRule();
		fizz = new Fizz();
		buzz = new Buzz();
		compoundRule.add(fizz);
	}

	@Test
	public void getValueToPrint_should_return_EMPTY() {
		String result = compoundRule.getValueToPrint(1);
		assertEquals(StringUtils.EMPTY, result);
	}

	@Test
	public void getValueToPrint_should_return_Fizz() {
		String result = compoundRule.getValueToPrint(3);
		assertEquals("Fizz", result);
	}

	@Test
	public void addTest() {
		compoundRule.add(buzz);
		assertEquals(2, compoundRule.getChildren().size());
	}
}
