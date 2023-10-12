package com.example.API.PRODUTOS;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name="Produto")
public class ProdutoModel {
	@Id
	private long id;
	private String nome;
	private double quantidade;
	private String fornecedor;
	private double valorDeCompra;

}
