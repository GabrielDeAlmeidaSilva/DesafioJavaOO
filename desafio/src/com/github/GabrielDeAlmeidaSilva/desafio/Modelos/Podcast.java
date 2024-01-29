package com.github.GabrielDeAlmeidaSilva.desafio.Modelos;

public class Podcast extends Audio{

    public Podcast(String titulo,String apresentador, String descricao){
        this.titulo = titulo;
        this.apresentador = apresentador;
        this.descricao = descricao;
    }
    protected String apresentador;
    protected String descricao;

    @Override
    public int getClassificacao() {
        if (this.totalCurtidas >= 500){
            this.classificacao = 10;
        }else {
            this.classificacao = 8;
        }
        return this.classificacao;
    }
}
