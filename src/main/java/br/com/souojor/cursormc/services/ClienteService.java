package br.com.souojor.cursormc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.souojor.cursormc.domain.Cliente;
import br.com.souojor.cursormc.repositories.ClienteRepository;
import br.com.souojor.cursormc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;

	public Cliente buscar(Integer id) {
		Cliente obj = repository.findById(id)
				.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id));
		return obj;
	}
}
