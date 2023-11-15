package com.example.API.PRODUTOS;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProdutoService {
    private final IProdutosRepository _produtosRepository;

    @Autowired
    public ProdutoService(IProdutosRepository produtosRepository) {
        _produtosRepository = produtosRepository;
    }

    public List<ProdutoModel> BuscarTodos() {
        return _produtosRepository.findAll();
    }

    public ProdutoModel NovoProduto(ProdutoModel novo) {
        return _produtosRepository.save(novo);
    }

    public ProdutoModel BuscarporNome(String nome) {
        return _produtosRepository.findByNome(nome);
    }


    public String Deletar(String nome){
    ProdutoModel produtoBanco = BuscarporNome(nome);
        if(produtoBanco !=null){
            _produtosRepository.delete(produtoBanco);
            return "deletado com sucesso";
        }else{
            return "produto não encontrado";
        }

    }
}
