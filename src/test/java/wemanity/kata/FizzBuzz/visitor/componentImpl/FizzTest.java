package wemanity.kata.FizzBuzz.visitor.componentImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import wemanity.kata.FizzBuzz.visitor.componentImpl.Fizz;

@SpringBootTest
public class FizzTest {

	private Fizz fizz;

	@BeforeEach
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
