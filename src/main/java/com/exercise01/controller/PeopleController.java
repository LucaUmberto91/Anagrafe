package com.exercise01.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.exercise01.admin.model.Admin;
import com.exercise01.admin.repository.AdminRepo;
import com.exercise01.model.People;
import com.exercise01.model.Records;
import com.exercise01.repository.ArchiveRepo;
import com.exercise01.repository.CountriesRepo;
import com.exercise01.repository.EduLevelRepo;
import com.exercise01.repository.PeopleRepo;
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
	PeopleRepo peopleRepo;
	@Autowired
	PeopleService peopleService;
	@Autowired
	AdminRepo adminRepo;

	@PostMapping(path = "/populate")
	public @ResponseBody String populate(@RequestParam(value = "idCountry") int idCountry,
			@RequestParam(value = "idEdu") int idEdu, @RequestParam(value = "idSex") int idSex,
			@RequestParam(value = "age") Integer age, @RequestParam(value = "name") String name,
			@RequestParam(value = "surname") String surname, @RequestBody Admin admin) {
		
		Admin adminC = adminRepo.findByUsernameAndPassword(admin.getUsername(), admin.getPassword());
		if (adminC != null) {
			Records record = new Records();

			record.setAge(age);
			record.setCountryId(idCountry);
			record.setSexId(idSex);
			record.setEducationId(idEdu);
			recordsRepo.save(record);

			People p = peopleService.getPeopleImpl(record, name, surname);
			record.setPeople(p);
			peopleRepo.save(p);

			// Exercise for Java 8 Stream
//			List<String> listaStringPeople = Arrays.asList("Pippo", "Ciccio", "Alfonso");
//			Optional<String> ridotta = listaStringPeople.stream().sorted().reduce((s1, s2) -> s1 + "," + s2);
//			listaStringPeople.stream().filter((s) -> s.startsWith("I")).forEach(System.out::println);
//			ridotta.ifPresent(System.out::println);
			// Exercise for Java 8 Stream

			return "Populate!";
		} else
			return "User or Password not correct!";

	}

	@GetMapping(path = "/find")
	public @ResponseBody Records find(@RequestParam(value = "id") int idRecord, @RequestBody Admin admin) {
		Admin adminC = adminRepo.findByUsernameAndPassword(admin.getUsername(), admin.getPassword());
		if (adminC != null) {
			Records record = recordsRepo.findById(idRecord);

			return record;
		} else
			return null;
	}

	@GetMapping(path = "/findAll/Anonymous")
	public @ResponseBody Iterable<Records> findAllAnonymousPeople(@RequestBody Admin admin) {
		Admin adminC = adminRepo.findByUsernameAndPassword(admin.getUsername(), admin.getPassword());
		if (adminC != null) {
			Iterable<Records> recordP = recordsRepo.findAll();
			recordP.forEach((s) -> s.setPeople(peopleService.getPeopleImpl(s)));
//		for (Records record : recordP) {
//			record.setPeople(peopleService.getPeopleImpl(record));
//		}
			return recordP;
		} else
			return null;

	}

	@GetMapping(path = "/findAllPeople")
	public @ResponseBody Iterable<People> findAll(@RequestBody Admin admin) {
		Admin adminC = adminRepo.findByUsernameAndPassword(admin.getUsername(), admin.getPassword());
		if (adminC != null) {
			Iterable<People> peoples = peopleRepo.findAll();
			return peoples;
		} else
			return null;

	}

}
