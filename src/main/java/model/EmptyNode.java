package model;

class EmptyNode<T extends Comparable<T>> extends Node<T> {
    static private Node instance;
    public static Node getInstance() {
        if (instance == null) {
            instance = new EmptyNode();
        }
        return instance;
    }

    private EmptyNode() {
        super(null);
    }


    @Override
    Node add(T value) {
        return new NonEmptyNode(value);
    }

    @Override
    public T getData() throws Exception {
        throw new Exception("Cannot get data from model.EmptyNode");
    }

    @Override
    int compareTo(T value) {
        return 0;
    }
}
