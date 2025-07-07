# Selenium WebDriver Test Automation Framework

A simple, maintainable test automation framework using Java, Selenium WebDriver, TestNG, and WebDriverManager.

## Project Structure
- `src/main/java/pages/` — Page Object classes (web element selectors)
- `src/main/java/actions/` — Action classes (user interactions)
- `src/test/java/BaseTest.java` — Base test class (driver management)
- `src/test/java/SampleTest.java`, `AnotherTest.java`, etc. — Test classes (extend `BaseTest`)
- `src/main/resources/testdata/` — Test data files
- `src/test/resources/testng.xml` — TestNG suite configuration

## Prerequisites
- Java JDK 8 or higher
- Maven
- IntelliJ IDEA or Eclipse

## Setup
1. Clone the repository:
   git clone https://github.com/danvalentinpopa/SeleniumJavaSkeleton

2. Open the project in your IDE.
3. Ensure dependencies in `pom.xml`:
    - Selenium WebDriver
    - WebDriverManager
    - TestNG

## Running Tests
- From IDE: Right-click `testng.xml` and select "Run" as TestNG Suite.
- From command line: mvn clean test

## Writing Tests
1. Create new test classes in `src/test/java`.
2. Extend `BaseTest` for automatic driver setup/teardown.
3. Use Page Object classes from `pages` and actions from `actions`.

## Test Data
- Store test data in `src/main/resources/testdata`.
- Access data in your tests as needed.

## Reporting
- Integrate a reporting tool (e.g., Allure, ExtentReports) for enhanced test result visualization.

## Contributing
Pull requests are welcome. For major changes, open an issue first to discuss your ideas.

## License
This project is licensed under the MIT License.