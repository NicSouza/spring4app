package com.nicole.primeiroProjeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nicole.primeiroProjeto.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}
