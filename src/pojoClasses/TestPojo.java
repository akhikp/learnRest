package pojoClasses;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;

import com.fasterxml.jackson.databind.ObjectMapper;

import static io.restassured.RestAssured.*;

public class TestPojo {

	public static void main(String[] args) {
		RestAssured.baseURI = "http://makeup-api.herokuapp.com";

		Root[] ar = given().queryParam("brand", "maybelline").expect().defaultParser(Parser.JSON).when()
				.get("api/v1/products.json").as(Root[].class);

		for (Root root : ar) {
			System.out.println(root.getName());
		}
		
	}
}
