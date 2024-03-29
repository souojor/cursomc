package br.com.souojor.cursormc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.souojor.cursormc.domain.Categoria;
import br.com.souojor.cursormc.repositories.CategoriaRepository;
import br.com.souojor.cursormc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repository;

	public Categoria find(Integer id) {
		Categoria obj = repository.findById(id)
				.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id));
		return obj;
	}

	public Categoria insert(Categoria obj) {
		obj.setId(null);
		return repository.save(obj);
	}

	public Categoria update(Categoria obj) {
		find(obj.getId());
		return repository.save(obj);
	}
}
