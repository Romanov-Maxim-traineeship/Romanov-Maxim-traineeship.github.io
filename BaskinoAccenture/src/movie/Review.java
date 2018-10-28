package movie;
import java.util.ArrayList;
import java.util.List;

public class Review extends Movie{
    private static List<Review> reviewsList= new ArrayList<>();
    private String review;

    Review(String name, String review) {
        super(name);
        this.review = review;
    }

    public static void addReview(String filmName, String review){
        reviewsList.add(new Review(filmName, review));
    }

    @Override
    public String toString() {
        return  "Отзыв: " + this.review;
    }

    public static void searchReview(String filmName){
        for (Movie n : reviewsList){
            if (n.getName().contains(filmName)){
                System.out.println(n + "\n");
            }
        }

    }
}
