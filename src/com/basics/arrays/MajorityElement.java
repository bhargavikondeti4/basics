package com.basics.arrays;

/**
 * https://www.geeksforgeeks.org/majority-element/
 * I have modified it a little bit, element should be present
 * equal to or more than half times.
 * In case of odd number of elements in array it should be at least upper value of odd/2.(7/2=3.5 at least 4 times)
 * For even number of elements in array it should be at least half.(8/2=4 at least 4 times)
 * @author ashu
 *
 */
public class MajorityElement {

	public static void main(String args[]) {
		int a[] = {3,3,4,3,4,3,2,4,3};		
		findMajorityElement(a);
	}

	private static void findMajorityElement(int[] a) {
		int n = a.length;
		int cnt = 0, majorityElement = 0;
		for (int i=0;i<n;i++) {
			if (a[majorityElement] == a[i]) cnt++;
			else cnt--;
			if (cnt==0) {
				majorityElement = i;
				cnt = 1;
			}
		}
		
		checkAndPrint(a,majorityElement);
	}

	private static void checkAndPrint(int[] a, int majorityElement) {
		int n = a.length;
		int cnt = 0;
		for (int i=0;i<n;i++) {
			if (a[i] == a[majorityElement]) cnt++;
		}
		
		//Why have i used Math.ceil and double inside it think about it
		//Hint try case 1,2,3 without these
		if (cnt>=Math.ceil((double)n/2)) System.out.println(a[majorityElement]);
		else System.out.println("There is no majority element.");
	}
	
}