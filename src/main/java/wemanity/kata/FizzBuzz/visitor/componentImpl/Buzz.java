package wemanity.kata.FizzBuzz.visitor.componentImpl;

import org.apache.commons.lang3.StringUtils;

import wemanity.kata.FizzBuzz.common.Validation;
import wemanity.kata.FizzBuzz.entity.Rule;
import wemanity.kata.FizzBuzz.visitor.Visitor;
import wemanity.kata.FizzBuzz.visitor.component.IRule;

public class Buzz implements IRule {

	private Rule rule;

	public Buzz() {
		super();
		this.rule = new Rule(5, "Buzz");
	}
	
	public String getValueToPrint(int i) {
		if (Validation.isDivisibleBy(i, rule.getNumber()) || Validation.containsNumber(i, rule.getNumber())) {
			return (rule.getValue());
		}
		return StringUtils.EMPTY;
	}

	public String accept(Visitor visitor, int i) {
		return visitor.visitBuzz(this, i);
	}

	public Rule getRule() {
		return rule;
	}

	public void setRule(Rule rule) {
		this.rule = rule;
	}

}
