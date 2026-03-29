class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> MinStack;
    public MinStack() {
        stack = new Stack<>();
        MinStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(MinStack.isEmpty() || val<= MinStack.peek()){
            MinStack.push(val);
        }
    }
    
    public void pop() {
        if(stack.isEmpty()) return;
        int top = stack.pop();
        if(top == MinStack.peek()){
            MinStack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return MinStack.peek();
    }
}
