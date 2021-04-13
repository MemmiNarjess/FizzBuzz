package wemanity.kata.FizzBuzz.visitor.componentImpl;

import java.util.ArrayList;
import java.util.List;

import wemanity.kata.FizzBuzz.visitor.Visitor;
import wemanity.kata.FizzBuzz.visitor.component.IRule;

public class CompoundRule implements IRule {

	private List<IRule> children = new ArrayList<IRule>();

	public String getValueToPrint(int i) {
		StringBuilder sb = new StringBuilder();
		for (IRule rule : children) {
			sb.append(rule.getValueToPrint(i));
		}
		return sb.toString();
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
