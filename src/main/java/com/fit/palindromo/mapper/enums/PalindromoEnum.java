package com.fit.palindromo.mapper.enums;

import java.util.Optional;

public enum PalindromoEnum {
	
	MESSAGE_TRUE(true, "This word/phrase is palindromo"),
	MESSAGE_FALSE(false, "This word/phrase isn't palindromo");
	
	private boolean isPalindromo;
	private String message;
	
	private PalindromoEnum(boolean isPalindromo, String message) {
		this.isPalindromo = isPalindromo;
		this.message = message;
	}
	
	public boolean getIsPalindromo() {
		return this.isPalindromo;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public static Optional<String> getMessage(boolean isPalindromo) {
		
		for(PalindromoEnum palindromoEnum : PalindromoEnum.values()) {
			if(palindromoEnum.getIsPalindromo() == isPalindromo) {
				return Optional.of(palindromoEnum.getMessage());
			}
		}
		
		return Optional.empty();
	}

}