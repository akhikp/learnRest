package learnStepByStep;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import io.restassured.path.json.JsonPath;

public class ResuableMethods {

	
public static JsonPath getJSONformat(String s){
	JsonPath jp = new JsonPath(s);
	return jp;
}

public static String generateStrFromJsonFile(String path) throws IOException
{
	return new String(Files.readAllBytes(Paths.get(path)));
}

}
