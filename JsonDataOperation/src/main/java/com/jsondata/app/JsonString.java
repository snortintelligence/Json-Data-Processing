package com.jsondata.app;

public class JsonString {
	private static String jsonString = "{\r\n" + "    \"id\": 4,\r\n" + "    \"name\": \"Patricia Lebsack\",\r\n"
			+ "    \"username\": \"Karianne\",\r\n" + "    \"email\": \"Julianne.OConner@kory.org\",\r\n"
			+ "    \"address\": {\r\n" + "      \"street\": \"Hoeger Mall\",\r\n" + "      \"suite\": \"Apt. 692\",\r\n"
			+ "      \"city\": \"South Elvis\",\r\n" + "      \"zipcode\": \"53919-4257\",\r\n" + "      \"geo\": {\r\n"
			+ "        \"lat\": \"29.4572\",\r\n" + "        \"lng\": \"-164.2990\"\r\n" + "      }\r\n" + "    },\r\n"
			+ "    \"phone\": \"493-170-9623 x156\",\r\n" + "    \"website\": \"kale.biz\",\r\n"
			+ "    \"company\": {\r\n" + "      \"name\": \"Robel-Corkery\",\r\n"
			+ "      \"catchPhrase\": \"Multi-tiered zero tolerance productivity\",\r\n"
			+ "      \"bs\": \"transition cutting-edge web services\"\r\n" + "    }\r\n" + "  }";

	public static String getJsonString() {
		return jsonString;
	}

}
