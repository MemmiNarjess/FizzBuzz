package wemanity.kata.FizzBuzz.component;

import static org.junit.Assert.assertEquals;

import org.apache.commons.lang3.StringUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import wemanity.kata.FizzBuzz.component.Buzz;

@RunWith(MockitoJUnitRunner.class)
public class BuzzTest {
	
	private Buzz buzz;
	
	@Before
	public void setUp() {
		buzz = new Buzz();
	}
	
	@Test
	public void getValueToPrint_should_return_EMPTY() {
		String result = buzz.getValueToPrint(1);
		assertEquals(StringUtils.EMPTY, result);
	}
	
	@Test
	public void getValueToPrint_should_return_Buzz() {
		String result = buzz.getValueToPrint(5);
		assertEquals("Buzz", result);
		result = buzz.getValueToPrint(56);
		assertEquals("Buzz", result);
	}
}
