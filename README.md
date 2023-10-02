# Selenium WebDriver Test Automation Framework

This is a simple Selenium WebDriver-based test automation framework using Java, TestNG, and WebDriverManager for efficient driver management.


The project is structured as follows:

- `pages`: Contains classes for web element selectors.
- `actions`: Contains classes for action methods.
- `BaseTest.java`: Base test class for driver management.
- `SampleTest.java`, `AnotherTest.java`, etc.: Test classes that extend `BaseTest` for test logic.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your system.
- An integrated development environment (IDE) like Eclipse or IntelliJ IDEA.
- Maven for dependency management (optional).

### Setup

1. Clone this repository to your local machine:

git clone https://github.com/yourusername/SeleniumTestProject.git

1. Open the project in your preferred IDE.

2. Add necessary dependencies to the pom.xml file, including WebDriverManager, Selenium WebDriver, and TestNG.

Running Tests
You can run the tests using TestNG:
1. Right-click on the testng.xml file in the src/test/resources directory.

2. Select "Run As" > "TestNG Suite" (Eclipse) or use the TestNG command-line runner.

Writing Tests
1. Create test classes in the src/test/java directory.

2. Extend the BaseTest class in your test classes for driver management.

3. Implement your test logic using web element selectors and action methods from the pages and actions packages.

Test Data
1. You can store test data in the src/main/resources/testdata directory. Access it using appropriate methods in your test classes.

Reporting
1. Add a test reporting mechanism of your choice to the framework for better test result visualization.