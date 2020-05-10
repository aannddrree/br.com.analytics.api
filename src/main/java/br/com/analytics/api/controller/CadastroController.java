package br.com.analytics.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.analytics.api.contant.Constants;
import br.com.analytics.api.model.Cadastro;
import br.com.analytics.api.service.CadastroService;

@RestController
public class CadastroController {

	@Autowired
	private CadastroService cadastroService;
	
	@PostMapping(Constants.API_ENDPOINT_CADASTRO)
	public Cadastro save(@RequestBody Cadastro cadastro) {
		return cadastroService.save(cadastro);
	}
}
