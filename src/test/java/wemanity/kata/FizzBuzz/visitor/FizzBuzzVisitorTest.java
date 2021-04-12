package wemanity.kata.FizzBuzz.visitor;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import wemanity.kata.FizzBuzz.component.Buzz;
import wemanity.kata.FizzBuzz.component.Fizz;
import wemanity.kata.FizzBuzz.entity.Range;

@RunWith(MockitoJUnitRunner.class)
public class FizzBuzzVisitorTest {

	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
	private FizzBuzzVisitor fizzBuzzVisitor;
	private Fizz fizz;
	private Buzz buzz;

	@Before
	public void setUp() {

		Range range = new Range(1, 1);
		fizzBuzzVisitor = new FizzBuzzVisitor(range);
		fizz = new Fizz();
		buzz = new Buzz();
		System.setOut(new PrintStream(outputStreamCaptor));
	}

	@Test
	public void print_should_print_1() {
		fizzBuzzVisitor.print(fizz);
		assertEquals("1", outputStreamCaptor.toString().trim());
	}

	@Test
	public void print_should_print_Fizz() {
		fizzBuzzVisitor.setRange(new Range(3, 3));
		fizzBuzzVisitor.print(fizz);
		assertEquals("Fizz", outputStreamCaptor.toString().trim());

		System.setOut(standardOut);

		fizzBuzzVisitor.setRange(new Range(13, 13));
		fizzBuzzVisitor.print(fizz);
		assertEquals("Fizz", outputStreamCaptor.toString().trim());

	}

	@Test
	public void print_should_print_Buzz() {
		fizzBuzzVisitor.setRange(new Range(5, 5));
		fizzBuzzVisitor.print(buzz);
		assertEquals("Buzz", outputStreamCaptor.toString().trim());

		System.setOut(standardOut);

		fizzBuzzVisitor.setRange(new Range(56, 56));
		fizzBuzzVisitor.print(buzz);
		assertEquals("Buzz", outputStreamCaptor.toString().trim());
	}

	@After
	public void tearDown() {
		System.setOut(standardOut);
	}

}
