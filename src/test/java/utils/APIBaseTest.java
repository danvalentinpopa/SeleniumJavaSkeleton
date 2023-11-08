package utils;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.restassured.RestAssured;

public class APIBaseTest {
    @BeforeSuite
    public void setUp() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com"; // Sample base URL
    }

    @AfterSuite
    public void tearDown() {
        RestAssured.reset();
    }
}

