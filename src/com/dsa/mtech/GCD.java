/**
 * 
 */
package com.dsa.mtech;

/**
 * @author shivaak on 25-Jan-2019
 *
 */
public class GCD {
	
	public static int gcd(int x, int y) {
		
		if(x==0) return y;
		if(y==0) return x;
		
		return gcd(y, x%y);
		
	}
	
	
	public static void main(String[] args) {
		
		//System.out.println(2%10);
		System.out.println(gcd(19,475));
	}

}
