class Stack {
    Node top = null;
    final int maxStackHeight = 3;
    int size;

    public Stack(){
        this.top = null;
        this.size = 0;
    }

    public void push(int value) {
        Node newTop = new Node(value);
        if (top == null) {
            top = newTop;
        } else {
            newTop.next = top;
            top = newTop;
        }
        size++;
    }

    public int pop() {
        if (top == null) {
            System.out.println("Stack Empty, would normally throw exception.");
            return 0;
        }
        int value = top.data;
        top = top.next;
        size--;
        return value;
    }

    public int peak() {
        if (top == null) {
            System.out.println("Stack Empty, would normally throw exception.");
            return 0;
        }
        return top.data;
    }

    public boolean isEmpty() {
        return (top == null);
    }

    public boolean isFull() {
        if (maxStackHeight == size){
            return true;
        } else {
            return false;
        }

    }

}
