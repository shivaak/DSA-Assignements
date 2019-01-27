/**
 * 
 */
package com.dsa.mtech.adt.spec;

/**
 * @author shivaak on 27-Jan-2019
 *
 */
public interface Stack {

	public Integer pop();
	
	public void push(Integer n);
	
	public Boolean isEmpty();
	
	public Integer size();
	
	public Integer peek();
}
