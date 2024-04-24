package com.nicole.primeiroProjeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nicole.primeiroProjeto.entity.Autorizacao;

public interface AutorizacaoRepository extends JpaRepository<Autorizacao, Long>{
    
}