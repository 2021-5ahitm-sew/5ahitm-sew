package at.htl;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class WeatherResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/weather")
          .then()
             .statusCode(200)
             .body(is("hello"));
    }

}