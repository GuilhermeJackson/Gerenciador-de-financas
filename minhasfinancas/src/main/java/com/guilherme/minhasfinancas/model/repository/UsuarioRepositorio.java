package com.guilherme.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.minhasfinancas.model.entity.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{

}
