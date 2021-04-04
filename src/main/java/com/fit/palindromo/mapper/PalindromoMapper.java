package com.fit.palindromo.mapper;

import com.fit.palindromo.mapper.enums.PalindromoEnum;
import com.fit.palindromo.model.PalindromoModel;

public class PalindromoMapper {

	public static PalindromoModel convert(boolean isPalindromo) {
		
		var messagePalindromo = PalindromoEnum.getMessage(isPalindromo);
		
		PalindromoModel palindromoModel = new PalindromoModel();
		palindromoModel.setIsPalindromo(isPalindromo);
		palindromoModel.setMessage(messagePalindromo.get());
		
		return palindromoModel;
	}

}