/**
 * 
 */
package com.dsa.mtech.adt.spec;

/**
 * @author shivaak on 27-Jan-2019
 *
 */
public abstract class LinkedList<T> {

	protected Node<T> first = null;

	protected static class Node<T> {
		public T data;
		public Node<T> next;

		public Node(T data) {
			this.data=data;
		}

		@Override
		public String toString() {
			return data.toString();
		}

	}
	
	public Boolean isEmpty() {
		return first == null;
	}
	
	public T showTop() {
		if(first==null) return null;
		return first.data;
	}

	public abstract void addFirst(T data);

	public abstract T removeFirst();
	
	public abstract void add(T data);
	
	public abstract void remove();

	public abstract Integer getSize();	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		Node<T> current = first;
		while (current != null) {
			builder.append(current).append(" - ");
			current = current.next;
		}
		return builder.toString();
	}

}
