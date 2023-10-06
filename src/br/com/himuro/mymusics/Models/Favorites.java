package br.com.himuro.mymusics.Models;

public class Favorites {
    public void insert(Audio audio){
        if (audio.getClassification() >= 9) {
            System.out.println(audio.getTitle() + " is G.O.A.T.");
        }
        else {
            System.out.println("Everyone is liking " + audio.getTitle());
        }
    }
}
