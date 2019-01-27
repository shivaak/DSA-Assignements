/**
 * 
 */
package com.dsa.mtech.adt.impl;

import com.dsa.mtech.adt.spec.LinkedList;

/**
 * @author shivaak on 27-Jan-2019
 *
 */
public class LinkedListImpl extends LinkedList<Integer>{
	
	private int size = 0;
	

	@Override
	public void addFirst(Integer data) {
		Node<Integer> node = new Node<Integer>(data);
		node.next = first;
		first = node;
		size++;
	}

	@Override
	public Integer removeFirst() {
		int d = first.data;
		Node<Integer> newfirst = first.next;
		first = newfirst;
		size--;
		return d;
	}

	/**
	 * @return
	 */
	public Integer getSize() {
		// TODO Auto-generated method stub
		return size;
	}

}
