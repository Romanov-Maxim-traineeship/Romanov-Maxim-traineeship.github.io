package movie;
import java.util.List;

public class Movie {
    private String name;
    private String yearOfRelease;
    private String genre;
    private List<Review>review;
    Movie(String name, String yearOfRelease, String genre){
        this.name = name;
        this.yearOfRelease = yearOfRelease;
        this.genre = genre;
    }

    public void setReview(List<Review> review) {
        this.review = review;
    }

    public List<Review> getReview(List<Review> review) {
        return this.review = review;
    }




    Movie(){}

    public String getName() {
        return name;
    }

    public String getYearOfRelease() {
        return yearOfRelease;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Название: " + this.name + "\n" + "Год выпуска: " + this.yearOfRelease + "\n" + "Жанр: " + this.genre;
    }
}
