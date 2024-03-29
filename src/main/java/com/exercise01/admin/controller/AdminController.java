package com.exercise01.admin.controller;

import com.exercise01.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.exercise01.admin.model.Admin;
import com.exercise01.admin.repository.AdminRepo;
import com.exercise01.model.People;

@RestController

@RequestMapping(path = "/admin")
public class AdminController {

	@Autowired
	AdminRepo adminRepo;
	@Autowired
	PeopleService peopleService;

	@GetMapping("/nuovoView")
	public ModelAndView nuovoCliente() {
		return new ModelAndView("register", "datiCliente", new Admin());
	}

	@PostMapping(path = "/populateView")
	public @ResponseBody ModelAndView populateView(@ModelAttribute("datiCliente") Admin admin,
												   @ModelAttribute(value = "username") String username) {
		username = admin.getUsername();
		adminRepo.save(admin);

		return new ModelAndView("welcome", "datiCliente", admin);

	}

	@GetMapping(path = "/redirectForm")
	public @ResponseBody ModelAndView redirectForm() {

		return new ModelAndView("redirect:/people/newForm");

	}

	@GetMapping(path = "/redirectViewAnagrafe")
	public @ResponseBody ModelAndView redirectViewAnagrafe() {

		return new ModelAndView("redirect:/admin/viewAnagrafe");

	}

	@PostMapping(path = "/register")
	public @ResponseBody String register(@RequestParam(value = "nickname") String nickname,
										 @RequestParam(value = "username") String username, @RequestParam(value = "password") String password) {

		Admin admin = new Admin(username, password, nickname);
		adminRepo.save(admin);
		return "Hello! " + nickname + " , User registered successfully";
	}

	@GetMapping(path = "/login")
	public @ResponseBody String login(@RequestParam(value = "username") String username,
									  @RequestParam(value = "password") String password) {
		String msg;
		Admin admin = adminRepo.findByUsernameAndPassword(username, password);
		if (admin != null)
			msg = "Welcome " + admin.getNickname() + " !";
		else
			msg = "User or Password not correct!";

		return msg;
	}

	@GetMapping(path = "/index")
	public @ResponseBody ModelAndView loginView() {
		return new ModelAndView("login", "datiCliente", new Admin());
	}

	@PostMapping(path = "/verifyCredential")
	public @ResponseBody Object verifyCredential(@ModelAttribute("datiCliente") Admin admin,
												 @ModelAttribute(value = "username") String username) {
		username = admin.getUsername();
		Admin verify = adminRepo.findByUsernameAndPassword(username, admin.getPassword());
		if (verify != null) {
			if ((username.equals("admin")) && admin.getPassword().equals(("admin"))) {
				System.out.println("Welcome ADMIN!");
				return new ModelAndView("welcomeAdmin", "people", admin);
			}
			return new ModelAndView("welcome", "datiCliente", admin);

		} else {
			System.out.println("User not found, register now!");
			return new ModelAndView("redirect:/admin/nuovoView");
		}


	}

	@GetMapping("/viewAnagrafe")
	public @ResponseBody ModelAndView viewAnagrafe() {
		return new ModelAndView("view-people", "people", peopleService.getPeopleImpl());
	}

	@PostMapping("/search")
	public @ResponseBody Object search(@ModelAttribute("search") People people, @ModelAttribute(value = "surname") String surname) {
		if (!peopleService.getPeopleImpl(surname).toString().equals("[]")){
			return new ModelAndView("view-people", "people", peopleService.getPeopleImpl(surname));
	}
		else return "Sono spiacente, La persona cercata non esiste";
}
}