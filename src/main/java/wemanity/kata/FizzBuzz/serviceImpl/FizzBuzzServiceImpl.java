package wemanity.kata.FizzBuzz.serviceImpl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import wemanity.kata.FizzBuzz.entity.Range;
import wemanity.kata.FizzBuzz.service.FizzBuzzService;
import wemanity.kata.FizzBuzz.visitor.FizzBuzzVisitor;
import wemanity.kata.FizzBuzz.visitor.component.IRule;

@Service
public class FizzBuzzServiceImpl implements FizzBuzzService {

	public String createFizzBuzz(Range range) {
		// TODO
		return StringUtils.EMPTY;
	}
	
	private String print(Range range, IRule... rules) {
		FizzBuzzVisitor fizzBuzzVisitor = new FizzBuzzVisitor(range);
		return fizzBuzzVisitor.print(rules);
	}

}
