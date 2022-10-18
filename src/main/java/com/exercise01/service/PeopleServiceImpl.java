package com.exercise01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercise01.model.Countries;
import com.exercise01.model.EduLevel;
import com.exercise01.model.People;
import com.exercise01.model.Records;
import com.exercise01.model.Sexes;
import com.exercise01.repository.CountriesRepo;
import com.exercise01.repository.EduLevelRepo;
import com.exercise01.repository.PeopleRepo;
import com.exercise01.repository.SexesRepo;

@Service
public class PeopleServiceImpl implements PeopleService{

	
	@Autowired
	CountriesRepo countriesRepo;
	@Autowired
	EduLevelRepo eduRepo;
	@Autowired
	SexesRepo sexesRepo;
	@Autowired
	PeopleRepo peopleRepo;
	
	@Override
	public People getPeopleImpl(Records record,String name,String surname) {
		Countries country = countriesRepo.findById(record.getCountryId());
		EduLevel edu = eduRepo.findById(record.getEducationId());
		Sexes sex = sexesRepo.findById(record.getSexId());
		People people = new People(record.getAge(),country.getName(),edu.getName(),sex.getName(),name,surname,record.getId());
		return people;
	}
	
	
	@Override
	public People getPeopleImpl(String name, String surname,String sex,String country, Integer age) {
		People people = new People(age,country,sex,name,surname);
		peopleRepo.save(people);
		return people;
	}
	@Override
	public People getPeopleImpl(Records record) {
		Countries country = countriesRepo.findById(record.getCountryId());
		EduLevel edu = eduRepo.findById(record.getEducationId());
		Sexes sex = sexesRepo.findById(record.getSexId());
		People people = new People(record.getAge(),country.getName(),edu.getName(),sex.getName());
		return people;
	}

	@Override
	public Iterable<People> getPeopleImpl() {
		Iterable<People> people = peopleRepo.findAll();
		return people;
	}

	@Override
	public Iterable<People> getPeopleImpl(String surname) {
		Iterable<People> people = peopleRepo.findAllBySurname(surname);
		return people;
	}
}
