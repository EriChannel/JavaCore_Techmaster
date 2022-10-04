import model.Movie;
import model.Series;
import service.MovieService;
import service.SeriesService;

public class Main {
    public static void main(String[] args) {
        MovieService movieService = new MovieService();
        Movie[] movies = movieService.getAllMovies();
        System.out.println("Danh sách các bộ phim lẻ: ");
        movieService.print(movies);

        System.out.println("Tìm phim theo tên: ");
        movieService.findMovieByTitle(movies, "American");

        System.out.println("--------------------------------");

        SeriesService seriesService = new SeriesService();
        System.out.println("Danh sách phim bộ: ");
        Series[] series = seriesService.getAllSeries();
        seriesService.print(series);
        System.out.println("Tìm phim theo tên: ");
        seriesService.findSeriesByTitle(series, "Beautiful");
    }
}