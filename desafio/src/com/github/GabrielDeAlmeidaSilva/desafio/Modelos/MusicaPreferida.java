package com.github.GabrielDeAlmeidaSilva.desafio.Modelos;

public class MusicaPreferida extends Audio{

    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " é considetado um sucesso absoluto e um dos " +
                    "titulos preferidos da galera!");
        } else {
            System.out.println(audio.getTitulo() + " é um dos titulos que todo mundo está curtindo. " +
                    "Não deixe de ouvir também!");
        }
    }

}
