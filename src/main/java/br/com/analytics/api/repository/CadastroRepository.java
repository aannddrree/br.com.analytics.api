package br.com.analytics.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.analytics.api.model.Cadastro;

@Repository
public interface CadastroRepository extends MongoRepository<Cadastro, String>{

}
