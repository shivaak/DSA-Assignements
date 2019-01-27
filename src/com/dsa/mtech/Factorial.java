/**
 * 
 */
package com.dsa.mtech;

import java.util.stream.IntStream;

/**
 * @author shivaak on 17-Jan-2019
 *
 */
public class Factorial {
	
	public static int fact(int n) {
		if(n==0 || n==1) return 1;
		return fact(n-1) * n;
	}
	
	public static void main(String[] args) {
		IntStream.range(0, 8).forEach(n-> System.out.println(fact(n)));
	}

}
