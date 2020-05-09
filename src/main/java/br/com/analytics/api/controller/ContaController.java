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

import br.com.analytics.api.contant.Contants;
import br.com.analytics.api.model.Conta;
import br.com.analytics.api.service.ContaService;

@RestController
public class ContaController {

	@Autowired
	private ContaService contaService;

	@PostMapping(Contants.API_ENDPOINT_CONTA)
	public Conta save(@RequestBody Conta conta) {
		return contaService.save(conta);
	}
	
	@GetMapping(Contants.API_ENDPOINT_CONTA)
	public List<Conta> findAll() {
		return contaService.findAll();
	}

	@PutMapping(Contants.API_ENDPOINT_CONTA)
	public Conta update(@RequestBody Conta conta) {
		return this.save(conta);
	}

	@GetMapping(Contants.API_ENDPOINT_CONTA + "/{id}")
	public Optional<Conta> findById(@PathVariable("id") int id) {
		return contaService.findById(id);
	}

	@DeleteMapping(Contants.API_ENDPOINT_CONTA + "/{id}")
	public void delete(@PathVariable("id") int id) {
		contaService.delete(id);
	}
}
