package com.aulaSpring.aulaSpring.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Usuario {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer id;
	private String Nome;
	private String Senha;
	private String Email;

public Usuario( ) {}

public Usuario(Integer id, String nome, String senha, String email) {
		super();
		this.id = id;
		Nome = nome;
		Senha = senha;
		Email = email;
	}

public synchronized final Integer getId() {
	return id;
}

public synchronized final void setId(Integer id) {
	this.id = id;
}

public synchronized final String getNome() {
	return Nome;
}

public synchronized final void setNome(String nome) {
	Nome = nome;
}

public synchronized final String getSenha() {
	return Senha;
}

public synchronized final void setSenha(String senha) {
	Senha = senha;
}

public synchronized final String getEmail() {
	return Email;
}

public synchronized final void setEmail(String email) {
	Email = email;
}


}
