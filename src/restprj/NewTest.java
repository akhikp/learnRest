package restprj;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class NewTest {

	//accessing json objects to validate
	@Test
	public void f() {
		JsonPath js = MockedResponse.mockResponse();
		String expectedTitle = "Sample";
		boolean flag = false;
		for (int i = 0; i < js.getInt("glossary.GlossDiv.size()"); i++) {

			String title = js.get("glossary.GlossDiv[" + i + "].title"); //
			System.out.println("title : " + title);

			if (title.equalsIgnoreCase(expectedTitle)) {
				System.out.println(
						title + " : " + js.getString("glossary.GlossDiv[" + i + "].GlossList.GlossEntry.GlossTerm"));
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("No matching data found for " + expectedTitle + " title.");
		}

	}

	//get json items
	@Test
	public void getValidation() {
		RestAssured.baseURI = "http://makeup-api.herokuapp.com";
		String response = given().queryParam("brand", "maybelline").queryParam("product_type", "lipstick")
				.when().get("api/v1/products.json")
				.then().extract().response().asString();

		JsonPath jp = new JsonPath(response);

		String mkeupitems = jp.getString("name").replace("[", "").replace("]", "").trim();

		String[] makeup = mkeupitems.split(","); // validation
		System.out.println(makeup[0]);
	}

	// passing json file as body
	@Test
	public void postValidation() throws IOException {
		RestAssured.baseURI = "https://reqbin.com/echo/post/json";

		given().log().all().body(new String(Files.readAllBytes(Paths.get("src/restprj/makeup.json"))))
			.when().post()
			.then().assertThat().statusCode(200).body("success", equalTo("true"));
	}
}
