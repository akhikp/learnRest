package restprj;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Basictest {
	public static void main(String[] args) {
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String bodyjson = Payload.addPlacePayload;
		
		
		//assert status code
		given().queryParam("key", "qaclick123").header("Content-Type","application/json").body(bodyjson)
		.when().post("maps/api/place/add/json")
		.then()
		//.log().all()
		.assertThat()
			.statusCode(200)
			//.body("scope", equalTo("APP"))
			//.header("server", "Apache/2.4.18 (Ubuntu)")
			;
		
		//retrieve data from response
		
		String responseStr = given().queryParam("key", "qaclick123").header("Content-Type","application/json").body(bodyjson)
		.when().post("maps/api/place/add/json")
		.then().extract().response().asString();
		
		System.out.println("************response*************** \n"+responseStr);
	}
}
