/**
 * @author shivaak on 02-Feb-2019
 *
 */
package com.dsa.mtech.adt.impl;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

import com.dsa.mtech.adt.spec.Node;

/**
 * @author shivaak on 02-Feb-2019
 *
 */
public class BinarySearchTreeTest {

	BinarySearchTree bst;

	@Before
	public void setUp() throws Exception {
		bst = new BinarySearchTree();
		bst.insert(10);
		bst.insert(2);
		bst.insert(15);
		bst.insert(12);
		bst.insert(18);
		bst.insert(1);
		bst.insert(48);
		bst.insert(34);
		bst.insert(3);
	}

	@Test
	public void testFindMin() {
		assertTrue(1==bst.findMin());
	}

	@Test
	public void testFindMax() {
		assertTrue(48==bst.findMax());
	}

	@Test
	public void testInOrder() {
		bst.inOrder();
	}

	@Test
	public void testPreOrder() {
		bst.preOrder();
	}

	@Test
	public void testPostOrder() {
		bst.postOrder();
	}

	@Test
	public void testCountLeaf() {
		assertEquals(3L,(long)bst.countLeaf());
	}

	@Test
	public void testCountNodes() {
		assertEquals(6L,(long)bst.countNodes());
	}

	@Test
	public void testSearch() {
		assertTrue(bst.search(1));
		assertFalse(bst.search(148));
	}

	@Test
	public void testLevelOrder() {
		bst.levelOrder();
	}

	@Test
	public void testFindHeight() {
		assertEquals(5L,(long)bst.findHeight());
	}
	
	@Test
	public void testIsBinarySearchTree() {
		
		BinarySearchTree tree = new BinarySearchTree(); 
		
        tree.root = new Node<Integer>(1);
        tree.root.left = new Node<Integer>(2);
        tree.root.right = new Node<Integer>(4);
        tree.root.left.left = new Node<Integer>(3);
        tree.root.left.right = new Node<Integer>(5);
        tree.root.right.left = new Node<Integer>(6);
        tree.root.right.right = new Node<Integer>(7);
        
	
		//1 2 4 3 5 6 7
      //  tree.levelOrder();
		
		assertFalse(tree.isBinarySearchTree());
	}
}
