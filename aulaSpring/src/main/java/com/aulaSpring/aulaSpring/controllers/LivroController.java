package com.aulaSpring.aulaSpring.controllers;
import java.util.List;

@RestController
@RequestMapping(value ="/livros")
public class LivroController {
	
	@Autowired
	private LivroService service;
	
	@GetMapping
	public ResponseEntity<List<Livro>> getAll(){
		List<Autor> lista = service.getAllLivros();
			return ResponseEntity.status(HttpStatus.OK).body(lista);
	}
	@PostMapping
	public ResponseEntity<String> saveLivro (@RequestBody Livro livro){
		service.saveLivro(livro);
			return ResponseEntity.status(HttpStatus.CREATED).body("Livro cadastrado");
	}
}
