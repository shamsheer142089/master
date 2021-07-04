/**
 * 
 */
package com.leetcode.easy.four;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Admin
 *
 */
public class RomanToInt {

	/**
	 * @param args
	 */
	private final static Map<Character,Integer> romKeyVal;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(romanToInt("XXV"));
		System.out.println(romanToInt("III"));
		System.out.println(romanToInt("IV"));
		System.out.println(romanToInt("IX"));
		System.out.println(romanToInt("LVIII"));
		System.out.println(romanToInt("MCMXCIV"));
	}
	
	private final static Map<Character,Integer> romKeyVal;
	static {
		 romKeyVal = new HashMap<>();   
	     romKeyVal.put('I', 1);
	     romKeyVal.put('V', 5);
	     romKeyVal.put('L', 50);
	     romKeyVal.put('X', 10);
	     romKeyVal.put('C', 100);
	     romKeyVal.put('D', 500);
	     romKeyVal.put('M', 1000);
	}
	
	public static int romanToInt(String s) {
	     int maxIndex = s.length()-1;
	     int tot=romKeyVal.get(s.charAt(maxIndex));
	     
	     for(int idx=0;idx<maxIndex;) {
	    	 int currentVal=romKeyVal.get(s.charAt(idx));
	    	 if(currentVal < romKeyVal.get(s.charAt(++idx))) {
	    		 tot = tot - currentVal; 
	    	 }else {
	    		 tot = tot + currentVal;
	    	 }
	     }
	      
	     return tot;
	    }

}
