package com.exercise01.admin.repository;


import org.springframework.data.repository.CrudRepository;

import com.exercise01.admin.model.Admin;

public interface AdminRepo extends CrudRepository<Admin, Integer>{

	public Admin findByUsernameAndPassword(String user,String pass);
}
