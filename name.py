import requests
from bs4 import BeautifulSoup

url = 'https://example.com'
response = requests.get(url)

if response.status_code == 200:
    soup = BeautifulSoup(response.text, 'html.parser')
    print(soup.title.string)  # Print the title of the page
else:
    print("Failed to retrieve the webpage")
