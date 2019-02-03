/**
 * 
 */
package com.dsa.mtech.adt.impl;

import com.dsa.mtech.adt.spec.Node;
import com.dsa.mtech.adt.spec.Tree;

/**
 * @author shivaak on 02-Feb-2019
 *
 */
public class BinarySearchTree implements Tree<Integer>{

	private Node<Integer> root;

	public BinarySearchTree() {
		root = null;
	}

	public void insert(Integer d) {
		this.root = insert(this.root, d);
	}

	@Override
	public Node<Integer> insert(Node<Integer> current, Integer data) {
		if(current==null) {
			current = new Node<Integer>(data);
			return current;
		}
		if(data <= current.data) {
			current.left = insert(current.left, data);
		}else {
			current.right = insert(current.right, data);
		}
		return current;
	}

	@Override
	public Node<Integer> remove(Node<Integer> root, Integer data) {
		return null;

	}

	@Override
	public Integer countNodes(Node<Integer> root) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer countLeaf(Node<Integer> root) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean search(Node<Integer> root, Integer data) {
		// TODO Auto-generated method stub
		return null;
	}

	public void inOrder() {
		inOrder(this.root);
	}

	@Override
	public void inOrder(Node<Integer> current) {
		if(current==null) System.out.println("Tree is not created");

		if(current.left!=null) {
			inOrder(current.left);
		} 
		System.out.print(current.data + " ");

		if(current.right!=null) {
			inOrder(current.right);
		}

	}
	
	public void preOrder() {
		this.preOrder(this.root);
	}

	@Override
	public void preOrder(Node<Integer> current) {
		if(current==null) System.out.println("Tree is not created");
		
		System.out.print(current.data + " ");
		
		if(current.left!=null) preOrder(current.left);
		if(current.right!=null) preOrder(current.right);

	}
	
	public void postOrder() {
		this.postOrder(this.root);
	}

	@Override
	public void postOrder(Node<Integer> current) {
		if(current!=null) {
			postOrder(current.left);
			postOrder(current.right);
			System.out.println(current.data);			
		}

	}

	@Override
	public void levelOrder(Node<Integer> root) {
		// TODO Auto-generated method stub

	}

	public Integer findMin() {
		return findMin(root);
	}

	@Override
	public Integer findMin(Node<Integer> root) {
		if(root==null) return null;

		if(root.left!=null) return findMin(root.left);

		return root.data;
	}

	public Integer findMax() {
		return findMax(root);
	}

	@Override
	public Integer findMax(Node<Integer> root) {
		if(root==null) return null;
		if(root.right!=null) return findMax(root.right);
		return root.data;
	}

	@Override
	public Integer findHeight(Node<Integer> root) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printAllPaths(Node<Integer> root) {
		// TODO Auto-generated method stub

	}

	@Override
	public void printAllLeafs(Node<Integer> root) {
		// TODO Auto-generated method stub

	}

	@Override
	public Boolean isBinaryTree(Node<Integer> root) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void balanceTheTree(Node<Integer> root) {
		// TODO Auto-generated method stub

	}

}
