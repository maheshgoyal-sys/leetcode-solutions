class MinStack {
    Stack<Integer> st;
    Stack<Integer> minStack;
    public MinStack() {
        st = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(minStack.isEmpty()){
            minStack.push(val);
        }
        else{
            int currMin = minStack.peek();
            minStack.push(Math.min(currMin,val));
        }
    }
    
    public void pop() {
        if(!st.isEmpty())
        st.pop();
        if(!minStack.isEmpty())
        minStack.pop();
    }
    
    public int top() {
        if(!st.isEmpty())
        return st.peek();

        return -1;
    }
    
    public int getMin() {
        
        return minStack.peek();
    }
}
