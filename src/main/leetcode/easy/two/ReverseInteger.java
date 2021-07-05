/**
 * 
 */
package main.leetcode.easy.two;

/**
 * @author Admin
 *
 */
public class ReverseInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int val = reverse(1534236469);
		System.out.println(val);
	}

	public static int reverse(int x) {
		int revs = 0;
		while (x != 0) {
			if (revs > Integer.MAX_VALUE/10 || revs < Integer.MIN_VALUE/10) {
				return 0;
			}
			revs = revs*10+ x % 10;
			x = x / 10;
		}
		return revs;
	}

}
