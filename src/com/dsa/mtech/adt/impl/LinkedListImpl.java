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
	
	@Override
	public void addFirst(Integer data) {
		Node<Integer> node = new Node<Integer>(data);
		node.next = first;
		first = node;
	}

	@Override
	public Integer removeFirst() {
		int d = first.data;
		Node<Integer> newfirst = first.next;
		first = newfirst;
		return d;
	}

	@Override
	public Integer getSize() {
		if(first==null) return 0;
		
		Node<Integer> t = first;
		int c = 1;
		while(t.next!=null) {
			c++;
			t=t.next;
		}
		return c;
	}

	@Override
	public void add(Integer data) {
		Node<Integer> newNode = new Node<Integer>(data);
		
		if(first==null) {
			first=newNode;
			return;
		}
		
		Node<Integer> t = first;
		while(t.next!=null) {
			t = t.next;
		}
		t.next=newNode;
	}

	@Override
	public void remove() {
		if(first==null) return;
		
		Node<Integer> prev = null;
		Node<Integer> curr = first;
		
		while(curr.next!=null) {
			Node<Integer> t = curr;
			curr = curr.next;
			prev = t;
		}
		prev.next = null;
	}
	
	public static void main(String[] args) {
		LinkedListImpl list = new LinkedListImpl();
		
		System.out.println("Size : " + list.getSize());
		list.add(4);
		System.out.println(list);
		list.add(3);
		System.out.println(list);
		list.add(45);
		System.out.println(list);
		list.addFirst(2);
		System.out.println(list);
		list.addFirst(25);
		System.out.println(list);
		list.removeFirst();
		System.out.println(list);
		list.remove();
		System.out.println(list);
		list.add(10);
		System.out.println(list);
		list.remove();
		System.out.println(list);
		System.out.println("Size : " + list.getSize());
		
		
	}

}
