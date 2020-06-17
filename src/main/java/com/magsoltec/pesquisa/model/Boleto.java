package com.magsoltec.pesquisa.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.magsoltec.pesquisa.enumeration.StatusPagamento;

@Entity
public class Boleto implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Integer id;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(nullable = false)
	private Venda venda;

	@Column(name = "data_pagamento")
	@Temporal(TemporalType.DATE)
	private Date dataPagamento;

	@Column(name = "status_pagamento")
	@Enumerated(EnumType.ORDINAL)
	private StatusPagamento statusPagamento;

	public Boleto() {
		dataPagamento = null;
	}

	public Integer getId() {
		return id;
	}

	public Venda getVenda() {
		return venda;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public StatusPagamento getStatusPagamento() {
		return statusPagamento;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public void setStatusPagamento(StatusPagamento statusPagamento) {
		this.statusPagamento = statusPagamento;
	}

}