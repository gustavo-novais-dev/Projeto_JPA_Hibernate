package br.com.fiap.lojaRoupa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "tbl_roupa")
public class Roupa {

	@Id
	@SequenceGenerator(name="roupa",sequenceName="sq_tbl_funcionario",allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="roupa")
	@Column(name = "id_roupa")
	private Integer id_roupa;

	@Column(name = "modelo_roupa", length = 50)
	private String modelo;
	
	@Column(name = "tamanho_roupa", length = 50)
	private Integer tamanho;
	
	@Column(name = "colecao_roupa", length = 50)
	private String colecao;

	public Integer getId_roupa() {
		return id_roupa;
	}

	public void setId_roupa(Integer id_roupa) {
		this.id_roupa = id_roupa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getTamanho() {
		return tamanho;
	}

	public void setTamanho(Integer tamanho) {
		this.tamanho = tamanho;
	}

	public String getColecao() {
		return colecao;
	}

	public void setColecao(String colecao) {
		this.colecao = colecao;
	}
	
	
}
