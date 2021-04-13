package wemanity.kata.FizzBuzz.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import wemanity.kata.FizzBuzz.entity.Range;
import wemanity.kata.FizzBuzz.service.FizzBuzzService;

@SpringBootTest
public class FizzBuzzControllerTest {

	@Autowired
	private FizzBuzzController fizzBuzzController;

	@Mock
	private FizzBuzzService fizzBuzzService;

	@BeforeEach
	public void setUp() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	public void createFizzBuzz_should_return_500() {
		when(fizzBuzzService.createFizzBuzz(null)).thenThrow(new NullPointerException());
		ResponseEntity<String> result = fizzBuzzController.createFizzBuzz(null);
		assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, result.getStatusCode());
	}

	@Test
	public void createFizzBuzz_should_return_400() {
		Range range = new Range(0, 0);
		ResponseEntity<String> result = fizzBuzzController.createFizzBuzz(range);
		assertEquals(HttpStatus.BAD_REQUEST, result.getStatusCode());

		range = new Range(10, 1);

		result = fizzBuzzController.createFizzBuzz(range);
		assertEquals(HttpStatus.BAD_REQUEST, result.getStatusCode());
	}

	@Test
	public void createFizzBuzz_should_return_200() {
		Range range = new Range(1, 1);
		when(fizzBuzzService.createFizzBuzz(range)).thenReturn("1");
		ResponseEntity<String> result = fizzBuzzController.createFizzBuzz(range);
		assertEquals(HttpStatus.CREATED, result.getStatusCode());
	}

}
