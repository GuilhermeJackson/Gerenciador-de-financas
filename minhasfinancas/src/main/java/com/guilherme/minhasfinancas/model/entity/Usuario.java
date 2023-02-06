package com.guilherme.minhasfinancas.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table( name = "usuario", schema = "financas")
@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor //Gera construtor vazio
@AllArgsConstructor // Gera construtor com todas as propriedades
@Builder
//@Data 
public class Usuario {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name ="email")
	private String email;
	
	@Column(name = "senha")
	private String senha;	
}