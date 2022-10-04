package service;

import model.Movie;

import java.util.Arrays;

public class MovieService {
    public Movie[] getAllMovies(){
        Movie[] movies = new Movie[5];
        movies[0] = new Movie(1, "Loneliness of the Long Distance Runner, The", new String[]{"Drama", "Comedy"},
                "Currie Poser", 2001, 121);
        movies[1] = new Movie(2, "Behind Blue Skies", new String[]{"Adventure", "Comedy"},
                "Ambrose Faircloth", 1996, 94);
        movies[2] = new Movie(3, "Four Feathers, The", new String[]{"Adventure", "War"},
                "Wenona Easseby", 2011, 90);
        movies[3] = new Movie(4, "Lucifer Rising", new String[]{"Fantasy", "Sci-Fi"},
                "Gabrielle Want", 2013, 135);
        movies[4] = new Movie(5, "Sleepless in Seattle", new String[]{"Drama", "Comedy", "Romance"},
                "Currie Poser", 2004, 87);
        return movies;
    }

    public void print(Movie[] movies){
        for(Movie m : movies){
            System.out.println(m.getId() + " - " + m.getTitle() + " - " + Arrays.toString(m.getCategory())+
                    " - " + m.getDirector() + " - " + m.getReleaseYear() + " - " + m.getTime());
        }
    }

    public void findMovieByTitle(Movie[] movies, String title){
        int count = 0;
        for(Movie m : movies){
            if(m.getTitle().toLowerCase().contains(title.toLowerCase())){
                System.out.println(m.getId() + " - " + m.getTitle() + " - " + Arrays.toString(m.getCategory())+
                        " - " + m.getDirector() + " - " + m.getReleaseYear() + " - " + m.getTime());
                count++;
            }
        }
        if(count == 0){
            System.out.println("Không tìm thấy phim");
        }
    }
}
