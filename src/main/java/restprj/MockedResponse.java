package restprj;

import io.restassured.path.json.JsonPath;

public class MockedResponse {

	static JsonPath mockResponse() {
		
		JsonPath jsonPath = new JsonPath("{\r\n"
				+ "  \"glossary\": {\r\n"
				+ "    \"title\": \"example glossary\",\r\n"
				+ "    \"GlossDiv\":[ {\r\n"
				+ "      \"title\": \"Sample1\",\r\n"
				+ "      \"GlossList\": {\r\n"
				+ "        \"GlossEntry\": {\r\n"
				+ "          \"ID\": \"SGML\",\r\n"
				+ "          \"SortAs\": \"SGML\",\r\n"
				+ "          \"GlossTerm\": \"Standard Generalized Markup Language\",\r\n"
				+ "          \"Acronym\": \"SGML\",\r\n"
				+ "          \"Abbrev\": \"ISO 8879:1986\",\r\n"
				+ "          \"GlossDef\": {\r\n"
				+ "            \"para\": \"A meta-markup language, used to create markup languages such as DocBook.\",\r\n"
				+ "            \"GlossSeeAlso\": [\r\n"
				+ "              \"GML\",\r\n"
				+ "              \"XML\"\r\n"
				+ "            ]\r\n"
				+ "          },\r\n"
				+ "          \"GlossSee\": \"markup\"\r\n"
				+ "        }\r\n"
				+ "      }\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"title\": \"Sample2\",\r\n"
				+ "      \"GlossList\": {\r\n"
				+ "        \"GlossEntry\": {\r\n"
				+ "          \"ID\": \"SML\",\r\n"
				+ "          \"SortAs\": \"SML\",\r\n"
				+ "          \"GlossTerm\": \"Standard Markup Language\",\r\n"
				+ "          \"Acronym\": \"SML\",\r\n"
				+ "          \"Abbrev\": \"ISO 8879:12386\",\r\n"
				+ "          \"GlossDef\": {\r\n"
				+ "            \"para\": \"A meta-markup language, used to create markup languages such as DocBook.\",\r\n"
				+ "            \"GlossSeeAlso\": [\r\n"
				+ "              \"GML\",\r\n"
				+ "              \"XML\"\r\n"
				+ "            ]\r\n"
				+ "          },\r\n"
				+ "          \"GlossSee\": \"markup\"\r\n"
				+ "        }\r\n"
				+ "      }\r\n"
				+ "    }\r\n"
				+ "    ]\r\n"
				+ "  }\r\n"
				+ "}");
				
		
		return jsonPath;

		

	}

}
