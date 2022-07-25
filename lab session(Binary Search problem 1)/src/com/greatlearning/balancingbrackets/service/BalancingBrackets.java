package com.greatlearning.balancingbrackets.service;
import java.util.Stack;

public class BalancingBrackets {

	 public Boolean checkingBracketsBalanced(String bracketExpression) {
		 
		 Stack<Character> stack = new Stack<Character>(); // created a stack
		 
		 // iterating character by character till last element or till last indexing value
		 for(int i=0; i < bracketExpression.length(); i++)
		 {
		 //pushing the elements in character variables if it satisfy the if else condition
		    char character = bracketExpression.charAt(i); 
			 if(character == '(' || character =='[' || character =='{')
			 {
				 stack.push(character);
				 continue;
			 }	 
			 if(stack.isEmpty())
				 return false;
			 
			 char c;
			 
			 switch (character) {
			 
			 case '}':
				 c=stack.pop();
				 if(c =='(' || c =='[')
					 return false;
				 break;
				 
			 case ')':
				 c=stack.pop();
				 if(c =='{' || c == '[')
					 return false;
				 break;
				 
			 case ']':
				 c=stack.pop();
				 if(c =='(' || c == '{')
					 return false;
				 break;
				 
			 }
		   }
		 return(stack.isEmpty());
	}
}