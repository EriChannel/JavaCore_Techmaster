package service;

import model.Series;

import java.util.Arrays;

public class SeriesService {

    public Series[] getAllSeries(){
        Series[] series = new Series[5];
        series[0] = new Series(6, "Fun is Beautiful", new String[]{"Drama"},
                "Bobbie Record", 2019, 45, 16);
        series[1] = new Series(7, "Ironclads", new String[] {"Drama", "Romance","War"},
                "Weston McAuslene", 2008, 60, 45);
        series[2] = new Series(8, "Of Unknown Origin", new String[] {"Horror"},
                "\tGenovera Head", 2022, 45, 8);
        series[3] = new Series(9, "Life After Tomorrow", new String[] {"Drama", "Adventure", "Animation"},
                "Currie Poser", 2017, 25, 24);
        series[4] = new Series(10, "Boyz N the Hood", new String[] {"Action", "Crime", "Horror"},
                "Staford Dows", 2009, 45, 16);

        return series;
    }

    public void print(Series[] series){
        for(Series s : series){
            System.out.println(s.getId() + " - " + s.getTitle() + " - " + Arrays.toString(s.getCategory())+
                    " - " + s.getDirector() + " - " + s.getReleaseYear() + " - " + s.getTime() + " - " +
                    s.getEpisode());
        }
    }

    public void findSeriesByTitle(Series[] series, String title){
        int count = 0;
        for(Series s : series){
            if(s.getTitle().toLowerCase().contains(title.toLowerCase())){
                System.out.println(s.getId() + " - " + s.getTitle() + " - " + Arrays.toString(s.getCategory())+
                        " - " + s.getDirector() + " - " + s.getReleaseYear() + " - " + s.getTime() + " - " +
                        s.getEpisode());
                count++;
            }
        }

        if(count == 0){
            System.out.println("Không tìm thấy phim");
        }
    }
}
