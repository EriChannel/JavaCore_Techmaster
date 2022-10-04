package model;

public class Series extends Film{
    private int episode;

    public Series(int id, String title, String[] category, String director, int releaseYear, int time, int episode) {
        super(id, title, category, director, releaseYear, time);
        this.episode = episode;
    }

    public Series() {
    }

    public int getEpisode() {
        return episode;
    }

    public void setEpisode(int episode) {
        this.episode = episode;
    }
}
