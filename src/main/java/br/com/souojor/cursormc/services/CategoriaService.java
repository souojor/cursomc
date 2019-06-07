package br.com.souojor.cursormc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.souojor.cursormc.domain.Categoria;
import br.com.souojor.cursormc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repository;

	public Categoria buscar(Integer id) {
		Categoria obj = repository.findById(id).orElse(null);
		return obj;
	}
}
