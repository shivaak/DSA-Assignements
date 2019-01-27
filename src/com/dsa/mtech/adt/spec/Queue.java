/**
 * 
 */
package com.dsa.mtech.adt.spec;

/**
 * @author shivaak on 27-Jan-2019
 *
 */
public interface Queue<T> {
	
	public void add(T data);
	
	public T remove();
	
	public Integer size();

}
