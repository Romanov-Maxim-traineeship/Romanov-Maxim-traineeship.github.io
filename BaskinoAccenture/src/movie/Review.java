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

    public static void addReview(String name, String review){
        reviewsList.add(new Review(name, review));
    }


}
