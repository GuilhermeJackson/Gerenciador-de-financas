package com.guilherme.minhasfinancas.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guilherme.minhasfinancas.model.entity.Usuario;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{
	
	Optional<Usuario> findByEmail (String email);
	
	boolean existsByEmail(String email);
}
