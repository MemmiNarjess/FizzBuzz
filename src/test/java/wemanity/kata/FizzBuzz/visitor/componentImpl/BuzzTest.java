package wemanity.kata.FizzBuzz.visitor.componentImpl;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import wemanity.kata.FizzBuzz.visitor.componentImpl.Buzz;

@SpringBootTest
public class BuzzTest {
	
	private Buzz buzz;
	
	@BeforeEach
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
