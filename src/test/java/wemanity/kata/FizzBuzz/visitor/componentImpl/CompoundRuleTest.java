package wemanity.kata.FizzBuzz.visitor.componentImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import wemanity.kata.FizzBuzz.visitor.componentImpl.Buzz;
import wemanity.kata.FizzBuzz.visitor.componentImpl.CompoundRule;
import wemanity.kata.FizzBuzz.visitor.componentImpl.Fizz;

@SpringBootTest
public class CompoundRuleTest {

	private CompoundRule compoundRule;
	private Fizz fizz;
	private Buzz buzz;

	@BeforeEach
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
