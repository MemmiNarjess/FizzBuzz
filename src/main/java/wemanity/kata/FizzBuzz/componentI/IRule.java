package wemanity.kata.FizzBuzz.componentI;

import wemanity.kata.FizzBuzz.visitor.Visitor;

public interface IRule {
	
	public String getValueToPrint(int i);

	public String accept(Visitor visitor, int i);
}
