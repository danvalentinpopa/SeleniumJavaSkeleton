package tests.apitests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import utils.APIBaseTest;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class UserAPITest extends APIBaseTest {

    /**
     * This example uses the JSONPlaceholder API
     * (https://jsonplaceholder.typicode.com/users) as a sample to retrieve users.
     * You can adjust the URL and the assertions based on your specific API endpoint and the response structure.
     *
     * Please make sure to adjust the endpoint,
     * expected values, and assertions according to your API's response schema and requirements.
     * This is a basic example that showcases how to set up a TestNG-based API test using
     * RestAssured within your existing test framework.
     */
    @Test
    public void testUserAPI() {
        Response response = given()
                .when()
                .get("/users"); // The API endpoint

        // Assert the status code is 200 (OK)
        assertEquals(response.getStatusCode(), 200, "Status code is not 200");

        // Assert the response contains data
        int expectedUsersCount = 10; // Assuming it returns 10 users
        int actualUsersCount = response.jsonPath().getList("$").size();
        assertEquals(actualUsersCount, expectedUsersCount, "Unexpected number of users");

        // Add more assertions based on your API response
        // For instance, validate specific user details, etc.
    }
}

