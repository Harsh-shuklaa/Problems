class MinStack {
    Stack<Long> s;
    long minElem = 0;

    public MinStack() {
        s = new Stack<>();
    }

    public void push(int value) {

        if (s.isEmpty()) {
            s.push( (long) value);
            minElem = value;
        } else {
            if (value < minElem) {
                s.push(2 * (long)value - minElem);
                minElem = value;
            } else if (value >= minElem) {
                s.push((long) value);
            }

        }

    }

    public void pop() {
        if (s.isEmpty()) {
            return;
        } else {
            if (s.peek() < minElem) {
                minElem = 2 * minElem - s.peek();
                s.pop();
            } else if (s.peek() >= minElem) {
                s.pop();
            }
        }
    }

    public int top() {
        if (s.isEmpty()) {
            return -1;
        } 
         long top = s.peek();
        if (s.peek() < minElem) {
                return (int) minElem;
            } else if (s.peek() >= minElem) {
              return (int) top;
            }
        return (int) top;

    }
    public int getMin() {

        if (s.isEmpty()) {
            return -1;
        }
        return (int) minElem;

    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */