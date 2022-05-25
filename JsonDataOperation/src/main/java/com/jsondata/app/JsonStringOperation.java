package com.jsondata.app;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jsondata.app.pojo.Address;
import com.jsondata.app.pojo.Company;
import com.jsondata.app.pojo.Geo;
import com.jsondata.app.pojo.Users;

public class JsonStringOperation {
	public static void main(String[] args) {

		Users users = new Users();
		Address address = new Address();
		Geo geo = new Geo();
		Company company = new Company();

		JsonNode jsonNode;
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			jsonNode = objectMapper.readTree(JsonString.getJsonString());
			System.out.println(JsonString.getJsonString());
			System.out.println(jsonNode);

			// get key value of jsonNode :
			users.setId(jsonNode.get("id").asLong());
			users.setName(jsonNode.get("name").asText());
			users.setUsername(jsonNode.get("username").asText());
			users.setEmail(jsonNode.get("email").asText());
			users.setPhone(jsonNode.get("phone").asText());
			users.setWebsite(jsonNode.get("website").asText());

			// nested value
			address.setStreet(jsonNode.path("address").path("street").asText());
			address.setSuite(jsonNode.path("address").path("suite").asText());
			address.setCity(jsonNode.path("address").path("city").asText());
			address.setZipcode(jsonNode.path("address").path("zipcode").asText());

			geo.setLat(jsonNode.path("address").path("geo").path("lat").asText());
			geo.setLng(jsonNode.path("address").path("geo").path("lng").asText());

			company.setName(jsonNode.path("company").path("name").asText());
			company.setBs(jsonNode.path("company").path("bs").asText());
			company.setCatchPhrase(jsonNode.path("company").path("catchPhrase").asText());

			users.setAddress(address);
			address.setGeo(geo);
			users.setCompany(company);

			System.out.println(users);

			System.out.println(address);

			System.out.println(geo);

		} catch (JsonProcessingException e) {

			e.printStackTrace();
		}
	}
}
