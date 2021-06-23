package com.ifpb.model;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private String email;
    private List<Produto> produtos;

    public Carrinho(String email) {
        this.email = email;
        produtos = new ArrayList<>();
    }

    public boolean adicionar(Produto produto){
        return produtos.add(produto);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Carrinho{" +
                "email='" + email + '\'' +
                ", produtos=" + produtos +
                '}';
    }
}