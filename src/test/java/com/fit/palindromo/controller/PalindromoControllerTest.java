package com.fit.palindromo.controller;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;

import com.fit.palindromo.anottations.CamadaIntegracao;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@CamadaIntegracao
public class PalindromoControllerTest {
	
    @LocalServerPort
    int port;
    
	@BeforeEach
	public void setUp() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        RestAssured.port = port;
	}
	
	@Test
	public void testVerifySucessoTrue() {
		ValidatableResponse validatableResponse = given().get("/fit/v1/palindromos/Rotator").then().statusCode(HttpStatus.OK.value());
		JsonPath jsonPath = new JsonPath(validatableResponse.extract().body().asString());
		
		assertTrue(jsonPath.getBoolean("isPalindromo"));
		assertEquals("This word/phrase is palindromo", jsonPath.getString("message"));
	}
	
	@Test
	public void testVerifySucessoFalse() {
		ValidatableResponse validatableResponse = given().get("/fit/v1/palindromos/CaioBastos").then().statusCode(HttpStatus.OK.value());
		JsonPath jsonPath = new JsonPath(validatableResponse.extract().body().asString());
		
		assertFalse(jsonPath.getBoolean("isPalindromo"));
		assertEquals("This word/phrase isn't palindromo", jsonPath.getString("message"));
	}
}