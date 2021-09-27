package pojoClassesImplementation;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;

import com.fasterxml.jackson.databind.ObjectMapper;

import static io.restassured.RestAssured.*;

import java.util.Iterator;
import java.util.List;

public class TestPojo {

	public static void main(String[] args) {
		RestAssured.baseURI = "http://makeup-api.herokuapp.com";

		Root[] ar = given()
				// .queryParam("brand", "covergirl")
				.expect().defaultParser(Parser.JSON).when().get("api/v1/products.json").as(Root[].class);

		for (Root root : ar) {
			List<ProductColor> colors = root.getProduct_colors();

			if (colors.size() != 0) {
				System.out.println("**********************\n" + root.getName());
				for (int i = 0; i < colors.size(); i++) {
					System.out.println(colors.get(i).getColour_name() + " : " + colors.get(i).getHex_value());
				}
			}
		}

	}
}
