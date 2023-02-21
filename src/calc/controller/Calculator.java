package calc.controller;

public class Calculator
{
	String expression;
	
	public Calculator()
	{
		expression = "";
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
}
