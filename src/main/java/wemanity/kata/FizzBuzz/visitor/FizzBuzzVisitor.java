package wemanity.kata.FizzBuzz.visitor;

import wemanity.kata.FizzBuzz.entity.Range;
import wemanity.kata.FizzBuzz.visitor.component.IRule;
import wemanity.kata.FizzBuzz.visitor.componentImpl.Buzz;
import wemanity.kata.FizzBuzz.visitor.componentImpl.CompoundRule;
import wemanity.kata.FizzBuzz.visitor.componentImpl.Fizz;

public class FizzBuzzVisitor implements Visitor {

	private Range range;

	public FizzBuzzVisitor(Range range) {
		super();
		this.range = range;
	}

	public String print(IRule... args) {
		StringBuilder result = new StringBuilder();
		for (int i = range.getFrom(); i <= range.getTo(); i++) {
			String str = "";
			StringBuilder sb = new StringBuilder();
			for (IRule rule : args) {
				sb.append(rule.accept(this, i));
			}
			str = sb.toString().isEmpty() ? Integer.toString(i) : sb.toString();
			result.append(str).append("\n");
		}
		return result.toString();
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
