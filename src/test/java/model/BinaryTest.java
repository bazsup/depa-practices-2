package model;

import org.junit.Rule;
import org.junit.Test;
import org.junit.Assert;
import org.junit.rules.ExpectedException;

public class BinaryTest {
    @Test
    public void test_left_node_should_be_4_when_root_is_5() throws Exception {
        BinaryTree tree = new BinaryTree();
        tree.add(5);
        tree.add(4);
        System.out.println(tree.root.leftNode.getClass());
        Assert.assertEquals(new Integer(4), tree.root.leftNode.getData());
    }

    @Test
    public void test_6_should_be_right_of_right_node_5_when_root_is_4() throws Exception {
        BinaryTree node = new BinaryTree();
        node.add(4);
        node.add(5);
        node.add(6);
        Assert.assertEquals(new Integer(5), node.root.rightNode.getData());
        Assert.assertEquals(new Integer(6), node.root.rightNode.rightNode.getData());
    }

    @Test
    public void test_5_should_be_right_of_left_node_4_when_root_is_6() throws Exception {
        BinaryTree node = new BinaryTree();
        node.add(6);
        node.add(4);
        node.add(5);
        Assert.assertEquals(new Integer(4), node.root.leftNode.getData());
        Assert.assertEquals(new Integer(5), node.root.leftNode.rightNode.getData());
    }

    @Test
    public void test_root_should_be_E_when_assigned() throws Exception {
        BinaryTree node = new BinaryTree<String>();
        node.add("E");
        Assert.assertEquals("E", node.root.getData());
    }

    @Test
    public void test_C_should_be_left_node_when_root_is_E() throws Exception {
        BinaryTree node = new BinaryTree<String>();
        node.add("E");
        node.add("C");
        Assert.assertEquals("C", node.root.leftNode.getData());
    }

    @Test
    public void test_D_should_right_of_node_C__when_root_is_E() throws Exception {
        BinaryTree node = new BinaryTree<String>();
        node.add("E");
        node.add("C");
        node.add("D");
        Assert.assertEquals("D", node.root.leftNode.rightNode.getData());
    }

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void test_empty_tree() throws Exception {
        expectedEx.expect(Exception.class);
        expectedEx.expectMessage("Cannot get data from model.EmptyNode");

        BinaryTree tree = new BinaryTree();
        System.out.println(tree.root.getData());
    }
}
