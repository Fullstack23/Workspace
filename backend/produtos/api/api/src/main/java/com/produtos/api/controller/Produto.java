package com.produtos.api.controller;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
// import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table( name = "Produto")
@Entity(name = "produto")
@Getter
@NoArgsConstructor
@AllArgsConstructor
// @EqualsAndHashCode(of = "id")

public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nome;
    private String descricao;
    private String imagem;
    private double preco;
    private double tamanho;
    private String cor;
    private String fabricante;

    public Produto(DadosCadastroProduto dados) {
        this.nome = dados.nome();
        this.descricao = dados.descricao();
        this.imagem = dados.imagem();
        this.preco = dados.preco();
        this.tamanho = dados.tamanho();   
        this.cor = dados.cor();
        this.fabricante = dados.fabricante();
    }
}
