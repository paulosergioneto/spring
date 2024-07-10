package com.aulaSpring.aulaSpring.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aulaSpring.aulaSpring.entities.Livro;

	@Repository
	public interface LivroRepository extends JpaRepository<ALivro,Long> {
	
	}
