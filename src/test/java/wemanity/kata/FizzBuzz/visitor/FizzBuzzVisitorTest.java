package wemanity.kata.FizzBuzz.visitor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import wemanity.kata.FizzBuzz.entity.Range;
import wemanity.kata.FizzBuzz.visitor.componentImpl.Buzz;
import wemanity.kata.FizzBuzz.visitor.componentImpl.Fizz;

@SpringBootTest
public class FizzBuzzVisitorTest {

	private FizzBuzzVisitor fizzBuzzVisitor;
	private Fizz fizz;
	private Buzz buzz;

	@BeforeEach
	public void setUp() {
		Range range = new Range(1, 1);
		fizzBuzzVisitor = new FizzBuzzVisitor(range);
		fizz = new Fizz();
		buzz = new Buzz();
	}

	@Test
	public void print_should_print_1() {
		String result = fizzBuzzVisitor.print(fizz);
		assertEquals("1", result.trim());
	}

	@Test
	public void print_should_print_Fizz() {
		fizzBuzzVisitor.setRange(new Range(3, 3));
		String result = fizzBuzzVisitor.print(fizz);
		assertEquals("Fizz", result.trim());

		fizzBuzzVisitor.setRange(new Range(13, 13));
		result = fizzBuzzVisitor.print(fizz);
		assertEquals("Fizz", result.trim());

	}

	@Test
	public void print_should_print_Buzz() {
		fizzBuzzVisitor.setRange(new Range(5, 5));
		String result = fizzBuzzVisitor.print(buzz);
		assertEquals("Buzz", result.trim());

		fizzBuzzVisitor.setRange(new Range(56, 56));
		result = fizzBuzzVisitor.print(buzz);
		assertEquals("Buzz", result.trim());
	}

}
