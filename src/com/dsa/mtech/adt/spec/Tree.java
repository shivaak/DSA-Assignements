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
	
	public Boolean search(Node<T> root, T data);
	
	public void inOrder(Node<T> current);
	
	public void preOrder(Node<T> current);
	
	public void postOrder(Node<T> current);
	
	public void levelOrder(Node<T> current);
	
	public T findMin(Node<T> root);
	
	public T findMax(Node<T> root);
	
	public T findHeight(Node<T> root);
	
	public void printAllPaths(Node<T> root);
	
	public void printAllLeafs(Node<T> root);
	
	public Boolean isBinaryTree(Node<T> root);
	
	public void balanceTheTree(Node<T> root);
	

}
