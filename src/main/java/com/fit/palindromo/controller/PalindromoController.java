package com.fit.palindromo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fit.palindromo.mapper.PalindromoMapper;
import com.fit.palindromo.model.PalindromoModel;
import com.fit.palindromo.service.PalindromoService;

@RestController
@RequestMapping(value = "/fit/v1/palindromos")
public class PalindromoController {
	
	@Autowired
	PalindromoService palindromoService;
	
	@GetMapping("/{text}")
	public PalindromoModel verify(@PathVariable String text) {
		
		var isPalindromo = palindromoService.validate(text);
		var palindromoModel = PalindromoMapper.convert(isPalindromo);
		
		return palindromoModel;
	}
}
