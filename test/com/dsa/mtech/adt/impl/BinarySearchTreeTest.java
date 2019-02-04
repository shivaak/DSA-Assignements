/**
 * @author shivaak on 02-Feb-2019
 *
 */
package com.dsa.mtech.adt.impl;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

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
		/*bst.insert(48);
		bst.insert(34);
		bst.insert(37);
		bst.insert(27);*/
		
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
		assertEquals(10L,(long)bst.countNodes());
	}

}
