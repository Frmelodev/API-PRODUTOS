package com.example.API.PRODUTOS;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/Produtos")
public class ProdutosController {
	 private final IProdutosRepository produtos;
	 
	 @Autowired
	 public ProdutosController(IProdutosRepository prod) {
		 produtos=prod;
	 }
	 
	 @GetMapping("")
	 public List<ProdutoModel> getProduto() {
		 return produtos.findAll();
	 }

	 @PostMapping("/Criar")
	 public ProdutoModel Criar(@RequestBody ProdutoModel produto) {
		System.out.println(produto);
		 produtos.save(produto);
		 return produto;
		 
	 }



}
