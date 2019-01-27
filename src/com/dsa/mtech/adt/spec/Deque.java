/**
 * 
 */
package com.dsa.mtech.adt.spec;

/**
 * @author shivaak on 28-Jan-2019
 *
 */
public interface Deque<T> extends Queue<T>{
	
	public void addFront(T data);
	
	public T removeLast();

}
