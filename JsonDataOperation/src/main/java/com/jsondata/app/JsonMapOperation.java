package com.jsondata.app;

import java.io.IOException;
import java.util.LinkedHashMap;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonMapOperation {
	public static void main(String[] args) {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			LinkedHashMap<String, Object> mapped = new LinkedHashMap<String, Object>();

			mapped = objectMapper.readValue(JsonString.getJsonString(),
					new TypeReference<LinkedHashMap<String, Object>>() {
					});

			System.out.println(mapped);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
