

// Description: This class takes an input string and reads every char
// from left to right then returns 0-4 based on the following description.

import java.util.Stack;

public class Matching {

	public static int checking(String inputString){

		//create new empty stack
		Stack <Character> stack = new Stack <>();

		for (int i = 0; i < inputString.length(); i++)
		{
			if (inputString.charAt(i) =='{')
			{
				//put it back in the stack
				stack.push(inputString.charAt(i));
			}

			else if (inputString.charAt(i) == '(')
			{
				stack.push(inputString.charAt(i));
			}

			else{
				//if stack is not empty
				if(!stack.isEmpty())
				{
					//if peek is ( and char is )
					if(stack.peek() =='(' && inputString.charAt(i) ==')')
					{
						stack.pop();
						continue;
					}
					//if char is } and top stack is { then pop
					else if (stack.peek()=='{' && (inputString.charAt(i) == '}'))
					{
						stack.pop();
						continue;
					}

					// if peek is not ( or empty then there was no left (
					else if (stack.peek() !='(' && inputString.charAt(i) =='}')
					{
						return 3;
					}
					//if peek is not { 
					else if(stack.peek() !='{' && inputString.charAt(i) == ')')
					{
						return 1;
					}

					else
					{
						if (inputString.charAt(i) == ')')
						{
							return 1;
						}
						else if (inputString.charAt(i) == '}')
						{
							return 3;
						}
					}
				}

			}
		} 		//end of for loop

		//check if stack is empty
		if (stack.isEmpty())
		{
			return 0;
		}
		else if(stack.peek()=='(')
		{
			return 2;
		}
		else if(stack.peek() == ('{'))
		{
			return 4;
		}

		//if stack is empty (and matching)
		return 0;
	}
}
