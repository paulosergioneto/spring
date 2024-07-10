package com.aulaSpring.aulaSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aulaSpring.aulaSpring.entities.Autor;
	
	@Repository
	public interface AutorRepository extends JpaRepository<Autor,Long> {
		
	}
