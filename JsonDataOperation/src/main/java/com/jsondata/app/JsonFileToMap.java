package com.jsondata.app;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonFileToMap {
	public static void main(String[] args) {

		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			List<Map<String, Object>> map = mapper.readValue(Paths.get("users.json").toFile(),
					new TypeReference<List<Map<String, Object>>>() {
					});
			
			for (Map<String, Object> data : map) {
				System.out.println(data);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
