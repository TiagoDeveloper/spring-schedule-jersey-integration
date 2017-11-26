package br.com.schedule.models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private Integer cidade;
	private Date data;
	
	public Funcionario(Long id, String nome, Integer cidade, Date data) {
		this.id = id;
		this.nome = nome;
		this.cidade = cidade;
		this.data = data;
	}
	
	public Funcionario() {
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getCidade() {
		return cidade;
	}
	public void setCidade(Integer cidade) {
		this.cidade = cidade;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", cidade=" + cidade + ", data=" + data + "]";
	}
}
