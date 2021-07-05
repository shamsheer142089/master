/**
 * 
 */
package main.leetcode.easy.three;

/**
 * @author Admin
 *
 */
public class IntPolindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(isPalindrome(-121));
	}

	public static boolean isPalindrome(int x) {

		int revs = 0;
		int temp = x;
		
		if (x < 0) {
			return false;
		}

		while (x != 0) {
			revs = (revs * 10) + x % 10;
			x /= 10;
		}

		return revs == temp;
	}
}
