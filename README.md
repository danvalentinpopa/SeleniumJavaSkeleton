# Selenium WebDriver Test Automation Framework

This is a simple Selenium WebDriver-based test automation framework using Java and TestNG.

## Project Structure

The project is structured as follows:

SeleniumTestProject
│
├── src
│ ├── main
│ │ ├── java
│ │ │ ├── your.package.name
│ │ │ │ ├── DriverFactory.java
│ │ │ │ ├── pages
│ │ │ │ │ ├── SamplePage.java
│ │ │ │ │ ├── OtherPage.java
│ │ │ │ │ └── ...
│ │ │ │ ├── actions
│ │ │ │ │ ├── SampleActions.java
│ │ │ │ │ ├── OtherActions.java
│ │ │ │ │ └── ...
│ │ │ │ └── ...
│ │ └── resources
│ │ ├── testdata
│ │ │ ├── TestData.xlsx
│ │ │ └── ...
│ │ └── ...
│ │
│ ├── test
│ │ ├── java
│ │ │ ├── your.package.name
│ │ │ │ ├── BaseTest.java
│ │ │ │ ├── SampleTest.java
│ │ │ │ ├── AnotherTest.java
│ │ │ │ └── ...
│ │ └── resources
│ │ └── testng.xml
│ │
│ └── ...
│
├── pom.xml
└── ...


- `DriverFactory.java`: Handles driver initialization and closing.
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

```bash
git clone https://github.com/yourusername/SeleniumTestProject.git

Open the project in your preferred IDE.

Configure the path to the chromedriver executable in DriverFactory.java.

Add necessary Selenium WebDriver and TestNG dependencies to the pom.xml file.

Running Tests
You can run the tests using TestNG:

Right-click on the testng.xml file in the src/test/resources directory.

Select "Run As" > "TestNG Suite" (Eclipse) or use the TestNG command-line runner.

Writing Tests
Create test classes in the src/test/java directory.

Extend the BaseTest class in your test classes for driver management.

Implement your test logic using web element selectors and action methods.

Test Data
You can store test data in the src/main/resources/testdata directory. Access it using appropriate methods in your test classes.

Reporting
Add a test reporting mechanism of your choice to the framework for better test result visualization.