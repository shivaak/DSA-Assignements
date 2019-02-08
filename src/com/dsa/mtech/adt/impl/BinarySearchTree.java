/**
 * 
 */
package com.dsa.mtech.adt.impl;


import java.util.LinkedList;
import java.util.Queue;

import com.dsa.mtech.adt.spec.Node;
import com.dsa.mtech.adt.spec.Tree;

/**
 * @author shivaak on 02-Feb-2019
 *
 */
public class BinarySearchTree implements Tree<Integer>{

	public Node<Integer> root;
	
	private Queue<Node<Integer>> queue;
	
	public BinarySearchTree() {
		root = null;
		queue = new LinkedList<Node<Integer>>();
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
	
	public Integer countNodes() {
		return this.countNodes(this.root);
	}

	@Override
	public Integer countNodes(Node<Integer> current) {
		if(current==null) return 0;
		
		int nodes = 1;
		
		if(current.left!=null)  nodes += countNodes(current.left);
		if(current.right!=null) nodes += countNodes(current.right);
		
		return nodes;
	}
	
	public Integer countLeaf() {
		return this.countLeaf(this.root);
	}

	@Override
	public Integer countLeaf(Node<Integer> current) {
		if(current==null) return 0;
		
		if(current.left == null && current.right == null) 
			return 1;
		
		return countLeaf(current.left) + countLeaf(current.right);
	}
	
	public Boolean search(Integer data) {
		return this.search(this.root,data);
	}

	@Override
	public Boolean search(Node<Integer> current, Integer data) {
		if(current==null) return false;
		
		if(current.data==data) return true;
		
		if(data<=current.data) 
			return search(current.left,data);
		else
			return search(current.right,data);
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
	
	public void levelOrder() {
		this.levelOrder(this.root);
	}

	@Override
	public void levelOrder(Node<Integer> current) {
		if(current==null) return;
		
		System.out.print(current.data + " ");
		if(current.left!=null)queue.add(current.left);
		if(current.right!=null)queue.add(current.right);
		
		Node<Integer> nextNode = queue.remove();
		
		levelOrder(nextNode);
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
	
	public Integer findHeight() {
		return findHeight(this.root);
	}

	@Override
	public Integer findHeight(Node<Integer> current) {
		if(current==null) return 0;
		int Lheight = 0;
		int Rheight = 0;
		if(current.left!=null) Lheight = findHeight(current.left);
		if(current.right!=null) Rheight = findHeight(current.right);
		return Math.max(Lheight, Rheight) + 1;
	}

	@Override
	public void printAllPaths(Node<Integer> root) {
		// TODO Auto-generated method stub

	}

	@Override
	public void printAllLeafs(Node<Integer> root) {
		// TODO Auto-generated method stub

	}
	
	public Boolean isBinarySearchTree() {
		return this.isBinarySearchTree(this.root);
	}

	@Override
	public Boolean isBinarySearchTree(Node<Integer> current) {
		if(current==null) return true; //NULL is considered as binary tree
	
		Boolean result = true;
		
		if(current.left!=null && current.left.data>current.data) result = false;
		if(current.right!=null && current.right.data<=current.data) result = false;
		
		return result && isBinarySearchTree(current.left) && isBinarySearchTree(current.right);
	}
	

	@Override
	public void balanceTheTree(Node<Integer> root) {
		// TODO Auto-generated method stub

	}

	@Override
	public String findPathTo(Node<Integer> root, Integer data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer greatestCommonAncestor(Node<Integer> root, Integer d1, Integer d2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer[] printPostOrder(Integer[] in, Integer[] pre) {
		// TODO Auto-generated method stub
		return null;
	}

}
