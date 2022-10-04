package model;

public class Film {
    private int id;
    private String title;
    private String[] category;
    private String director;
    private int releaseYear;
    private int time;

    public Film(int id, String title, String[] category, String director, int releaseYear, int time) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.director = director;
        this.releaseYear = releaseYear;
        this.time = time;
    }

    public Film() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getCategory() {
        return category;
    }

    public void setCategory(String[] category) {
        this.category = category;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
