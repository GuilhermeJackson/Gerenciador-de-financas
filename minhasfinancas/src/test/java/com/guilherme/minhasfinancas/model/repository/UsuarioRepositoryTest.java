package com.guilherme.minhasfinancas.model.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import com.guilherme.minhasfinancas.model.entity.Usuario;

//Teste de integração - Quando precisa de recursos externo a aplicação

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class UsuarioRepositoryTest {
	
	@Autowired
	UsuarioRepositorio repository;
	
	@Test
	public void deveVerificarAExistenciaDeUmEmail() {
		String fackeNome = "Guilherme";
		String fackeEmail = "guilherme@gmail.com";
		Usuario usuario = Usuario.builder().nome(fackeNome).email(fackeEmail).build();
		repository.save(usuario);
		boolean isResult = repository.existsByEmail(fackeEmail);
		Assertions.assertThat(isResult).isTrue();
	}
}
