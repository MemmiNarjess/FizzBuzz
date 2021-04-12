package wemanity.kata.FizzBuzz.component;

import org.apache.commons.lang3.StringUtils;

import wemanity.kata.FizzBuzz.common.Validation;
import wemanity.kata.FizzBuzz.componentI.IRule;
import wemanity.kata.FizzBuzz.entity.Rule;
import wemanity.kata.FizzBuzz.visitor.Visitor;

public class Fizz implements IRule {

	private Rule rule;

	public Fizz() {
		super();
		this.rule = new Rule(3, "Fizz");
	}

	public String getValueToPrint(int i) {
		if (Validation.isDivisibleBy(i, rule.getNumber()) || Validation.containsNumber(i, rule.getNumber())) {
			return rule.getValue();
		}
		return StringUtils.EMPTY;
	}

	public String accept(Visitor visitor, int i) {
		return visitor.visitFizz(this, i);
	}

	public Rule getRule() {
		return rule;
	}

	public void setRule(Rule rule) {
		this.rule = rule;
	}

}
