class Stack:
    def __init__(self):
        self.stack = []

    def is_empty(self):
        return len(self.stack) == 0

    def push(self, item):
        self.stack.append(item)
        print(f"Pushed {item} to stack.")

    def pop(self):
        if self.is_empty():
            return "Stack is empty!"
        return self.stack.pop()

    def peek(self):
        if self.is_empty():
            return "Stack is empty!"
        return self.stack[-1]

    def size(self):
        return len(self.stack)

    def display(self):
        print("Stack:", self.stack)

# Example usage
if __name__ == "__main__":
    s = Stack()
    s.push(1)
    s.push(2)
    s.push(3)
    s.display()
    print("Popped:", s.pop())
    print("Top element:", s.peek())
    s.display()
