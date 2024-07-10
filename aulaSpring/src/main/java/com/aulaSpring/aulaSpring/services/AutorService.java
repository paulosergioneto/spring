package com.aulaSpring.aulaSpring.services;

@Entity
public class AutorService {
	@Id
	@GenerateValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nome;
	
	@JsonManagedReference
	@OneToMany (mappedBy="autor")
	private Set<Livros> livros;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Livros> getLivros() {
		return livros;
	}

	public void setLivros(Set<Livros> livros) {
		this.livros = livros;
	}
	
}