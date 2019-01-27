/**
 * 
 */
package com.dsa.mtech;

import java.util.stream.IntStream;

/**
 * @author shivaak on 17-Jan-2019
 *
 */
public class FibSeries {

	public static long[] cache = new long[100];

	public static long fib(long n) {
		if(n==0) return 0;
		if(n==1) return 1;

		if(cache[(int)n]!=0)
			return cache[(int)n];
		else {
			cache[(int)n] = fib(n-1) + fib(n-2);
			return cache[(int)n];
		}
	}




	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		IntStream.range(0, 80).forEach(n -> System.out.println(n + " --> " +fib(n)));
		long end = System.currentTimeMillis();

		System.out.println("execution time : " + (end -start));
	}

}
