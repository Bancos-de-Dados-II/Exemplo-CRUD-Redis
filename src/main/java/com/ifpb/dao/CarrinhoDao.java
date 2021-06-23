package com.ifpb.dao;

import com.google.gson.Gson;
import com.ifpb.model.Carrinho;
import redis.clients.jedis.Jedis;

public class CarrinhoDao {

    private Jedis jedis;
    private Gson gson;

    public CarrinhoDao() {
        jedis = new Jedis();
        gson = new Gson();
    }

    public boolean adicionarCarrinho(Carrinho carrinho){

        if(jedis.setex(carrinho.getEmail(), 3600l, gson.toJson(carrinho))
                .equals("OK")) return true;
        return false;
    }

    public Carrinho buscarCarrinho(String email){
        String json = jedis.get(email);

        if(json == null){
            return null;
        }else{
            return gson.fromJson(json, Carrinho.class);
        }
    }

}