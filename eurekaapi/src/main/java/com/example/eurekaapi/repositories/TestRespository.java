package com.example.eurekaapi.repositories;

import com.example.eurekaapi.models.Test;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRespository extends CrudRepository<Test, Long> {
  
}