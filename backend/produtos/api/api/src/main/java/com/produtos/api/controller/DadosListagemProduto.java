package com.produtos.api.controller;

public record DadosListagemProduto(String nome, String descricao, String imagem, double preco, double tamanho, String cor, String fabricante) {

    public DadosListagemProduto(Produto produto) {
        this( produto.getNome(), produto.getDescricao(), produto.getImagem(), produto.getPreco(), produto.getTamanho(), produto.getCor(), produto.getFabricante());
    }
}
