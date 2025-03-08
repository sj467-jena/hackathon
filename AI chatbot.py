import google.generativeai as genai

def main():
    genai.configure(api_key="AIzaSyDLB0iVGeCQGNCaNDYUbYkWyMCGtDAHpBc") 
    
    model = genai.GenerativeModel("gemini-pro")
    print("Gemini AI Chatbot. Type 'exit' to stop.")
    
    while True:
        user_input = input("You: ")
        if user_input.lower() == 'exit':
            break
        
        response = model.generate_content(user_input)
        print("Gemini:", response.text.strip())

if __name__ == "__main__":
    main()
