class MyStack {

    Queue<Integer> q1;
    public MyStack() {
        q1 = new LinkedList<>();
    }
    
    public void push(int x) {
        q1.add(x);
        for(int i=0;i<q1.size()-1;i++)
            q1.add(q1.remove());
    }
    
    public int pop() {
        if(q1.isEmpty())
            return -1;
        return q1.remove();
        
    }
    
    public int top() {
        if(q1.isEmpty())
            return -1;
        return q1.peek();
        
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}
