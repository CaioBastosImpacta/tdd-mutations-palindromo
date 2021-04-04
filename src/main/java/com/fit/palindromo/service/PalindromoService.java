package com.fit.palindromo.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

@Component
public class PalindromoService {

	public boolean validate(String text) {
		
		var textPalindromo = "";
		
		String textCurrent = StringUtils.deleteWhitespace(text);
 		textCurrent = textCurrent.replaceAll("\\p{Punct}", "");
		
		for(int i = textCurrent.length() - 1; i >= 0; i--) {
			textPalindromo += textCurrent.charAt(i);
		}
		
		return textPalindromo.equalsIgnoreCase(textCurrent);
	}

}
