/* IMPLEMENT STACK USING QUEUES
Implement the following operations of a stack using queues.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
empty() -- Return whether the stack is empty.*/

//CODE//

public class MyStack {

    /** Initialize your data structure here. */
        Queue<Integer> q;
        int front,rear;
        public MyStack() {
        q=new LinkedList<Integer>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        q.add(x);
        for(int i=0;i<q.size()-1;i++)
        q.add(q.poll());
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
       return q.poll();
    }
    
    /** Get the top element. */
    public int top() {
        
        return q.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */