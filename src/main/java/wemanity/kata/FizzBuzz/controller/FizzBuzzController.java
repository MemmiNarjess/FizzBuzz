package wemanity.kata.FizzBuzz.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import wemanity.kata.FizzBuzz.entity.Range;
import wemanity.kata.FizzBuzz.service.FizzBuzzService;

@RestController
@RequestMapping("/api")
@Tag(name = "Fuzz Buzz", description = "the Fuzz Buzz API")
public class FizzBuzzController {

	private final Logger log = LoggerFactory.getLogger(FizzBuzzController.class);

	@Autowired
	private FizzBuzzService fizzBuzzService;

	/**
	 * {@code POST  /fizz-buzz} : Create a new fizz-buzz.
	 *
	 * @param range the range of number.
	 * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with
	 *         body the new fizzBuzz, or with status {@code 400 (Bad Request)} if
	 *         the range is not correct or with status
	 *         {@code 500 (Internal server error)} if an exception is thrown.
	 */
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "Creation of Fizz Buzz", content = {
					@Content(mediaType = "application/text") }),
			@ApiResponse(responseCode = "400", description = "Bad request", content = @Content(mediaType = "application/text")),
			@ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(mediaType = "application/text")) })
	@PostMapping("/fizz-buzz")
	public ResponseEntity<String> createFizzBuzz(
			@RequestBody @Parameter(description = "The interval of numbers") Range range) {
		log.debug("REST request to create Fizz Buzz result : {}", range);
		try {
			if (range.getFrom() == 0 || range.getTo() == 0 || range.getFrom() > range.getTo()) {
				return new ResponseEntity<String>("Bad request", HttpStatus.BAD_REQUEST);
			}
			return new ResponseEntity<String>(fizzBuzzService.createFizzBuzz(range), HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<String>("Internal server error", HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}
