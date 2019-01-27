/**
 * 
 */
package com.dsa.mtech;

/**
 * @author shivaak on 18-Jan-2019
 *
 */


public class SelectionSort {


	public static int[] sort_recursive(int arr[], int start, int end) {
		if(start == end) {
			return arr;
		}

		int minIndex = start;
		for(int i=start; i<end; i++) {
			if(arr[i]<arr[minIndex]) {
				minIndex = i;
			}
		}
		if(minIndex!=start)swap(arr, start, minIndex);

		return sort_recursive(arr, start+1, end);
	}

	public static int[] sort_iterative(int arr[], int n) {
		for(int i=0;i<n;i++) {
			int minIndex=i;
			for(int j=i;j<n;j++) {
				if(arr[j]< arr[minIndex]) {
					minIndex=j;
				}
			}
			//swap only if required
			if(minIndex!=i) swap(arr,i,minIndex);
		}
		return arr;
	}

	private static void swap(int[] arr, int i, int minIndex) {
		int t =arr[i];
		arr[i]=arr[minIndex];
		arr[minIndex] = t;
	}

	private static void print(int arr[]) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		print(sort_iterative(new int[] {34, 56,12,54,11,10,87,65}, 8));
		print(sort_iterative(new int[] {8,5,3,9,1}, 5));
		print(sort_iterative(new int[] {1,2,3,4,5}, 5));

		print(sort_recursive(new int[] {34, 56,12,54,11,10,87,65}, 0,8));
		print(sort_recursive(new int[] {8,5,3,9,1}, 0,5));
		print(sort_recursive(new int[] {1,2,3,4,5}, 0,5));

	}


}
