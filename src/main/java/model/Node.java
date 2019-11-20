package model;

abstract class Node<T> {
    private T data;
    Node leftNode;
    Node rightNode;

    protected Node(T data) {
        this(data, null, null);
    }
    protected Node(T data, Node leftNode, Node rightNode) {
        this.data = data;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    protected T getData() throws Exception {
        return this.data;
    };

    abstract int compareTo(T value);
    abstract Node add(T value);
}
