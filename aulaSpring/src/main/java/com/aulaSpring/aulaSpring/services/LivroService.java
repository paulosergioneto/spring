package com.aulaSpring.aulaSpring.services;
import java.util.List;

@Service
	@Transactional
@Entity
public class LivroService {
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private Long id;
	private String titulo;
	
	@ManyToOne
	@JoinColumn(name="autor_id", nullable=false)
	@JsonBackReference
	private Autor autor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	

}
