package com.exercise01.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.servlet.ModelAndView;

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
	PeopleService peopleService;
	@Autowired
	PeopleRepo peopleRepo;
	@Autowired
	AdminRepo adminRepo;

//	@GetMapping("/nuovoView")
//	public ModelAndView nuovoCliente() {
//		return new ModelAndView("cliente", "datiCliente", new People());
//	}
//	
//	@PostMapping(path = "/populateView")
//	public @ResponseBody ModelAndView populateView(@ModelAttribute("datiCliente") People people) {
//		
//		peopleService.getPeopleImpl(people.getName(), people.getSurname(), people.getSex(),
//				people.getCountry(), people.getAge());
//		return new ModelAndView("cliente", "datiCliente", new People());
//		
//
//	}
	
	
	@GetMapping("/newForm")
	public ModelAndView nuovoCliente() {
		return new ModelAndView("form", "datiCliente", new People());
	}
	
	@PostMapping(path = "/populateForm")
	public @ResponseBody ModelAndView populateForm(@ModelAttribute("datiCliente") People people) {
		
			peopleRepo.save(people);
			
			return new ModelAndView("form", "datiCliente", new People());
		

	}
	
	@PostMapping(path = "/populate")
	public @ResponseBody ModelAndView populate(@RequestParam(value = "idCountry") int idCountry,
			@RequestParam(value = "idEdu") int idEdu, @RequestParam(value = "idSex") int idSex,
			@ModelAttribute("datiCliente") People people, @RequestBody Admin admin) {
		
		Admin adminC = adminRepo.findByUsernameAndPassword(admin.getUsername(), admin.getPassword());
		if (adminC != null) {
			Records record = new Records();

			record.setAge(people.getAge());
			record.setCountryId(idCountry);
			record.setSexId(idSex);
			record.setEducationId(idEdu);
			recordsRepo.save(record);

			People p = peopleService.getPeopleImpl(record, people.getName(), people.getSurname());
			record.setPeople(p);
			peopleRepo.save(p);

			// Exercise for Java 8 Stream
//			List<String> listaStringPeople = Arrays.asList("Pippo", "Ciccio", "Alfonso");
//			Optional<String> ridotta = listaStringPeople.stream().sorted().reduce((s1, s2) -> s1 + "," + s2);
//			listaStringPeople.stream().filter((s) -> s.startsWith("I")).forEach(System.out::println);
//			ridotta.ifPresent(System.out::println);
			// Exercise for Java 8 Stream

			return new ModelAndView("form", "datiCliente", new People());
		} else
			return null;

	}

	@GetMapping(path = "/find")
	public @ResponseBody Object find(@RequestParam(value = "id") int idRecord, @RequestBody Admin admin) {
		Admin adminC = adminRepo.findByUsernameAndPassword(admin.getUsername(), admin.getPassword());
		if (adminC != null) {
			Records record = recordsRepo.findById(idRecord);
			if (record != null) {
				People p = peopleService.getPeopleImpl(record);
				record.setPeople(p);
				return record;
			} else
				return "Element with id " + idRecord + " not present";

		} else
			return "ACCESS DENIED!";
	}
	
	@GetMapping(path = "/remove")
	public @ResponseBody Object remove(@RequestParam(value = "id") int idRecord, @RequestBody Admin admin) {
		Admin adminC = adminRepo.findByUsernameAndPassword(admin.getUsername(), admin.getPassword());
		if (adminC != null) {
			Records record = recordsRepo.findById(idRecord);
			if (record != null) {
				recordsRepo.delete(record);
				return "Element with id "+ idRecord +" deleted!"; 
			} else
				return "Element with id " + idRecord + " not present";

		} else
			return "ACCESS DENIED!";
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


}
