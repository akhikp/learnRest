package restprj;

import static io.restassured.RestAssured.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.restassured.path.json.JsonPath;

public class OAuth {

	public static void main(String[] args) {

		/* // Manual intervention required since google is not alowing the automation testing framework to access this
		 * // ask dev to increase the lifetime for the code expiration
		 * 
		 * // get code - login thru browser [use selenium]
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\softwares\\browser_drivers\\chromedriver.exe"); WebDriver driver = new
		 * ChromeDriver(); String url =""; driver.get(url);
		 * driver.findElement(By.xpath("")).sendKeys("");
		 * driver.findElement(By.xpath("")).click(); String currentURL =
		 * driver.getCurrentUrl(); String partialCode= currentURL.split("code=")[1];
		 * String code = partialCode.split("&scope")[0];
		 */
		

		// get access token
		//recent update: fetch manually from browser
		String code = "3343dffdfdf";
		String accessTokenString = given().urlEncodingEnabled(false)
				.queryParam("code",code)
				.queryParam("", "")
				.queryParam("", "")
				.queryParam("", "")
				.when().post("token url").asString();

		JsonPath jp = new JsonPath(accessTokenString);
		String accessToken = jp.getString("access_token");

		// login
		String response = given().queryParam("access_token", "").when().get("endpint").asString();

		System.out.println(response);

	}
}
