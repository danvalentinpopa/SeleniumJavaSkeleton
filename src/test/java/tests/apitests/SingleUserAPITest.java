package tests.apitests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import utils.APIBaseTest;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

/**
 * This test fetches a single user by ID and verifies specific details, such as the user's name.
 */
public class SingleUserAPITest extends APIBaseTest {

    @Test
    public void testSingleUserAPI() {
        int userId = 1; // Change the user ID based on your test scenario
        Response response = given()
                .when()
                .get("/users/" + userId); // Endpoint to get a single user

        assertEquals(response.getStatusCode(), 200, "Status code is not 200");

        String userName = "Leanne Graham"; // Expected user name
        String actualUserName = response.jsonPath().getString("name");
        assertEquals(actualUserName, userName, "Unexpected user name");

        // Add more assertions to validate other details if needed
    }
}
