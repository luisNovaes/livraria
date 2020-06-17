package com.magsoltec.pesquisa.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@DiscriminatorValue("2")
public class Cliente extends Usuario implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Column(name = "data_cadastro")
	@Temporal(TemporalType.DATE)
	private Date dataCadastro;
	
	@Column(length = 50)
	private String profissao;
	
	@OneToMany(cascade = CascadeType.REMOVE, mappedBy = "cliente")
	private List<Venda> vendas;
	
	public Cliente() {
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}
	
	public String getProfissao() {
		return profissao;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}