/**
 * 
 */
package main.hackerrank.easy.bubblesort;

/**
 * @author Admin
 * 
 *
 */
public class BubbleSort {
	public static void main(String args[]) {
		int[] arr= {4,23,1,100,27};
		bubbleSort(arr);
	}
	
	private static boolean bubbleSort(int[] arrays) {
		boolean isSorted = false;
		while(!isSorted) {
			isSorted=true;
			for(int i=0;i<arrays.length-1;i++) {
				if(arrays[i]>arrays[i+1]) {
					swap(arrays,i,i+1);
					isSorted=false;
				}
			}

		}
		return true;
	}

	private static void swap(int[] arrays, int i, int j) {
		arrays[i]=arrays[i]+arrays[j];
		arrays[j]=arrays[i]-arrays[j];
		arrays[i]=arrays[i]-arrays[j];
	}

}
