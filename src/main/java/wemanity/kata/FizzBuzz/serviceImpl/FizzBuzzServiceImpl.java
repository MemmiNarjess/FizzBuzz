package wemanity.kata.FizzBuzz.serviceImpl;

import org.springframework.stereotype.Service;

import wemanity.kata.FizzBuzz.entity.Range;
import wemanity.kata.FizzBuzz.service.FizzBuzzService;
import wemanity.kata.FizzBuzz.visitor.FizzBuzzVisitor;
import wemanity.kata.FizzBuzz.visitor.component.IRule;
import wemanity.kata.FizzBuzz.visitor.componentImpl.Buzz;
import wemanity.kata.FizzBuzz.visitor.componentImpl.CompoundRule;
import wemanity.kata.FizzBuzz.visitor.componentImpl.Fizz;

@Service
public class FizzBuzzServiceImpl implements FizzBuzzService {

	public String createFizzBuzz(Range range) {
		Fizz fizz = new Fizz();
		Buzz buzz = new Buzz();
		CompoundRule compoundRule = new CompoundRule();
		compoundRule.add(fizz);
		compoundRule.add(buzz);
		return print(range, compoundRule);
	}
	
	private String print(Range range, IRule... rules) {
		FizzBuzzVisitor fizzBuzzVisitor = new FizzBuzzVisitor(range);
		return fizzBuzzVisitor.print(rules);
	}

}
