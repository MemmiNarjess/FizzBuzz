package wemanity.kata.FizzBuzz.component;

import static org.junit.Assert.assertEquals;

import org.apache.commons.lang3.StringUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import wemanity.kata.FizzBuzz.component.Fizz;

@RunWith(MockitoJUnitRunner.class)
public class FizzTest {

	private Fizz fizz;

	@Before
	public void setUp() {
		fizz = new Fizz();
	}

	@Test
	public void getValueToPrint_should_return_EMPTY() {
		String result = fizz.getValueToPrint(1);
		assertEquals(StringUtils.EMPTY, result);
	}

	@Test
	public void getValueToPrint_should_return_Fizz() {
		String result = fizz.getValueToPrint(3);
		assertEquals("Fizz", result);
		result = fizz.getValueToPrint(13);
		assertEquals("Fizz", result);
	}
}
