package br.com.analytics.api.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.analytics.api.contant.Constants;
import br.com.analytics.api.model.Banco;
import br.com.analytics.api.service.BancoService;

@RestController
public class BancoController {

	@Autowired
	private BancoService bancoService;

	@PostMapping(Constants.API_ENDPOINT_BANCO)
	public Banco save(@RequestBody Banco conta) {
		return bancoService.save(conta);
	}
	
	@GetMapping(Constants.API_ENDPOINT_BANCO)
	public List<Banco> findAll() {
		return bancoService.findAll();
	}

	@PutMapping(Constants.API_ENDPOINT_BANCO)
	public Banco update(@RequestBody Banco conta) {
		return this.save(conta);
	}

	@GetMapping(Constants.API_ENDPOINT_BANCO + "/{id}")
	public Optional<Banco> findById(@PathVariable("id") int id) {
		return bancoService.findById(id);
	}

	@DeleteMapping(Constants.API_ENDPOINT_BANCO + "/{id}")
	public void delete(@PathVariable("id") int id) {
		bancoService.delete(id);
	}
}
