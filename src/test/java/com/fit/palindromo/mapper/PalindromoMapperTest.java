package com.fit.palindromo.mapper;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.fit.palindromo.anottations.CamadaUnitario;
import com.fit.palindromo.model.PalindromoModel;

@CamadaUnitario
public class PalindromoMapperTest {

	@Test
	public void convertSucessTrue() {
		
		PalindromoModel palindromoModel = PalindromoMapper.convert(true);
		
		assertAll(
				() -> assertTrue(palindromoModel.getIsPalindromo()),
				() -> assertEquals("This word/phrase is palindromo", palindromoModel.getMessage())
		);
	}
	
	@Test
	public void convertSucessFalse() {
		
		PalindromoModel palindromoModel = PalindromoMapper.convert(false);
		
		assertAll(
				() -> assertFalse(palindromoModel.getIsPalindromo()),
				() -> assertEquals("This word/phrase isn't palindromo", palindromoModel.getMessage())
		);
	}
}
