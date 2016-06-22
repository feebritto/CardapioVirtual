package com.example.fernando.projetofinal_v22.service;


import com.example.fernando.projetofinal_v22.domain.Pedido;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;

public interface PedidoService {
    @GET("pedido/list")
    Call<List<Pedido>> listarPedidos();

    @POST("pedido/new")
    Call<Pedido> novoPedido(@Body Pedido pedido);
}
