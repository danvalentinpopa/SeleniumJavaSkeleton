package tests.apitests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import utils.APIBaseTest;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

/**
 * This test attempts to retrieve a user with an ID that does not exist, verifying the response status code.
 */
public class InvalidUserRetrievalAPITest extends APIBaseTest {

    @Test
    public void testInvalidUserRetrievalAPI() {
        int invalidUserId = 1000; // Invalid user ID (assuming it does not exist)
        Response response = given()
                .when()
                .get("/users/" + invalidUserId); // Endpoint for user details

        assertEquals(response.getStatusCode(), 404, "Status code is not 404"); // 404 for resource not found
        // Add more assertions if needed for the error response
    }
}

