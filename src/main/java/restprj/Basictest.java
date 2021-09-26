package restprj;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

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
		
		//retrieve data from response - place id
		
		String responseStr = given().queryParam("key", "qaclick123").header("Content-Type","application/json").body(bodyjson)
		.when().post("maps/api/place/add/json")
		.then().extract().response().asString();
		
		//System.out.println("************response*************** \n"+responseStr);
		
		JsonPath jp = ResuableMethods.getJSONformat(responseStr);
		String placeId = jp.getString("place_id");
		
		//System.out.println(placeId);
		
		
		//update the address key with help of place_id
		String updateAddress = Payload.updatePayload;
		String update = updateAddress.replaceFirst("placeid", placeId);
		System.out.println("updated payload"+update);
		
		String message = given().queryParam("key", "qaclick123").header("Content-Type","application/json").body(update)
		.when().put("maps/api/place/update/json")
		.then().assertThat()
			.statusCode(200)
			.extract().response().asString();
		
		System.out.println(message);
		
		//validate if the address is updated correctly 
		String placeData = given().queryParam("key", "qaclick123").queryParam("place_id", placeId)
		.when().get("maps/api/place/get/json")
		.then().assertThat()
			.statusCode(200)
			.extract().response().asString();
		
		jp = ResuableMethods.getJSONformat(placeData);
		String actualaddress = jp.getString("address");
		System.out.println("UPDATED address : "+actualaddress);
		
		//assertion
		//SoftAssert sa = new SoftAssert();
		
		String expectedAdress = "Jp Nagar, Bangalore Karnataka";
		
		Assert.assertEquals(actualaddress,expectedAdress);
		
		
		
	}
}
