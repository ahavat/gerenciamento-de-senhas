package com.atendimento.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.atendimento.domain.Senha;
import com.atendimento.service.SenhaService;

@RestController
@RequestMapping(value="/senha")
public class SenhaResource {
		
		@Autowired
		private SenhaService service;
		
		
		@RequestMapping(method = RequestMethod.POST) 
		public ResponseEntity<Senha> insert(@Valid @RequestBody Senha obj){
		service.geraSenha(obj);
		return ResponseEntity.status(201).body(obj);
		}
		
		@RequestMapping(method = RequestMethod.GET)
		public ResponseEntity<List<Senha>> findAll() {
			List<Senha> list = service.findAll();
			return ResponseEntity.ok().body(list);
		}
		
		@RequestMapping(value="/painel", method = RequestMethod.GET)
		public ResponseEntity<List<Senha>> listaSenha() {
			List<Senha> senhas = service.listaSenha();
			return ResponseEntity.ok().body(senhas);
		}
			
	}
		
	



