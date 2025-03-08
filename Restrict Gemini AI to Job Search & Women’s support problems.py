import google.generativeai as genai

genai.configure(api_key="AIzaSyDLB0iVGeCQGNCaNDYUbYkWyMCGtDAHpBc")

ALLOWED_TOPICS = ["job search", "career advice", "women empowerment", "women safety", "women rights"]

def is_allowed_query(user_input):
    user_input = user_input.lower()
    return any(topic in user_input for topic in ALLOWED_TOPICS)

def get_restricted_response(user_input):
    if is_allowed_query(user_input):
        model = genai.GenerativeModel("gemini-pro")
        response = model.generate_content(user_input)
        return response.text
    else:
        return "Sorry, I can only assist with job search and women's help topics."

#example
while True:
    user_query = input("Ask me something: ")
    if user_query.lower() in ["exit", "quit"]:
        break
    print(get_restricted_response(user_query))
