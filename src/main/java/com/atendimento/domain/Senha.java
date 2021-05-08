package com.atendimento.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="senha")
public class Senha implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="tipoAtendimento")
	private String tipoAtendimento;
	
	@Column(name="senha")
	private String senhaAtiva;
	
	public Senha() {
	}

	public Senha(Integer id, String tipoAtendimento, String senhaAtiva) {
		super();
		this.id = id;
		this.tipoAtendimento = tipoAtendimento;
		this.senhaAtiva = senhaAtiva;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipoAtendimento() {
		return tipoAtendimento;
	}

	public void setTipoAtendimento(String tipoAtendimento) {
		this.tipoAtendimento = tipoAtendimento;
	}

	public String getSenhaAtiva() {
		return senhaAtiva;
	}

	public void setSenhaAtiva(String senha) {
		this.senhaAtiva = senha;
	}
}
