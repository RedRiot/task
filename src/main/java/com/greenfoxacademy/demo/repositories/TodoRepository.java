package com.greenfoxacademy.demo.repositories;

import com.greenfoxacademy.demo.models.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<ToDo, Integer> {


}

