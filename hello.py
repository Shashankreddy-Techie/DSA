import random

# Predefined responses
responses = {
    "hello": ["Hi there!", "Hello!", "Greetings!", "How can I help you?"],
    "how are you?": ["I'm just a program, but thanks for asking!", "Doing well, how about you?", "I'm here to assist you!"],
    "bye": ["Goodbye!", "See you later!", "Take care!"],
}

def get_response(user_input):
    # Normalize the input to lowercase
    user_input = user_input.lower()
    
    # Check if the input is in the predefined responses
    if user_input in responses:
        return random.choice(responses[user_input])
    else:
        return "I'm sorry, I don't understand that."

def main():
    print("Welcome to the simple chatbot! Type 'bye' to exit.")
    
    while True:
        user_input = input("You: ")
        if user_input.lower() == "bye":
            print("Chatbot: Goodbye!")
            break
        response = get_response(user_input)
        print(f"Chatbot: {response}")

if __name__ == "__main__":
    main()
