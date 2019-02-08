/**
 * 
 */
package com.dsa.mtech.adt.spec;

/**
 * @author shivaak on 02-Feb-2019
 *
 */
public interface Tree<T> {
	
	public Node<T> insert(Node<T> current, T data);
	
	public Node<T> remove(Node<T> current, T data);
	
	public T countNodes(Node<T> current);
	
	public T countLeaf(Node<T> current);
	
	public Boolean search(Node<T> current, T data);
	
	public void inOrder(Node<T> current);
	
	public void preOrder(Node<T> current);
	
	public void postOrder(Node<T> current);
	
	public void levelOrder(Node<T> current);
	
	public T findMin(Node<T> root);
	
	public T findMax(Node<T> root);
	
	public T findHeight(Node<T> current);
	
	public void printAllPaths(Node<T> root);
	
	public void printAllLeafs(Node<T> root);
	
	public Boolean isBinarySearchTree(Node<T> current);
	
	public void balanceTheTree(Node<T> root);
	
	public String findPathTo(Node<T> root, T data);
	
	public T greatestCommonAncestor(Node<T> root, T d1, T d2);
	
	public T[] printPostOrder(T[] in, T[] pre); 
	

}
