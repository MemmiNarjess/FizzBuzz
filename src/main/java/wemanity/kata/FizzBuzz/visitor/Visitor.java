package wemanity.kata.FizzBuzz.visitor;

import wemanity.kata.FizzBuzz.component.Buzz;
import wemanity.kata.FizzBuzz.component.CompoundRule;
import wemanity.kata.FizzBuzz.component.Fizz;

public interface Visitor {
	
	String visitFizz(Fizz fizz, int i);
	
	String visitBuzz(Buzz buzz, int i);
	
	String visitCompondRule(CompoundRule compoundRule, int i);

}
