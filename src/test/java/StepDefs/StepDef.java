package StepDefs;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileNotFoundException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import learnRestResource.APIresource;
import learnRestResource.Utils;


public class StepDef extends Utils{
	RequestSpecification req;
	ResponseSpecification resspec;
	RequestSpecification res;
	Response response;

	@Given("add payload")
	public void add_payload() {

		// req = new
		// RequestSpecBuilder().setBaseUri("http://makeup-api.herokuapp.com").build();
		// resspec = new
		// ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
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

	@Given("payload with {string} {string} {string}")
	public void payload_with(String string, String string2, String string3) {

	}

	@When("user calls {string} with {string} http request")
	public void user_calls_with_http_request(String resource, String httprequest) {

		APIresource resourceAPI = APIresource.valueOf(resource);
		System.out.println("RESOURCE :" + resourceAPI.getResource());

		resspec = new ResponseSpecBuilder().expectStatusCode(200).build();

		if (httprequest.equalsIgnoreCase("post")) {
			response = res.when().post(resourceAPI.getResource());
		} else if (httprequest.equalsIgnoreCase("get")) {
			response = res.when().get(resourceAPI.getResource());
		}

	}

	@Then("user recieves response with status code {string}")
	public void user_recieves_response_with_status_code(String string) {

	}

	@Then("{string} in response body is {string}")
	public void in_response_body_is(String expectedKeyName, String expectedValue) throws FileNotFoundException {
		
		String place_id = getJsonPath(response, expectedKeyName);
		res = given().spec(reqSpecification().queryParam("place_id", place_id));
		//user_calls_with_http_request(res, "GET");
		//String actualName= getJsonPath(res, "name");		
		assertEquals(getJsonPath(response, expectedKeyName), expectedValue);
	}

}
