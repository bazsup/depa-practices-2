public class Stack<T> {
    T t;
    Stack<T> s;

    void push(T t) {
        if (this.t != null) {
            this.t = t;
        } else {
            this.s = new Stack<T>();
            this.s.push(this.t);
        }
    }

    T pop() {
        T result = this.t;
        if (this.s != null) {
            this.t = this.s.t;
            this.s.pop();
        } else {
            this.t = null;
        }
        return result;
    }
}
