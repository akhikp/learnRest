package pojoClassesImplementation;

import static io.restassured.RestAssured.given;
//import static org.testng.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class SpecBuilderImplementation {

	public static void main(String[] args) {
		RequestSpecification req = new RequestSpecBuilder().setBaseUri("http://makeup-api.herokuapp.com").build();

		ResponseSpecification resspec = new ResponseSpecBuilder().expectStatusCode(200)
				.expectContentType(ContentType.JSON).build();

		RequestSpecification res = given().spec(req);
		Response response = res.when().get("api/v1/products.json").then().spec(resspec).extract().response();

		String result = response.asString();
		//System.out.println(result);
		
		assertEquals(response.getStatusCode(), 200);
		
	}
}
