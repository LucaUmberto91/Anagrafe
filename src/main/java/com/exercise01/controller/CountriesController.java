package com.exercise01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.exercise01.model.Countries;
import com.exercise01.repository.CountriesRepo;


@RestController
@RequestMapping(path="/countries")
public class CountriesController {

	@Autowired
	CountriesRepo countriesRepo;
	
	@GetMapping(path = "/find")
	public @ResponseBody Countries findCountries(@RequestParam(value = "id") int id) {
		
		Countries countries = countriesRepo.findById(id);
		
		return countries;
	}
}
