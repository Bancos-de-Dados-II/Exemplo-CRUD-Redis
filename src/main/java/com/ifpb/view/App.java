package com.ifpb.view;

import com.ifpb.dao.CarrinhoDao;
import com.ifpb.model.Carrinho;
import com.ifpb.model.Cliente;
import com.ifpb.model.Produto;

public class App {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("paulo.freitas.nt@gmail.com", "Paulo");

        Carrinho carrinho = new Carrinho(cliente.getEmail());

        carrinho.adicionar(new Produto(1, "Arroz", 5));
        carrinho.adicionar(new Produto(2, "Feijão", 7));
        carrinho.adicionar(new Produto(3, "Macarrão", 3));

        CarrinhoDao carrinhoDao = new CarrinhoDao();

        carrinhoDao.adicionarCarrinho(carrinho);

//        System.out.println(carrinhoDao.buscarCarrinho(cliente.getEmail()));


    }

}
