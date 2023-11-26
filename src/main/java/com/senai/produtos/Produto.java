package com.senai.produtos;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false, length = 100)
    private String nome;
    @Column(nullable = false, length = 255)
    private String descricao;
    @Column(nullable = false, length = 50)
    private String categoria;
    @Column(nullable = false, length = 30)
    private String condicao;
    @Column(nullable = false)
    private double valor;

    public Produto(String nome, String descricao, String categoria, String condicao, double valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.condicao = condicao;
        this.valor = valor;
    }

    public Produto() {
    }

    public int getId() {
        return id;
    }


    public String getNome() {return nome;}
    public String getDescricao() {
        return descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getCondicao() {return condicao;}

    public double getValor() {
        return valor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setCondicao(String condicao) {this.condicao = condicao;}

    public void setValor(double valor) {
        this.valor = valor;
    }


}
