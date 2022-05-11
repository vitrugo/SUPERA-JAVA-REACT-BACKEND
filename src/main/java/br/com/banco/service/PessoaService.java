package br.com.banco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.banco.model.Pessoa;
import br.com.banco.repository.PessoaRepository;

@Service
public class PessoaService {
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public Pessoa salvar(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}
	
	public List<Pessoa> listar() {
		return pessoaRepository.findAll();
	}
}
