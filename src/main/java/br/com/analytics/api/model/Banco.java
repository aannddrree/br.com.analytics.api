package br.com.analytics.api.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Banco {
	
	@Id
	private int idBanco;
	private String nome;
	private List<Conta> lstContas;
	
	public int getIdBanco() {
		return idBanco;
	}
	public void setIdBanco(int idBanco) {
		this.idBanco = idBanco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Conta> getLstContas() {
		return lstContas;
	}
	public void setLstContas(List<Conta> lstContas) {
		this.lstContas = lstContas;
	}
}
