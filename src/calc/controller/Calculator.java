package calc.controller;

import java.util.ArrayList;

public class Calculator
{
	private String expression;
	
	private final String [] operators = {"+", "-", "*", "/", "%", "^", "r", "x"};
	
	
	public Calculator()
	{
		expression = "";
	}
	
	public double calculate()
	{
		double answer = 0.0;
		String finalString;
		
		finalString = processParens(expression);
		
		return answer;
	}
	
	private double calculate(String input)
	{
		double answer = 0.0;
		
		return answer;
	}
	
	public String getExpression()
	{
		return expression;
	}
	
	public void setExpression(String input)
	{
		String trimmedString = "";
		
		for (int index = 0; index < input.length(); index++)
		{
			if (!input.substring(index, index++).equals(" "))
			{
				trimmedString += input.substring(index, index++);
			}
		}
		
		expression = trimmedString;
	}
	
	
	private String processParens(String input)
	{
		String output = "";
		
		int firstParen = input.indexOf("(");
		int lastParen = input.lastIndexOf(")");
		
		if (firstParen > -1 && lastParen > -1)
		{
			output = input.substring(0, firstParen);
			output += "" + calculate(input.substring(firstParen + 1, lastParen));
			if(lastParen < input.length() - 1)
			{
				output += input.substring(lastParen + 1);
			}
		}
		return output;
	}
	
	private String processExponents(String input)
	{
		String output = "";
		
		while (input.indexOf("^") > -1)
		{
			int caret = input.indexOf("^");
			
			ArrayList<Integer> intList = new ArrayList<>();
			
			for (String operator : operators)
			{
				intList.add(input.indexOf(operator));
			}
			
		}
		
		return output;
	}
}
