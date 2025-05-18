import java.util.Stack;

public class StackPrograms {
    
    // Problem 1: Valid Parentheses
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else {
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    // Problem 2: Min Stack
    static class MinStack {
        private Stack<Integer> stack;
        private Stack<Integer> minStack;

        public MinStack() {
            stack = new Stack<>();
            minStack = new Stack<>();
        }

        public void push(int val) {
            stack.push(val);
            if (minStack.isEmpty() || val <= minStack.peek()) {
                minStack.push(val);
            }
        }

        public void pop() {
            if (!stack.isEmpty()) {
                int popped = stack.pop();
                if (popped == minStack.peek()) {
                    minStack.pop();
                }
            }
        }

        public int top() {
            if (!stack.isEmpty()) {
                return stack.peek();
            }
            throw new RuntimeException("Stack is empty");
        }

        public int getMin() {
            if (!minStack.isEmpty()) {
                return minStack.peek();
            }
            throw new RuntimeException("Stack is empty");
        }
    }

    // Main method to demonstrate the programs
    public static void main(String[] args) {
        // Test Valid Parentheses
        System.out.println("Valid Parentheses Tests:");
        System.out.println(isValid("()"));           // true
        System.out.println(isValid("()[]{}"));       // true
        System.out.println(isValid("(]"));           // false
        System.out.println(isValid("([)]"));         // false
        System.out.println(isValid("{[]}"));         // true

        // Test MinStack
        System.out.println("\nMinStack Tests:");
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());  // Returns -3
        minStack.pop();
        System.out.println(minStack.top());     // Returns 0
        System.out.println(minStack.getMin());  // Returns -2
    }
}

