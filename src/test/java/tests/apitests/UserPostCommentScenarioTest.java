package tests.apitests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import utils.APIBaseTest;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class UserPostCommentScenarioTest extends APIBaseTest {

    @Test
    public void testUserPostCommentScenario() {
        // Step 1: Create a new user
        String newUserRequestBody = "{\"name\": \"John Doe\", \"username\": \"johndoe\", \"email\": \"johndoe@example.com\"}";
        Response createUserResponse = given()
                .contentType(ContentType.JSON)
                .body(newUserRequestBody)
                .when()
                .post("/users");

        assertEquals(createUserResponse.getStatusCode(), 201, "User creation failed");

        // Extract the created user's ID from the response
        int userId = createUserResponse.jsonPath().getInt("id");

        // Step 2: Create a post by the user
        String newPostRequestBody = "{\"userId\": " + userId + ", \"title\": \"Test Post\", \"body\": \"This is a test post.\"}";
        Response createPostResponse = given()
                .contentType(ContentType.JSON)
                .body(newPostRequestBody)
                .when()
                .post("/posts");

        assertEquals(createPostResponse.getStatusCode(), 201, "Post creation failed");

        // Extract the created post's ID from the response
        int postId = createPostResponse.jsonPath().getInt("id");

        // Step 3: Add a comment to the post
        String newCommentRequestBody = "{\"postId\": " + postId + ", \"name\": \"Test Comment\", \"email\": \"test@example.com\", \"body\": \"This is a test comment.\"}";
        Response createCommentResponse = given()
                .contentType(ContentType.JSON)
                .body(newCommentRequestBody)
                .when()
                .post("/comments");

        assertEquals(createCommentResponse.getStatusCode(), 201, "Comment creation failed");

        // Assertions to verify successful execution of each step
        // Additional assertions to check specific details or responses can be added for more thorough testing
    }
}

