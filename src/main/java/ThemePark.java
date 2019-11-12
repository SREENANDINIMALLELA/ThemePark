import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;
import stalls.Stall;
import java.util.ArrayList;
import java.util.HashMap;

public class ThemePark {
    ArrayList<Attraction> attractions;
    ArrayList<Stall> stalls;
    ArrayList<IReviewed> reviewed;
    HashMap<String ,Integer> reviews;

    public ThemePark(ArrayList<Attraction> attractions,ArrayList<Stall>stalls ){
        this.attractions=attractions;
        this.stalls=stalls;
        this.reviewed = new ArrayList<>();
        getAllReviewed();

    }
    public ArrayList<IReviewed> getAllReviewed(){

        reviewed.addAll(attractions);
        reviewed.addAll(stalls);
        return reviewed;
    }
    public void visit(Visitor visitor , Attraction attraction){
        attraction.incrementVisitCount();
        visitor.addAttraction(attraction);

    }
    public HashMap<String ,Integer> getallReviews(){
        reviews = new HashMap<>();
        for (IReviewed review :reviewed) {
            reviews.put(review.getName(),review.getRating());
        }
        return reviews;
    }
    public ArrayList<IReviewed> getAllAllowedFor(Visitor visitor){
       for(Attraction allowed :attractions){
           allowed.
       }

    }

}
