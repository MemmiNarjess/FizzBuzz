package wemanity.kata.FizzBuzz;

import java.util.ArrayList;
import java.util.List;

import wemanity.kata.FizzBuzz.Entity.Range;
import wemanity.kata.FizzBuzz.Entity.Rule;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Range range = new Range(1, 100);
		Rule rule1 = new Rule(3, "Fizz");
		Rule rule2 = new Rule(5, "Buzz");
		List<Rule> rules = new ArrayList<Rule>();
		rules.add(rule1);
		rules.add(rule2);
		FizzBuzz fizzBuzz = new FizzBuzz();
		fizzBuzz.print(range, rules);
	}

}
