# BDD Cucumber Automation Project

This project demonstrates automated testing of a web application's login functionality using Selenium WebDriver with Cucumber and Page Object Model (POM).

## Setup Instructions

1. **Clone the Repository:**
   ```
   git clone <https://github.com/Nobitaspeaks2711/BDDCucumberAutomationProject>
   ```

2. **Install Dependencies:**
   - Ensure you have Java Development Kit (JDK) installed on your system.
   - Download and install Maven build tool.
   - Download the ChromeDriver executable and set the system property `webdriver.chrome.driver` to its location.

3. **Configure WebDriver:**
   - Set the path to the ChromeDriver executable in the `open_the_browser()` method of `LoginPage_pf.java`.

4. **Run the Tests:**
   - Execute the test suite by running the Cucumber runner class.

## Project Structure

- **src/main/java:** Contains Java source code.
- **src/test/java:** Contains Cucumber step definitions.
- **src/test/resources:** Contains feature files and ChromeDriver executable.
- **PageFactory:** Contains Page Object Model classes for the application pages.

## Usage

1. Open the project in your preferred IDE.
2. Set up the dependencies and WebDriver configuration.
3. Run the Cucumber tests to execute the automated tests.

## Contributing

Contributions are welcome! If you'd like to contribute to this project, feel free to fork the repository and submit a pull request with your changes.

## License

This project is licensed under the [MIT License](LICENSE).

---

Feel free to customize this README template according to your project's specific details and requirements.
