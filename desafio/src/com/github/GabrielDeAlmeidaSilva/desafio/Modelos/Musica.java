package com.github.GabrielDeAlmeidaSilva.desafio.Modelos;

public class Musica extends Audio{

public Musica(String titulo, String album, String cantor, String genero){
    this.titulo = titulo;
    this.album = album;
    this.cantor = cantor;
    this.genero = genero;

}

    protected String album;
    protected String cantor;
    protected String genero;


    @Override
    public int getClassificacao() {
        if (this.totalReproducoes >= 2000){
            this.classificacao = 10;
        } else {
            this.classificacao = 8;
        }
        return this.classificacao;
    }
}
