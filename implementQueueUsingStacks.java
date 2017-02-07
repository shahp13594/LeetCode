/* IMPLEMENT QUEUE USING STACKS
Implement the following operations of a queue using stacks.

push(x) -- Push element x to the back of queue.
pop() -- Removes the element from in front of queue.
peek() -- Get the front element.
empty() -- Return whether the queue is empty. */

//CODE//
class MyQueue {
    // Push element x to the back of queue.
   Stack<Integer> st=new Stack();
   Stack<Integer> st1=new Stack();
    public void push(int x) {
        st.push(x);
        
    }

    // Removes the element from in front of queue.
    public void pop() {
    {
       if(st1.empty())
      {
        while(!st.empty())
        {
            st1.push(st.pop());
        }
      }
    } 
        st1.pop();
        
    }

    // Get the front element.
    public int peek() {
    if(st1.empty())
    {
        while(!st.empty())
        {
            st1.push(st.pop());
        }
    } 
       return st1.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return st.empty() && st1.empty();
        
    }
}