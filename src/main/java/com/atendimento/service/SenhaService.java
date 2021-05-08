package com.atendimento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atendimento.domain.Senha;
import com.atendimento.repositories.SenhaRepository;

@Service
public class SenhaService {
	
	@Autowired
	private SenhaRepository repo;
	
	
	public Senha geraSenha(Senha obj) {
		
		if( repo.count() >= 1) {
			long numero =  repo.count() + 1; 
			obj.setSenhaAtiva(obj.getTipoAtendimento() + numero);
		} else {
			obj.setSenhaAtiva(obj.getTipoAtendimento() + 1);
		}
			
		repo.save(obj);
				
		return obj;
	}

	public List<Senha> findAll() {
		return repo.findAll();
	}
	
	
}