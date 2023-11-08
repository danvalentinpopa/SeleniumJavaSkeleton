package tests.apitests;

import io.restassured.response.Response;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import utils.APIBaseTest;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

/**
 * GET Request Test:
 * Fetches posts using a GET request and validates the response status code.
 *
 * POST Request Test:
 * Creates a new post using a POST request with a request body and validates the response status code.
 *
 * PUT Request Test:
 * Updates an existing post using a PUT request with updated data and validates the response status code.
 *
 * DELETE Request Test:
 * Deletes an existing post using a DELETE request and validates the response status code.
 */
public class CRUDAPITest extends APIBaseTest {

    @Test
    public void testGetRequest() {
        Response response = given()
                .when()
                .get("/posts"); // GET request to fetch posts

        assertEquals(response.getStatusCode(), 200, "GET request failed");
        // Add more assertions to validate the response if needed
    }

    @Test
    public void testPostRequest() {
        String requestBody = "{\"title\": \"Test Title\", \"body\": \"Test Body\", \"userId\": 1}";
        Response response = given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("/posts"); // POST request to create a post

        assertEquals(response.getStatusCode(), 201, "POST request failed");
        // Add more assertions to validate the creation of the post if needed
    }

    @Test
    public void testPutRequest() {
        int postIdToUpdate = 1; // Assuming the post with ID 1 exists
        String updatedBody = "{\"body\": \"Updated Body Content\"}";
        Response response = given()
                .contentType(ContentType.JSON)
                .body(updatedBody)
                .when()
                .put("/posts/" + postIdToUpdate); // PUT request to update a post

        assertEquals(response.getStatusCode(), 200, "PUT request failed");
        // Add more assertions to validate the updated post if needed
    }

    @Test
    public void testDeleteRequest() {
        int postIdToDelete = 1; // Assuming the post with ID 1 exists
        Response response = given()
                .when()
                .delete("/posts/" + postIdToDelete); // DELETE request to delete a post

        assertEquals(response.getStatusCode(), 200, "DELETE request failed");
        // Add more assertions to validate the deletion if needed
    }
}

