class MyQueue {
    Stack<Integer> input;  // Use this for pushing
    Stack<Integer> output; // Use this for popping/peeking

    public MyQueue() {
        this.input = new Stack<>();
        this.output = new Stack<>();
    }
    
    public void push(int x) {
        input.push(x);
    }
    
    public int pop() {
        peek(); // Ensure output stack is filled
        return output.pop();
    }
    
    public int peek() {
        // If output is empty, move EVERYTHING from input to output
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        return output.peek();
    }
    
    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }
}