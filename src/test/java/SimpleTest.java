import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class SimpleTest {
    @Test
    public void sampleAPITest(){
        baseURI="https://reqres.in/api";
        ValidatableResponse response=
                given()
                        .filter(new AllureRestAssured())
                        .param(" ", " ")
                        .header(" "," ")
                        .when()
                        .log()
                        .all()
                        .get("/users/3")
                        .then()
                        .statusCode(200);
    }
}
