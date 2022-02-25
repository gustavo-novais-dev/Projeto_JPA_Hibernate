package br.com.fiap.lojaRoupa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Calendar;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "tbl_funcionario")
public class Funcionario {

	@Id
	@SequenceGenerator(name="funcionario",sequenceName="sq_tbl_funcionario",allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="funcionario")
	@Column(name = "id_funcionario")
	private Integer id;

	@Column(name = "nome_funcionario", length = 50)
	private String nome;
	
	@Column(name = "endereco_funcionario", length = 50)
	private String endereco;
	
	@Column(name = "depart_fincionario", length = 50)
	private String departamento;	
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "admissao_funcionario")
	private Calendar dt_admissao;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Calendar getDt_admissao() {
		return dt_admissao;
	}

	public void setDt_admissao(Calendar dt_admissao) {
		this.dt_admissao = dt_admissao;
	}
	
	
}


