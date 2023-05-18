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
	
	private int min (ArrayList<Integer> input)
	{
		int minimum = Integer.MAX_VALUE;
		for (int index = 0; index < input.size(); index++)
		{
			if (input.get(index) < minimum)
			{
				minimum = input.get(index);
			}
		}
		
		return minimum;
	}
	
	private int max (ArrayList<Integer> input)
	{
		int maximum = Integer.MIN_VALUE;
		for (int index = 0; index < input.size(); index++)
		{
			if (input.get(index) > maximum)
			{
				maximum = input.get(index);
			}
		}
		
		return maximum;
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
			
			String postCaret = input.substring(caret + 1);
			String preCaret = input.substring(0, caret);
			
			ArrayList<Integer> postIntList = new ArrayList<>();
			ArrayList<Integer> preIntList = new ArrayList<>();
			
			for (int index = 0; index < operators.length; index++)
			{
				String operator = operators[index];
				postIntList.add(postCaret.indexOf(operator));
				preIntList.add(preCaret.lastIndexOf(operator));
			}
			
			int startPoint = max(preIntList);
			int endPoint = min(postIntList);
			
		}
		
		return output;
	}
}
