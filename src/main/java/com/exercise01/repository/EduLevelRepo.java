package com.exercise01.repository;


import org.springframework.data.repository.CrudRepository;

import com.exercise01.model.Countries;
import com.exercise01.model.EduLevel;

public interface EduLevelRepo extends CrudRepository<EduLevel, Integer>{

	public EduLevel findById(int id);
}
