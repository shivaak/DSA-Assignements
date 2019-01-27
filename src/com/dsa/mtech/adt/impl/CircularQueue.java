/**
 * 
 */
package com.dsa.mtech.adt.impl;

import com.dsa.mtech.adt.spec.Queue;

/**
 * @author shivaak on 27-Jan-2019
 *
 */
public class CircularQueue implements Queue<Integer>{

	private static final Integer MAX_SIZE = 3;

	private Integer[] arr = new Integer[MAX_SIZE];

	private Integer front, rear;

	public CircularQueue() {
		super();
		this.front = -1;
		this.rear = -1;
	}

	@Override
	public void add(Integer data) {
		if(((rear+1)%MAX_SIZE) == front) {
			System.out.println("Queue is Full");
			return;
		}
		rear = (rear+1) % MAX_SIZE;
		arr[rear]=data;
		if(front==-1) front = rear;
		print();
	}

	@Override
	public Integer remove() {
		if(front==-1) {
			System.out.println("Queue is Empty");
			return null;
		}
		int d = arr[front];
		if(front==rear && front==MAX_SIZE) {
			front=-1; rear=-1;
			return d;
		}

		front= (front+1) % MAX_SIZE;
		print();
		return d;
	}

	@Override
	public Integer size() {
		if(front==-1) { System.out.println("Size : 0 ");return 0;}

		if(rear>=front) {
			System.out.println(rear-front +1);
			return rear-front+1;
		}else {
			System.out.println(MAX_SIZE - (front-rear-1));
			return MAX_SIZE - (front-rear-1);
		}
	}

	public void print() {
		if(front==-1) return;

		if(front<=rear) {
			for (int i = front; i <= rear; i++) 
				System.out.print(arr[i] + " - ");
		}else {
			for (int i = front; i < MAX_SIZE; i++) 
				System.out.print(arr[i] + " - ");
			
	        for (int i = 0; i <= rear; i++) 
	        	System.out.print(arr[i] + " - ");
	        
		}
		System.out.println();
	}

	public static void main(String[] args) {
		CircularQueue q = new CircularQueue();

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
