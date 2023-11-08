package tests.apitests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import utils.APIBaseTest;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

/**
 * This test retrieves posts made by a specific user and verifies the count of posts returned.
 */
public class UserPostsAPITest extends APIBaseTest {

    @Test
    public void testUserPostsAPI() {
        int userId = 1; // Change the user ID based on your test scenario
        Response response = given()
                .when()
                .get("/users/" + userId + "/posts"); // Endpoint to get user's posts

        assertEquals(response.getStatusCode(), 200, "Status code is not 200");

        int expectedPostCount = 10; // Assuming it returns 10 posts
        int actualPostCount = response.jsonPath().getList("$").size();
        System.out.println(actualPostCount);
        assertEquals(actualPostCount, expectedPostCount, "Unexpected number of posts");

        // Add more assertions to validate post details if needed
    }
}

