package alltest;

public class Stack {

    private static final int MAX_SIZE = 1024;
    private int [] content = new int [MAX_SIZE];

    private int current = 0;

    public int size() {
        return current;
    }

    public boolean isEmpty() {
        return current == 0;
    }

    public boolean isFull() {
        return current == MAX_SIZE;
    }

    public boolean push(int i) {
        if (isFull())
            return false;
        content[current++] = i;
        return true;
    }

    public int pop() {
        if (isEmpty())
            throw new IllegalArgumentException();
        return content[--current];
    }

}
