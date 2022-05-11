package br.com.banco.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.banco.model.Conta;
import br.com.banco.model.Transacao;

@Repository
@Transactional(readOnly = false)
public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
	List<Transacao> findByContaIn(Conta conta);
			
	
}
