/**
 * 
 */
package com.dsa.mtech.adt.impl;

import com.dsa.mtech.adt.spec.Stack;

/**
 * @author shivaak on 27-Jan-2019
 *
 */
public class StackLLImpl implements Stack {

	private LinkedListImpl list = new LinkedListImpl();
	
	int size=0;
	
	@Override
	public Integer pop() {
		if(isEmpty()) { 
			System.out.println("Stack is Empty"); 
			return null;
		}
		Integer n = list.removeFirst();
		System.out.println(n + " popped");
		return n;

	}

	@Override
	public void push(Integer n) {
		list.addFirst(n);
		System.out.println(n + " Inserted");
	}

	@Override
	public Boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public Integer size() {
		if(list.isEmpty()) {
			System.out.println("Stack is Empty");
			return null;
		}
		System.out.println("Size " + list.getSize());
		return list.getSize();
	}

	@Override
	public Integer peek() {
		if(isEmpty()) { 
			System.out.println("Stack is Empty"); 
			return null;
		}
		Integer n = list.showTop();
		System.out.println(n + " is in top");
		return n;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Linked List IMPL");
		StackLLImpl stack = new StackLLImpl();

		stack.size();

		stack.push(5);
		stack.push(2);

		stack.size();
		stack.peek();
		stack.pop();
		stack.size();

		stack.push(5);
		stack.push(2);
		stack.push(14);
		stack.push(21);
		stack.push(50);
		stack.push(22);
		stack.pop();
		stack.size();
	}

}
