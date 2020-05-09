package br.com.analytics.api.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.analytics.api.model.Banco;
import br.com.analytics.api.repository.BancoRepository;

@Service
public class BancoService {

	@Autowired
	private BancoRepository bancoRepository;

	public Banco save(Banco banco) {
		return bancoRepository.save(banco);
	}

	public List<Banco> findAll() {
		return bancoRepository.findAll();
	}

	public Optional<Banco> findById(int id) {
		return bancoRepository.findById(id);
	}

	public void delete(int id) {
		bancoRepository.deleteById(id);
	}
}
