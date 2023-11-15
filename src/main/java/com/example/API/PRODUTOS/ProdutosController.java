package com.example.API.PRODUTOS;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/Produtos")
public class ProdutosController {

private ProdutoService _produtoService;
@Autowired
    public ProdutosController(ProdutoService produtoService){
    _produtoService = produtoService;
}
  @GetMapping("/buscarTodos")
   public List<ProdutoModel> BuscarTodos(){
    return _produtoService.BuscarTodos();
  }
  @PostMapping("/NovoProduto")
    public ProdutoModel NovoProduto(@RequestBody ProdutoModel novo){
     return _produtoService.NovoProduto(novo);
  }
  @GetMapping("/BuscarporNome")
    public ProdutoModel BuscarporNome(@RequestParam String nome){
     return _produtoService.BuscarporNome(nome);

  }
  @PostMapping("/Deletar")
    public String Deletar(@RequestParam String nome) {
      return _produtoService.Deletar(nome);
  }
  }

