package wemanity.kata.FizzBuzz.visitor;

import wemanity.kata.FizzBuzz.component.Buzz;
import wemanity.kata.FizzBuzz.component.CompoundRule;
import wemanity.kata.FizzBuzz.component.Fizz;
import wemanity.kata.FizzBuzz.componentI.IRule;
import wemanity.kata.FizzBuzz.entity.Range;

public class FizzBuzzVisitor implements Visitor {

	private Range range;

	public FizzBuzzVisitor(Range range) {
		super();
		this.range = range;
	}

	public void print(IRule... args) {
		for (int i = range.getFrom(); i <= range.getTo(); i++) {
			String str = "";
			StringBuilder sb = new StringBuilder();
			for (IRule rule : args) {
				sb.append(rule.accept(this, i));
			}
			str = sb.toString().isEmpty() ? Integer.toString(i) : sb.toString();
			System.out.println(str);
		}
	}

	public String visitFizz(Fizz fizz, int i) {
		return fizz.getValueToPrint(i);
	}

	public String visitBuzz(Buzz buzz, int i) {
		return buzz.getValueToPrint(i);
	}

	public String visitCompondRule(CompoundRule compoundRule, int i) {
		return compoundRule.getValueToPrint(i);
	}

	public Range getRange() {
		return range;
	}

	public void setRange(Range range) {
		this.range = range;
	}

}
