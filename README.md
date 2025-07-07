# Selenium WebDriver Test Automation Framework
A simple, maintainable test automation framework using Java, Selenium WebDriver, TestNG, and WebDriverManager.

## Project Structure
- `src/main/java/pages/` — Page Object classes (web element selectors)
- `src/main/java/actions/` — Action classes (user interactions)
- `src/test/java/BaseTest.java` — Base test class (driver management)
- `src/test/java/SampleTest.java`, `AnotherTest.java`, etc. — Test classes (extend `BaseTest`)
- `src/main/resources/testdata/` — Test data files
- `src/test/resources/testng.xml` — TestNG suite configuration
- `src/test/java/utils/TestPropertiesLoader.java` — Loads test data properties
- `src/test/java/utils/TestPropertiesListener.java` — TestNG listener for loading properties

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

## Test Data Loading
- Test data properties are loaded automatically before each test using a TestNG listener.
- Specify the properties file in `testng.xml` using the `testPropsFile` parameter.
- Example `testng.xml`:
  ```xml
  <!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
  <suite name="MySuite">
      <listeners>
          <listener class-name="utils.TestPropertiesListener"/>
      </listeners>
      <test name="Sample Test">
          <parameter name="testPropsFile" value="SampleTestBase"/>
          <classes>
              <class name="tests.SampleTestBase"/>
          </classes>
      </test>
  </suite>