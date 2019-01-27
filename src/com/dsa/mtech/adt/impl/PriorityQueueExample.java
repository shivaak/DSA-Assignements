/**
 * 
 */
package com.dsa.mtech.adt.impl;

import java.util.PriorityQueue;

/**
 * @author shivaak on 28-Jan-2019
 *
 */
public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		
		q.add(25);
		q.add(13);
		q.add(12);
		q.add(18);
		
		while(true) {
			Integer e = q.poll();
			if(e==null) break;
			System.out.print(e + " - ");
		}
	}
}
