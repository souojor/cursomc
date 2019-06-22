package br.com.souojor.cursormc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.souojor.cursormc.domain.Pedido;
import br.com.souojor.cursormc.repositories.PedidoRepository;
import br.com.souojor.cursormc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repository;

	public Pedido find(Integer id) {
		Pedido obj = repository.findById(id)
				.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id));
		return obj;
	}
}
