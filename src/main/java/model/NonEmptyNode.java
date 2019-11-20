package model;

class NonEmptyNode<T extends Comparable<T>> extends Node<T> {

    NonEmptyNode(T data) {
        super(data, EmptyNode.getInstance(), EmptyNode.getInstance());
    }

    Node add(T value) {
        if (this.compareTo(value) < 0) {
            this.rightNode = this.rightNode.add(value);
        } else if (this.compareTo(value) > 0) {
            this.leftNode = this.leftNode.add(value);
        }
        return this;
    }

    public T getData()  {
        try {
            return super.getData();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    int compareTo(T value) {
        return this.getData().compareTo(value);
    }
}
