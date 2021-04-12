package wemanity.kata.FizzBuzz.component;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import wemanity.kata.FizzBuzz.componentI.IRule;
import wemanity.kata.FizzBuzz.visitor.Visitor;

public class CompoundRule implements IRule {

	private List<IRule> children = new ArrayList<IRule>();

	public String getValueToPrint(int i) {
		// TODO
		return StringUtils.EMPTY;
	}

	public String accept(Visitor visitor, int i) {
		return visitor.visitCompondRule(this, i);
	}

	public void add(IRule rule) {
		children.add(rule);
	}

	public List<IRule> getChildren() {
		return children;
	}

	public void setChildren(List<IRule> children) {
		this.children = children;
	}

}
