package com.example.cardapio.modelos;

public class Produto {

    // Objeto / Atributo
    private String nome;
    private Double preco;
    private String categoria;
    private String descricao;

    public Produto() {

    }

    public Produto(String nome, Double preco)
    {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String nome, Double preco, String categoria, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


}
