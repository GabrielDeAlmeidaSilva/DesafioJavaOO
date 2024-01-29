package com.github.GabrielDeAlmeidaSilva.desafio.Teste;
import com.github.GabrielDeAlmeidaSilva.desafio.Modelos.*;

public class Main {

    public static void main(String[] args) {

        Musica musica = new Musica(" Snow (Hey Oh)","Stadium Arcadium", "Red Hot Chili Peppers",
                "Rock alternativo");

        Podcast podcast = new Podcast("Podlá","marcos","Um podcast bem paia");


        for (int i = 0; i < 250000; i++) {
            musica.reproduz();
        }
        for (int i = 0; i < 100000; i++) {
            musica.curte();
        }
        for (int i = 0; i < 100; i++) {
            podcast.reproduz();
        }
        for (int i = 0; i < 50; i++) {
            podcast.reproduz();
        }

        MusicaPreferida musicaPreferida = new MusicaPreferida();

        musicaPreferida.inclui(musica);
        musicaPreferida.inclui(podcast);
    }
}
