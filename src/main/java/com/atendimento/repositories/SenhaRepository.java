package com.atendimento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atendimento.domain.Senha;

@Repository
public interface SenhaRepository extends JpaRepository<Senha, Integer> {
}
