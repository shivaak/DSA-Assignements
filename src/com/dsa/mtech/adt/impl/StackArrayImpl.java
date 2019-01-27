/**
 * 
 */
package com.dsa.mtech.adt.impl;

import com.dsa.mtech.adt.spec.Stack;

/**
 * @author shivaak on 27-Jan-2019
 *
 */
public class StackArrayImpl implements Stack{

	private final Integer MAX_SIZE = 5;
	private Integer[] arr = new Integer[MAX_SIZE];
	private Integer top = -1;

	@Override
	public Integer pop() {
		if(isEmpty()) { 
			System.out.println("Stack is Empty"); 
			return null;
		}
		int n = arr[top];
		top--;
		System.out.println(n + " popped");
		return n;
	}

	@Override
	public Integer peek() {
		if(isEmpty()) { 
			System.out.println("Stack is Empty"); 
			return null;
		}
		System.out.println("Element at top : " + arr[top]);
		return arr[top];
	}

	@Override
	public void push(Integer n) {
		if(top==MAX_SIZE-1) {
			System.out.println("Stack is full");
			return;
		}
		top++;
		arr[top] = n;
		System.out.println(n + " Inserted");
	}

	@Override
	public Boolean isEmpty() {
		if(top ==  -1) {
			System.out.println("Stack is Empty");
			return true;
		}
		return false;
	}

	@Override
	public Integer size() {
		if(isEmpty()) { 
			System.out.println("Stack is Empty");
			return null;
		}
		System.out.println("Stack size now : "+ (top+1));
		return top+1;
	}

	public static void main(String[] args) {
		StackArrayImpl stack = new StackArrayImpl();

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
