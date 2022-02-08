package com.example.eurekatest.repositories;


import com.example.eurekatest.models.Usuario;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRespository extends CrudRepository<Usuario, Long> {
  
}