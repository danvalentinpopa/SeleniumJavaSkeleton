package tests.apitests;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import utils.APIBaseTest;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class ResponseCodeTest extends APIBaseTest {

    @Test
    public void testGetRequestReturns200() {
        Response getPostsResponse = given()
                .when()
                .get("/posts");
        assertEquals(getPostsResponse.getStatusCode(), 200, "GET request failed");
    }

    @Test
    public void testPostRequestReturns201Created() {
        String newPostBody = "{\"title\": \"Test Title\", \"body\": \"Test Body\", \"userId\": 1}";
        Response createPostResponse = given()
                .body(newPostBody)
                .when()
                .post("/posts");
        assertEquals(createPostResponse.getStatusCode(), 201, "POST request failed");
    }

    @Test
    public void testPutRequestReturns200() {
        int postIdToUpdate = 1; // Assuming the post with ID 1 exists
        String updatedPostBody = "{\"title\": \"Updated Title\", \"body\": \"Updated Body\", \"userId\": 1}";
        Response updatePostResponse = given()
                .body(updatedPostBody)
                .when()
                .put("/posts/" + postIdToUpdate);
        assertEquals(updatePostResponse.getStatusCode(), 200, "PUT request failed");
    }

    @Test
    public void testDeleteRequestReturns200() {
        int postIdToDelete = 1; // Assuming the post with ID 1 exists
        Response deletePostResponse = given()
                .when()
                .delete("/posts/" + postIdToDelete);
        assertEquals(deletePostResponse.getStatusCode(), 200, "DELETE request failed");
    }

    @Test
    public void testNonExistentResourceReturns404NotFound() {
        int nonExistentPostId = 1000; // Assuming the post with ID 1000 does not exist
        Response nonExistentResourceResponse = given()
                .when()
                .get("/posts/" + nonExistentPostId);
        assertEquals(nonExistentResourceResponse.getStatusCode(), 404, "Non-existent resource check failed");
    }

}
