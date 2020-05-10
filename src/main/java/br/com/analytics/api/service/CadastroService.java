package br.com.analytics.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.analytics.api.model.Cadastro;
import br.com.analytics.api.repository.CadastroRepository;

@Service
public class CadastroService {

	@Autowired
	private CadastroRepository cadastroRepository;
	
	public Cadastro save(Cadastro cadastro) {
		return cadastroRepository.save(cadastro);
	}
}
