/**
 * 
 */
package main.leetcode.easy.six;

import java.util.ArrayDeque;
import java.util.Date;
import java.util.Deque;

/**
 * @author Admin
 *
 */
public class ValidParenthesis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Long startTime= new Date().getTime();
		System.out.println(startTime);
		System.out.println(isValid("()[]{}"));
		Long endTime= new Date().getTime();
		System.out.println(endTime);
		System.out.println((endTime-startTime)/1000);
	}

	/**
	 * Method to validate the parameters.
	 * @param s
	 * @return
	 */
	public static boolean isValid(String s) {
		Deque<Character> stack=new ArrayDeque<>();
		char[] paranthesis = s.toCharArray();
		for(char param : paranthesis) {
			if(param =='(' || param =='{' ||param =='[') {
				stack.push(param);
			} 
			
			if(stack.isEmpty()) {
				return false;
			}
			
			char bracket;
			switch(param) {
			case ')':
				bracket=stack.pop();
				if(bracket=='{' || bracket=='[' ) return false;
				break;
			case '}':
				bracket=stack.pop();
				if(bracket=='(' || bracket=='[') return false;
				break;
			case ']':
				bracket=stack.pop();
				if(bracket=='{' || bracket=='(' ) return false;
				break;
			}
		}
		
		return stack.isEmpty();
	}

}
