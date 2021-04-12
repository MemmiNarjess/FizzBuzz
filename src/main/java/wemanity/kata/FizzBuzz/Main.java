package wemanity.kata.FizzBuzz;

import wemanity.kata.FizzBuzz.component.Buzz;
import wemanity.kata.FizzBuzz.component.CompoundRule;
import wemanity.kata.FizzBuzz.component.Fizz;
import wemanity.kata.FizzBuzz.componentI.IRule;
import wemanity.kata.FizzBuzz.entity.Range;
import wemanity.kata.FizzBuzz.visitor.FizzBuzzVisitor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fizz fizz = new Fizz();
		Buzz buzz = new Buzz();
		CompoundRule compoundRule = new CompoundRule();
		compoundRule.add(fizz);
		compoundRule.add(buzz);
		// Fist type of call
		print(compoundRule);
		// Second type of call
		print(fizz, buzz);
	}

	private static void print(IRule... rules) {
		Range range = new Range(1, 100);
		FizzBuzzVisitor fizzBuzzVisitor = new FizzBuzzVisitor(range);
		fizzBuzzVisitor.print(rules);
	}

}
