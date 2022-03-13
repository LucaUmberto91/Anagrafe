package com.exercise01.repository;


import org.springframework.data.repository.CrudRepository;

import com.exercise01.model.Countries;

public interface CountriesRepo extends CrudRepository<Countries, Integer>{

	public Countries findById(int id);
}
