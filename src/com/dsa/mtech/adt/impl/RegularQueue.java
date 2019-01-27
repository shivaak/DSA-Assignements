/**
 * 
 */
package com.dsa.mtech.adt.impl;

import com.dsa.mtech.adt.spec.Queue;

/**
 * @author shivaak on 27-Jan-2019
 *
 */
public class RegularQueue implements Queue<Integer>{

	private static final Integer MAX_SIZE = 5;
	
	private Integer[] arr = new Integer[MAX_SIZE];
	
	private Integer front, rear;

	public RegularQueue() {
		super();
		this.front = -1;
		this.rear = -1;
	}

	@Override
	public void add(Integer data) {
		if(rear == MAX_SIZE-1) {
			System.out.println("Queue is Full");
			return;
		}
		rear++;
		arr[rear]=data;
		if(front==-1) front = rear;
		print();
	}

	@Override
	public Integer remove() {
		if(front==-1 || front == MAX_SIZE) {
			System.out.println("Queue is Empty");
			return null;
		}
		front++;
		print();
		return null;
	}

	@Override
	public Integer size() {
		if(front==-1) { System.out.println("Size : 0 ");return 0;}
		System.out.println(rear-front +1);
		return rear-front+1;
	}
	
	public void print() {
		for(int i = rear; i>=front; i--) {
			System.out.print(" - " + arr[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		RegularQueue q = new RegularQueue();
		
		q.remove();
		q.size();
		q.add(5);
		q.add(10);
		q.add(14);
		q.size();
		//q.remove();
		q.size();
		q.add(15);
		q.add(20);
		q.size();
		q.add(25);
		q.size();
		q.add(30);
		q.remove();
		q.size();
		q.add(35);
	
	}

}
