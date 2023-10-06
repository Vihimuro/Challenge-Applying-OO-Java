package br.com.himuro.mymusics.Application;

import br.com.himuro.mymusics.Models.Favorites;
import br.com.himuro.mymusics.Models.Music;
import br.com.himuro.mymusics.Models.Podcast;

public class Application {
    public static void main(String[] args) {

        Music music = new Music();
        music.setTitle("Blinding Lights");
        music.setArtist("The Weeknd");
        music.setAlbum("After Hours");

        Podcast podcast = new Podcast();
        podcast.setTitle("Podpah");
        podcast.setHost("Igor");

        for (int i = 0; i < 1000; i++) {
            music.play();
            if (i < 500){
                podcast.play();
            }
        }

        for (int i = 0; i < 100; i++) {
            music.like();
            if (i < 50) {
                podcast.like();
            }
        }

        Favorites favorites = new Favorites();
        favorites.insert(music);
        favorites.insert(podcast);
    }
}
