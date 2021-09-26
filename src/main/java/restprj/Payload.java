package restprj;

public class Payload {

	static String addPlacePayload="{\r\n"
			+ "	\"location\":{\r\n"
			+ "		\"lat\":-38.2323232323,\r\n"
			+ "		\"lng\":33.342343\r\n"
			+ "	},\r\n"
			+ "	\"accuracy\":50,\r\n"
			+ "	\"name\":\"RSA\",\r\n"
			+ "	\"phone_number\":\"9876543210\",\r\n"
			+ "	\"address\":\"RSA city\",\r\n"
			+ "	\"types\":[\"shop\",\"shoe park\"],\r\n"
			+ "	\"website\":\"www.example.com\",\r\n"
			+ "	\"language\":\"english\"\r\n"
			+ "}";
	public static String updatePayload="{\r\n"
			+ "	\"place_id\":\"placeid\",\r\n"
			+ "	\"address\":\""+TestData.address+"\",\r\n"
			+ "	\"key\":\"qaclick123\"\r\n"
			+ "}";
}



