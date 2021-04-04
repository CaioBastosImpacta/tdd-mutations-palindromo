package com.fit.palindromo.controller;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;

import com.fit.palindromo.anottations.CamadaIntegracao;

import io.restassured.RestAssured;

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
		given().get("/fit/v1/palindromos/Rotator").then().statusCode(HttpStatus.OK.value());
	}
	
	@Test
	public void testVerifySucessoFalse() {
		given().get("/fit/v1/palindromos/CaioBastos").then().statusCode(HttpStatus.OK.value());
	}
}