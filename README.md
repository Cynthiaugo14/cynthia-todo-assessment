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

📄 Author Cynthia Ugochukwu
