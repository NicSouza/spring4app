package com.nicole.primeiroProjeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nicole.primeiroProjeto.entity.Anotacao;

public interface AnotacaoRepository extends JpaRepository<Anotacao, Long>{
    
}