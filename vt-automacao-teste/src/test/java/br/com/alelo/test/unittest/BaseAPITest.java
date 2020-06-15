package br.com.alelo.test.unittest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import org.apache.http.HttpStatus;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import br.com.alelo.config.BaseAPI;

/**
 * Teste Unitário de estrutura de comunicação de testes com Rest Assured
 * 
 * @author henrique.paes@digisystem.com.br
 * @version 1.0.0
 * @since 2020
 */

public class BaseAPITest extends BaseAPI {

	@Test
	@DisplayName("Teste Unitário de estrutura de comunicação de testes com Rest Assured")
	public void ComunicationAPITest() {
		preCondition();
		
		given().
			pathParam("value", 1)
		.when().
			get("/{value}")
		.then()
			.statusCode(HttpStatus.SC_OK)
			.body("userId", is(1), 
				  "id", is(1), 
				  "title", equalTo("delectus aut autem"), 
				  "completed", equalTo(false));
	}

}