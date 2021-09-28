package learnStepByStep;

import java.util.Iterator;

import io.restassured.path.json.JsonPath;

public class ValidateMock {

	public static void main(String[] args) {
		JsonPath js = MockedResponse.mockResponse();

		// System.out.println(js.getInt("glossary.size()"));
		// System.out.println(js.getInt("glossary.GlossDiv.GlossList.GlossEntry.size()"));

		// System.out.println("all ids in the GlossEntry :
		// "+js.getString("glossary.GlossDiv.GlossList.GlossEntry.ID"));

		// System.out.println("ids in the GlossEntry[2] :
		// "+js.getString("glossary.GlossDiv[1].GlossList.GlossEntry.ID"));

		// fetch all the glossary terms in the array GlossDiv for MATCHing title

		String expectedTitle = "Sample";
		boolean flag = false;
		for (int i = 0; i < js.getInt("glossary.GlossDiv.size()"); i++) {

			String title = js.get("glossary.GlossDiv[" + i + "].title");
			// System.out.println("title : "+title);

			if (title.equalsIgnoreCase(expectedTitle)) {
				System.out.println(
						title + " : " + js.getString("glossary.GlossDiv[" + i + "].GlossList.GlossEntry.GlossTerm"));
				flag = true;
				break;
			}

		}
		if (!flag) {
			System.out.println("No matching data found for " + expectedTitle+" title.");
		}

	}

}
