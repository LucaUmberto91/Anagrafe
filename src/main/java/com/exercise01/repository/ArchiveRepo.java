package com.exercise01.repository;


import org.springframework.data.repository.CrudRepository;

import com.exercise01.model.Archive;

public interface ArchiveRepo extends CrudRepository<Archive, Integer>{

	public Archive findById(int id);
}
