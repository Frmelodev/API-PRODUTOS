package com.example.API.PRODUTOS;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/Produtos")
public class ProdutosController {
  @Autowired
	 private IProdutosRepository produtos;

	 @GetMapping("/")
	 public List<ProdutoModel> getProduto() {
		 return produtos.findAll();
	 }

   @GetMapping("/{id}")
   public ResponseEntity<ProdutoModel> BuscaPorId(@PathVariable Long id){
     var produto = produtos.findById(id);

     if (produto.isPresent()){
       return ResponseEntity.ok(produto.get());
     }
     return ResponseEntity.notFound().build();
   }
	 @PostMapping("/Criar")
	 public ProdutoModel Criar(@RequestBody ProdutoModel produto) {
		 System.out.println(produto.getNome());
		 produtos.save(produto);
		 return produto;

	 }




}
