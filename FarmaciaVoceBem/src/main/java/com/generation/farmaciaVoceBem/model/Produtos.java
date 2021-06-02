package com.generation.farmaciaVoceBem.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produtos")
public class Produtos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message = "Este campo não pode ser nulo")
	@Size(min = 5, max = 50, message = "Este campo pode ter, no mínimo, 5 e, no máximo, 50 caracteres")
	private String nome;
	
	@NotNull(message = "Este campo não pode ser nulo")
	private BigDecimal preco;
	
	@NotNull(message = "Este campo não pode ser nulo")
	@Size(min = 5, max = 50, message = "Este campo pode ter, no mínimo, 5 e, no máximo, 50 caracteres")
	private String marca;
	
	private String descricaoProduto;
	
	@NotNull(message = "Este campo não pode ser nulo")
	private boolean remedioControlado;
	
	//foreign key
	@ManyToOne
	@JsonIgnoreProperties("produtos")
	private Categoria categoria;
	
	//
	
	//Getters and Setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public boolean isRemedioControlado() {
		return remedioControlado;
	}

	public void setRemedioControlado(boolean remedioControlado) {
		this.remedioControlado = remedioControlado;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	//
	
	
}
