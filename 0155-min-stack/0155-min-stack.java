class MinStack {
  Stack<Integer> s;
    Stack<Integer> ss;
  
    public MinStack() {
         s = new Stack<>();
         ss = new Stack<>();
    }
    
    public void push(int value) {
        s.push(value);
        if( ss.isEmpty() || value <= ss.peek()){
            ss.push(value);
        }
    }
    
    public void pop() {
         if(s.isEmpty()){
            return ;
        }
      int ans = s.peek();
      s.pop();
      if(ans == ss.peek())
        {
            ss.pop();
        }
        
    
    }
    
    public int top() {
          if(s.isEmpty()){
            return -1;
        }
        return  s.peek();
    }
    
    public int getMin() {
          if(ss.isEmpty()){
            return -1;
        }
        return ss.peek();
        
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