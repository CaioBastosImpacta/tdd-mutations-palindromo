package com.fit.palindromo.mapper.enuns;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.fit.palindromo.anottations.CamadaUnitario;
import com.fit.palindromo.mapper.enums.PalindromoEnum;

@CamadaUnitario
public class PalindromoEnumTest {

	@Test
	public void testGetMessageTrue() {
		var message = PalindromoEnum.getMessage(true);
		assertEquals("This word/phrase is palindromo", message.get());
	}
	
	@Test
	public void testGetMessageFalse() {
		var message = PalindromoEnum.getMessage(false);
		assertEquals("This word/phrase isn't palindromo", message.get());
	}
}