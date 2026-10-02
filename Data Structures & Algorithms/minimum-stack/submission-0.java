class MinStack {
    Stack<Integer> stk;
    Stack<Integer> minstk;

    public MinStack() {
        stk = new Stack<>();
        minstk = new Stack<>();
    }
    
    public void push(int val) {
        stk.push(val);
        if(minstk.isEmpty()){
            minstk.push(val);
        }else{
            minstk.push(Math.min(val,minstk.peek()));
        }
    }
    
    public void pop() {
        stk.pop();
        minstk.pop();
    }
    
    public int top() {
       return stk.peek();
    }
    
    public int getMin() {
        return minstk.peek();
    }
}
