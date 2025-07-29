package org.example;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.*;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TodoApiTest {

    private static String itemId;

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "http://localhost:3001"; // change port if needed
    }

    @Test
    @Order(1)
    public void testLogin_ValidCredentials() {
        given()
                .contentType(ContentType.JSON)
                .body("{ \"username\": \"admin\", \"password\": \"1234\" }")
                .when()
                .post("/login")
                .then()
                .statusCode(200)
                .body("token", notNullValue());
    }

    @Test
    @Order(2)
    public void testLogin_InvalidCredentials() {
        given()
                .contentType(ContentType.JSON)
                .body("{ \"username\": \"wrong\", \"password\": \"wrong\" }")
                .when()
                .post("/login")
                .then()
                .statusCode(401);
    }

    @Test
    @Order(3)
    public void testGetItems() {
        given()
                .when()
                .get("/items")
                .then()
                .statusCode(200)
                .body("$", isA(java.util.List.class));
    }

    @Test
    @Order(4)
    public void testCreateItem() {
        String requestBody = "{ \"title\": \"New Todo\", \"completed\": false }";

        Response response = given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("/items");

        response.then()
                .statusCode(201)
                .body("title", equalTo("New Todo"));

        itemId = response.jsonPath().getString("id");

    }

    @Test
    @Order(5)
    public void testUpdateItem() {
        String updatedBody = "{ \"title\": \"Updated Todo\", \"completed\": true }";

        given()
                .contentType(ContentType.JSON)
                .body(updatedBody)
                .when()
                .put("/items/" + itemId)
                .then()
                .statusCode(200)
                .body("title", equalTo("Updated Todo"))
                .body("completed", equalTo(true));
    }

    @Test
    @Order(6)
    public void testDeleteItem() {
        given()
                .when()
                .delete("/items/" + itemId)
                .then()
                .statusCode(200);
    }

    @Test
    @Order(7)
    public void testDeleteItem_NotFound() {
        given()
                .when()
                .delete("/items/invalid-id")
                .then()
                .statusCode(404);
    }
}
