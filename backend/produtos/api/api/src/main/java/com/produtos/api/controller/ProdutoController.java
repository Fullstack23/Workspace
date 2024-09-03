package com.produtos.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PostExchange;



import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;
   
    @PostExchange
    @Transactional
	public void cadastrar(@RequestBody DadosCadastroProduto dados) {		
        repository.save(new Produto(dados));
    }


    @GetMapping
    public List<DadosListagemProduto> listar(){
        return repository.findAll().stream().map(DadosListagemProduto::new).toList();
    }

    @PutMapping
    public void atualizar() {
    }
    @DeleteMapping
    public void excluir() {
    }
}
