package br.com.banco.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.banco.model.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
	Optional<Pessoa> findByNome (String nome);
	Pessoa findByCpf(String cpf);
}
