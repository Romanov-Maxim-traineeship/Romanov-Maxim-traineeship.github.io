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

//    -----??????????????????????????
    public static void addReview(String name, List<Review> review){
        for (Movie n : movieList){
            if (n.getName().contains(name)){
                movieList.add((Movie) n.getReview(review));
            }
        }

    }

    public static void searchMovie(String name){
        for (Movie n : movieList){
            if (n.getName().contains(name)){
                System.out.println(n + "\n");
            }
        }

    }

//    public static void addReview(String name, String review){
//        for (Movie n : movieList){
//            if (n.getName().contains(name)){
//                movieList.add();
//            }
//        }
//    }
}
