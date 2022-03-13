package com.exercise01.repository;


import org.springframework.data.repository.CrudRepository;

import com.exercise01.model.Countries;
import com.exercise01.model.Sexes;

public interface SexesRepo extends CrudRepository<Sexes, Integer>{

	public Sexes findById(int id);
}
