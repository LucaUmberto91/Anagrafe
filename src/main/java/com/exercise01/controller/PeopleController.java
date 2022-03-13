package com.exercise01.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.exercise01.model.Records;
import com.exercise01.repository.ArchiveRepo;
import com.exercise01.repository.CountriesRepo;
import com.exercise01.repository.EduLevelRepo;
import com.exercise01.repository.RecordsRepo;
import com.exercise01.repository.SexesRepo;
import com.exercise01.service.PeopleService;

@RestController

@RequestMapping(path = "/people")
public class PeopleController {

	@Autowired
	CountriesRepo countriesRepo;
	@Autowired
	EduLevelRepo eduRepo;
	@Autowired
	RecordsRepo recordsRepo;
	@Autowired
	SexesRepo sexesRepo;
	@Autowired
	ArchiveRepo archiveRepo;
	@Autowired
	PeopleService peopleService;

	@PostMapping(path = "/populate")
	public @ResponseBody Records populate(@RequestParam(value = "idCountry") int idCountry,
			@RequestParam(value = "idEdu") int idEdu, @RequestParam(value = "idSex") int idSex,
			@RequestParam(value = "age") Integer age) {

		Records record = new Records();

		record.setAge(age);
		record.setCountryId(idCountry);
		record.setSexId(idSex);
		record.setEducationId(idEdu);
		recordsRepo.save(record);

		record.setPeople(peopleService.getPeopleImpl(record));

		// Exercise for Java 8 Stream
		List<String> listaStringPeople = Arrays.asList("Pippo", "Ciccio", "Alfonso");
		Optional<String> ridotta = listaStringPeople.stream().sorted().reduce((s1, s2) -> s1 + "," + s2);
		listaStringPeople.stream().filter((s) -> s.startsWith("I")).forEach(System.out::println);
		ridotta.ifPresent(System.out::println);
		// Exercise for Java 8 Stream

		return record;
	}

	@GetMapping(path = "/find")
	public @ResponseBody Records find(@RequestParam(value = "id") int idRecord) {

		Records record = recordsRepo.findById(idRecord);

		return record;
	}

	@GetMapping(path = "/findAllPeople")
	public @ResponseBody Iterable<Records> findAllPeople() {

		Iterable<Records> recordP = recordsRepo.findAll();
		recordP.forEach((s)-> s.setPeople(peopleService.getPeopleImpl(s)));
//		for (Records record : recordP) {
//			record.setPeople(peopleService.getPeopleImpl(record));
//		}
		return recordP;

	}

}
