package Java.Collections.Queue;

import java.util.Comparator;

public class Movies implements Comparator<Movies> {

    private String movieName;
    private int rating;

    public Movies() {
    }

    public Movies(String movieName, int rating) {
        this.movieName = movieName;
        this.rating = rating;
    }

    @Override
    public int compare(Movies o1, Movies o2) {
        return o2.rating - o1.rating;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "movieName='" + movieName + '\'' +
                ", rating=" + rating +
                '}';
    }
}
