/**
 * 
 */
package com.leetcode.easy.five;

/**
 * @author Admin
 *
 */
public class LongestCommonPrefix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] strs= {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(strs));

	}

	public static String longestCommonPrefix(String[] strs) {
		String initialString = strs[0];
		int initialLength=initialString.length();
		
		for(int counter=1;counter<strs.length;counter++) {
			while(!strs[counter].startsWith(initialString)) {
				initialString=initialString.substring(0, initialLength--);
			}
		}
		return initialString;
	}

}
