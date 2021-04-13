package wemanity.kata.FizzBuzz.serviceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import wemanity.kata.FizzBuzz.entity.Range;
import wemanity.kata.FizzBuzz.service.FizzBuzzService;

@SpringBootTest
public class FizzBuzzServiceImplTest {

	@Autowired
	private FizzBuzzService fizzBuzzService;

	private Range range;

	@BeforeEach
	public void setUp() {
		range = new Range(1, 1);
	}

	@Test
	public void createFizzBuzz_should_return_1() {
		String result = fizzBuzzService.createFizzBuzz(range);
		assertEquals("1", result.trim());
	}

	@Test
	public void createFizzBuzz_should_return_Fuzz() {
		range = new Range(3, 3);
		String result = fizzBuzzService.createFizzBuzz(range);
		assertEquals("Fizz", result.trim());

		range = new Range(13, 13);
		result = fizzBuzzService.createFizzBuzz(range);
		assertEquals("Fizz", result.trim());
	}

	@Test
	public void createFizzBuzz_should_return_Buzz() {
		range = new Range(5, 5);
		String result = fizzBuzzService.createFizzBuzz(range);
		assertEquals("Buzz", result.trim());

		range = new Range(56, 56);
		result = fizzBuzzService.createFizzBuzz(range);
		assertEquals("Buzz", result.trim());
	}

	@Test
	public void createFizzBuzz_should_return_FuzzBuzz() {
		range = new Range(15, 15);
		String result = fizzBuzzService.createFizzBuzz(range);
		assertEquals("FizzBuzz", result.trim());
	}

}
