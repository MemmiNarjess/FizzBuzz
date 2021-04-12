package wemanity.kata.FizzBuzz.component;

import org.apache.commons.lang3.StringUtils;

import wemanity.kata.FizzBuzz.componentI.IRule;
import wemanity.kata.FizzBuzz.entity.Rule;
import wemanity.kata.FizzBuzz.visitor.Visitor;

public class Buzz implements IRule {

	private Rule rule;

	public Buzz() {
		super();
		this.rule = new Rule(5, "Buzz");
	}
	
	public String getValueToPrint(int i) {
		// TODO
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
