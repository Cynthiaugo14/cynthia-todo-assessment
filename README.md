# ✅ Cynthia Todo App Test Automation Project

This project contains automated tests for a simple **To-Do web application** using both **UI automation (Selenium + TestNG)** and **API testing (REST-assured + JUnit)**. It is built using **Maven** and includes a sample CI setup with **GitHub Actions**.

---

## 📦 Project Structure


---

## 🧪 What Is Being Tested

### ✅ UI Tests
- Valid and invalid login scenarios
- Selenium WebDriver is used to test the login page functionality

### ✅ API Tests
- `POST /login` – login with valid & invalid credentials
- `GET /items` – retrieve all items
- `POST /items` – create a new item
- `PUT /items/:id` – update an item
- `DELETE /items/:id` – delete and handle invalid deletion

---

## 🛠 Tools Used

| Tool            | Purpose                        |
|-----------------|---------------------------------|
| **Java 11+**     | Programming language            |
| **Maven**        | Dependency management           |
| **Selenium**     | UI automation                   |
| **TestNG**       | UI test framework               |
| **JUnit 5**      | API test framework              |
| **REST-assured** | API testing                     |
| **WebDriverManager** | Browser driver management  |
| **GitHub Actions** | Continuous Integration (CI)   |

---

## ▶️ How to Run Tests

### 📌 Pre-requisites
- Java SDK 11 or above
- Maven installed (`mvn -v`)
- Chrome browser installed
- Backend running on `http://localhost:3001`
- Frontend running on `http://localhost:3000`

### 🚀 Running Tests via Maven

```bash
# Run UI tests
mvn test -Dtest=LoginTest

# Run API tests
mvn test -Dtest=TodoApiTest

CI Integration
The project includes a basic GitHub Actions workflow that:

Installs Maven

Builds the project

Runs all tests

Generates a test report

CI config: .github/workflows/ci.yml

⚠️ Assumptions & Limitations
Assumes local backend and frontend are running.

Error handling and test data cleanup are minimal.

API token validation is mocked or skipped for simplicity.

📄 Author
Chioma Cynthia Ezeh
GitHub: github.com/yourusername

✅ License
This project is licensed for educational/demo purposes.

yaml
Copy
Edit

---

Would you like me to generate and upload the `.gitignore` or help set up the GitHub repo now?






You said:
what is the fastest means of moving projects from intellij to github


ChatGPT said:
The fastest and easiest way to move your project from IntelliJ IDEA to GitHub is by using IntelliJ's built-in Git and GitHub integration. Here's how:

✅ One-Time Setup (if not already done)
Login to GitHub from IntelliJ:

Go to File → Settings → Version Control → GitHub.

Click Add account, and log in via GitHub token or browser.

Ensure Git is configured:

Go to File → Settings → Version Control → Git.

Make sure Git is installed and IntelliJ detects it (you should see a Git path like C:\Program Files\Git\bin\git.exe).

🚀 Steps to Upload Your Project to GitHub
📦 1. Initialize Git (if not already done)
VCS (top menu) → Enable Version Control Integration... → Choose Git.

📤 2. Share Project on GitHub
Go to VCS → Import into Version Control → Share Project on GitHub.

Enter:

Repository name (e.g., cynthia-todo-automation)

Description (optional)

Set visibility to Private or Public.

Click Share.

IntelliJ will automatically:

Create the GitHub repo

Push your code

Open the repo in your browser

📝 Recommended: Add a .gitignore file
Before you commit, make sure to create a .gitignore file to exclude build files, logs, etc.:

Sample .gitignore:
bash
Copy
Edit
# IntelliJ project files
.idea/
*.iml

# Maven
target/
*.log

# OS-specific
.DS_Store
Thumbs.db
You can add this by right-clicking the root folder → New → File → name it .gitignore.

✅ Final Notes
After the first push, use the Git tab (bottom left of IntelliJ) for all future commits and pushes.

You can also sync with GitHub from there.

Would you like me to walk you through pushing manually using the terminal (for full control), or is IntelliJ's GUI fine for now?







You said:
do i need to create my read me on my intellij


ChatGPT said:
Yes, it's best practice to create your README.md file inside your IntelliJ project root folder, so that:

It gets included in your Git repository.

It automatically shows up on your GitHub repo homepage when you push your project.

✅ How to Create a README.md in IntelliJ
Option 1: Use IntelliJ GUI
In IntelliJ Project pane (usually on the left), right-click your root folder (e.g., cynthia_todo_assessment).

Choose New → File.

Name it exactly: README.md

Add your Markdown content (I'll polish it for you below).

Save (Ctrl+S or Cmd+S).

Option 2: Terminal
If you prefer terminal inside IntelliJ:

bash
Copy
Edit
touch README.md
📄 Polished README.md (Paste This)
markdown
Copy
Edit
# Cynthia Todo App - Test Automation

This project automates the testing of a simple Todo App using:
- 🧪 Selenium WebDriver for UI tests
- 🔧 REST-assured for API tests
- 🧰 Maven for build & reports
- ✅ JUnit/TestNG for assertions
- 🌐 CI (GitHub Actions ready)

---

## 🚀 How to Set Up

1. **Clone the project**:
   ```bash
   git clone https://github.com/your-username/cynthia-todo-automation.git
   cd cynthia-todo-automation
Run UI Tests:

bash
Copy
Edit
mvn test -Dtest=LoginTest
Run API Tests:

bash
Copy
Edit
mvn test -Dtest=TodoApiTest
View Reports:
After test run, open:

bash
Copy
Edit
target/surefire-reports/index.html
📦 Tools Used
Tool	Purpose
Selenium	Browser automation
REST-assured	API request/response testing
Maven	Dependency management + reports
JUnit/TestNG	Test runners & assertions
GitHub Actions	CI pipeline (optional)

📝 Author
Cynthia Ugochukwu

yaml
Copy
Edit

You can paste this into your new `README.md` file and then commit/push as usual.

---

Would you like me to also generate a cover screenshot or badge for your repo?

Assumptions & Limitations
Assumes local backend and frontend are running.

Error handling and test data cleanup are minimal.

API token validation is mocked or skipped for simplicity.
Author
Ugochukwu Cynthia Chioma
GitHub: https://github.com/Cynthiaugo14







