package learnRest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Utils {
	RequestSpecification req;
	ResponseSpecification resspec;

	public RequestSpecification reqSpecification() throws FileNotFoundException {
		PrintStream stream = new PrintStream(new FileOutputStream("logs.txt"));
		req = new RequestSpecBuilder().setBaseUri("http://makeup-api.herokuapp.com")
				.addFilter(RequestLoggingFilter.logRequestTo(stream))
				// .addFilter(ResponseLoggingFilter.logResponseTo(stream))
				.build();
		return req;
	}

	public ResponseSpecification responseScification() {
		resspec = new ResponseSpecBuilder()
				// .expectStatusCode(200)
				.expectContentType(ContentType.JSON).build();
		return resspec;
	}

	public static String getGlobalVars(String key) throws IOException {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("global.properties");
		p.load(fis);
		return p.getProperty(key);
		
	}
}
