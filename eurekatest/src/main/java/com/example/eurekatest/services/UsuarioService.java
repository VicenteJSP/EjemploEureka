package com.example.eurekatest.services;
import java.util.ArrayList;

import com.example.eurekatest.models.Usuario;
import com.example.eurekatest.repositories.UsuarioRespository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRespository usuarioRespository;

    public ArrayList<Usuario> getUsuarios() {
        return (ArrayList<Usuario>) usuarioRespository.findAll();
    }

    public Usuario saveUsuario(Usuario usuario) {
        return usuarioRespository.save(usuario);
    }
    
}
