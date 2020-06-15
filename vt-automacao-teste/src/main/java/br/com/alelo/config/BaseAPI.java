package br.com.alelo.config;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.config;
import static io.restassured.RestAssured.enableLoggingOfRequestAndResponseIfValidationFails;
import static io.restassured.config.JsonConfig.jsonConfig;
import static io.restassured.path.json.config.JsonPathConfig.NumberReturnType.BIG_DECIMAL;

import io.restassured.config.RestAssuredConfig;

public abstract class BaseAPI {
	public static void preCondition() {
		baseURI = "https://jsonplaceholder.typicode.com";
		basePath = "/todos";
		
		config = RestAssuredConfig.newConfig().jsonConfig(jsonConfig().numberReturnType(BIG_DECIMAL));
				
		enableLoggingOfRequestAndResponseIfValidationFails();
	}
}