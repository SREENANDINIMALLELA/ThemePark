import attractions.Attraction;
import behaviours.IReviewed;
import behaviours.ISecurity;
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
        getAllReviewed();
        reviews = new HashMap<>();
        for (IReviewed review :reviewed) {
            reviews.put(review.getName(),review.getRating());
        }
        return reviews;
    }
    public ArrayList<IReviewed> getAllAllowedFor(Visitor visitor){
        ArrayList<IReviewed>visitorAllowedList = new ArrayList<>();

        for (IReviewed review :reviewed){
            if(review instanceof ISecurity ){
                if(((ISecurity) review).isAllowedTo(visitor)){
                    visitorAllowedList .add(review);
                }
            }else{
                visitorAllowedList.add(review);
            }
        }
        return visitorAllowedList;
    }

}

