package model;

public class Movie extends Film {
    public Movie(int id, String title, String[] category, String director, int releaseYear, int time) {
        super(id, title, category, director, releaseYear, time);
    }

    public Movie() {
    }
}
