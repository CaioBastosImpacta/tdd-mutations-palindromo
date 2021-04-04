package com.fit.palindromo.service;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.fit.palindromo.anottations.CamadaUnitario;

@CamadaUnitario
public class PalindromoServiceTest {
	
	private PalindromoService palindromoService = new PalindromoService();
	
	@Test
	public void testValidateWhenWordIsSucessRotator() {
		
		boolean textIsPalindromo = palindromoService.validate("Rotator");
		
		assertTrue(textIsPalindromo);	
	}
	
	@Test
	public void testValidateWhenWordIsSucessBob() {
		
		boolean textIsPalindromo = palindromoService.validate("bob");
		
		assertTrue(textIsPalindromo);	
	}
	
	@Test
	public void testValidateWhenWordIsSucessmadam() {
		
		boolean textIsPalindromo = palindromoService.validate("madam");
		
		assertTrue(textIsPalindromo);	
	}
	
	@Test
	public void testValidateWhenWordIsSucessMalayalam() {
		
		boolean textIsPalindromo = palindromoService.validate("mAlAyAlam");
		
		assertTrue(textIsPalindromo);	
	}
	
	@Test
	public void testValidateWhenWordIsSucess1() {
		
		boolean textIsPalindromo = palindromoService.validate("1");
		
		assertTrue(textIsPalindromo);	
	}
	
	@Test
	public void testValidateWhenPhraseIsSucessOne() {
		
		boolean textIsPalindromo = palindromoService.validate("Able was I, ere I saw Elba");
		
		assertTrue(textIsPalindromo);	
	}

	@Test
	public void testValidateWhenPhraseIsSucessTwo() {
		
		boolean textIsPalindromo = palindromoService.validate("Madam I'm Adam");
		
		assertTrue(textIsPalindromo);	
	}
	
	@Test
	public void testValidateWhenPhraseIsSucessThree() {
		
		boolean textIsPalindromo = palindromoService.validate("Step on no pets");
		
		assertTrue(textIsPalindromo);	
	}

	@Test
	public void testValidateWhenPhraseIsSucessFour() {
		
		boolean textIsPalindromo = palindromoService.validate("Top spot!");
		
		assertTrue(textIsPalindromo);	
	}
	
	@Test
	public void testValidateWhenWordIsInvalidXyz() {
		
		boolean textIsPalindromo = palindromoService.validate("xyz");
		
		assertFalse(textIsPalindromo);	
	}
	
	@Test
	public void testValidateWhenWordIsInvalidElephant() {
		
		boolean textIsPalindromo = palindromoService.validate("elephant");
		
		assertFalse(textIsPalindromo);	
	}
	
	@Test
	public void testValidateWhenWordIsInvalidCountry() {
		
		boolean textIsPalindromo = palindromoService.validate("Country");
		
		assertFalse(textIsPalindromo);	
	}
	
	@Test
	public void testValidateWhenPhraseIsInvalidOne() {
		
		boolean textIsPalindromo = palindromoService.validate("Top . post!");
		
		assertFalse(textIsPalindromo);	
	}
	
	@Test
	public void testValidateWhenPhraseIsInvalidTwo() {
		
		boolean textIsPalindromo = palindromoService.validate("Wonderful-fool");
		
		assertFalse(textIsPalindromo);	
	}
	
	@Test
	public void testValidateWhenPhraseIsInvalidThree() {
		
		boolean textIsPalindromo = palindromoService.validate("Wild imagination!");
		
		assertFalse(textIsPalindromo);	
	}
}


