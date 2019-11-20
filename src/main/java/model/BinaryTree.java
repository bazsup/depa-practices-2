package model;

public class BinaryTree<T> {
    Node root;

    public BinaryTree() {
        root = EmptyNode.getInstance();
    }

    public void add(T value) {
        this.root = root.add(value);
    }
}
