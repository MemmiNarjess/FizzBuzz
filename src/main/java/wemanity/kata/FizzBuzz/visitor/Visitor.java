package wemanity.kata.FizzBuzz.visitor;

import wemanity.kata.FizzBuzz.visitor.componentImpl.Buzz;
import wemanity.kata.FizzBuzz.visitor.componentImpl.CompoundRule;
import wemanity.kata.FizzBuzz.visitor.componentImpl.Fizz;

public interface Visitor {
	
	String visitFizz(Fizz fizz, int i);
	
	String visitBuzz(Buzz buzz, int i);
	
	String visitCompondRule(CompoundRule compoundRule, int i);

}
