package br.com.analytics.api.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.analytics.api.model.Conta;
import br.com.analytics.api.repository.ContaRepository;

@Service
public class ContaService  {
	
	@Autowired
	private ContaRepository contaRepository;
	
	public Conta save(Conta conta) {
		return contaRepository.save(conta);
	}
	
	public List<Conta> findAll(){
		return contaRepository.findAll();
	}

	public Optional<Conta> findById(int id) {
		return contaRepository.findById(id);
	}
	
	public void delete(int id) {
		contaRepository.deleteById(id);
	}
}
