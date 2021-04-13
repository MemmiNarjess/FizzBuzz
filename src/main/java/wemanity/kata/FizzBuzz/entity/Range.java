package wemanity.kata.FizzBuzz.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import io.swagger.v3.oas.annotations.media.Schema;

public class Range {

	@NotBlank
	@Size(min = 1, max = 100)
	@Schema(description = "Initial value", example = "1", required = true)
	private int from;

	@NotBlank
	@Size(min = 1, max = 100)
	@Schema(description = "Final value", example = "100", required = true)
	private int to;

	public Range() {
		super();
	}

	public Range(int from, int to) {
		super();
		this.from = from;
		this.to = to;
	}

	public int getFrom() {
		return from;
	}

	public void setFrom(int from) {
		this.from = from;
	}

	public int getTo() {
		return to;
	}

	public void setTo(int to) {
		this.to = to;
	}

}
