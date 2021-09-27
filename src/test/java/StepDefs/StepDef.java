package StepDefs;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileNotFoundException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import learnRest.Utils;

public class StepDef extends Utils{
	RequestSpecification req;
	ResponseSpecification resspec;
	RequestSpecification res;
	Response response;

	@Given("add payload")
	public void add_payload() {
		
		//req = new RequestSpecBuilder().setBaseUri("http://makeup-api.herokuapp.com").build();
		//resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
	}

	@Given("all the constaints")
	public void all_the_constaints() throws FileNotFoundException {
		req = reqSpecification();
		resspec = responseScification();		
	}

	@When("user sends the query")
	public void user_is_sends_the_query() {
		res = given().spec(req);
	}

	@Then("user recives the json")
	public void user_recives_the_json() {
		response = res.when().get("api/v1/products.json").then().spec(resspec).extract().response();

		String result = response.asString();
		System.out.println(result);

		assertEquals(response.getStatusCode(), 200);
	}

}
