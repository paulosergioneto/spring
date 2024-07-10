package com.aulaSpring.aulaSpring.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping(value ="/autores")
public class AutorController {
	
	@Autowired
	private AutorService service;
	
	@GetMapping
	public ResponseEntity<List<Autor>> getAll(){
		List<Autor> lista = service.getAll();
			return ResponseEntity.status(HttpStatus.OK).body(lista);
	}
	@PostMapping
	public ResponseEntity<String> saveAutor (@RequestBody Autor autor){
		service.saveAutor(autor);
			return ResponseEntity.status(HttpStatus.CREATED).body("autor cadastrado");
	}
}
