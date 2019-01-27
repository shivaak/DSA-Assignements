/**
 * 
 */
package com.dsa.mtech.adt.impl;

import com.dsa.mtech.adt.spec.Queue;

/**
 * @author shivaak on 27-Jan-2019
 *
 */
public class QueueLLImpl implements Queue<Integer>{

	LinkedListImpl queue = new LinkedListImpl();
	
	
	@Override
	public void add(Integer data) {
		queue.add(data);
		print();
	}

	@Override
	public Integer remove() {
		if(queue.getSize()<=0) { System.out.println("Queue is Empty");return null;}
		Integer removed = queue.removeFirst();
		print();
		return removed;
	}

	@Override
	public Integer size() {
		int size = queue.getSize();
		System.out.println("Size : " + size);
		return size;
	}
	
	public void print() {
		System.out.println(queue);
	}
	
	public static void main(String[] args) {
		QueueLLImpl q = new QueueLLImpl();

		q.remove();
		q.add(5);
		q.add(10);
		q.add(15);
		q.add(100);
		q.remove();
		q.add(20);
		q.remove();
		q.remove();
		q.size();


	}

}
