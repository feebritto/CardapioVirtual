package com.example.fernando.projetofinal_v22.domain;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Fernando on 14/06/2016.
 */
public class Pedido {
    @SerializedName("n_pedido")
    private long idPedido;

    @SerializedName("n_mesa")
    private int numMesa;

    @SerializedName("tamanho")
    private String tamanho;

    @SerializedName("fruta")
    private String fruta;

    @SerializedName("acomp")
    private String acompanhamento;

    @SerializedName("cobertura")
    private String cobertura;

    public long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(long idPedido) {
        this.idPedido = idPedido;
    }

    public int getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(int numMesa) {
        this.numMesa = numMesa;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getFruta() {
        return fruta;
    }

    public void setFruta(String fruta) {
        this.fruta = fruta;
    }

    public String getAcompanhamento() {
        return acompanhamento;
    }

    public void setAcompanhamento(String acompanhamento) {
        this.acompanhamento = acompanhamento;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }
}
