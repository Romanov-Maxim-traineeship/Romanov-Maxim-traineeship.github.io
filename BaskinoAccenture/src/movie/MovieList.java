package movie;
import java.util.ArrayList;
import java.util.List;

public class MovieList {
    private static List<Movie> movieList= new ArrayList<>();

    public static Movie getMovie(String name){
        for (Movie n : movieList){
            if (n.getName().equals(name)){
                return n;
            }
        }
        return null;
    }

    public static void addMovie(String name, String yearOfRelease, String genre){
        if (getMovie(name) == null){
            movieList.add(new Movie(name, yearOfRelease, genre));
        }else {
            System.out.println("Такой фильм уже существует!");
        }
    }
}
