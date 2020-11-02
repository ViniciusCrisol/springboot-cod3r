package com.example.exercios.models.entities;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;

    private Float preco;

    private Float desconto;

    public Produto(String nome, Float preco, Float desconto) {
        super();
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public void setDesconto(Float desconto) {
        this.desconto = desconto;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Float getPreco() {
        return preco;
    }

    public Float getDesconto() {
        return desconto;
    }
}
