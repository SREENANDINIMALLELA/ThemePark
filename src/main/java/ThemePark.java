import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {
    ArrayList<Attraction> attractions;
    ArrayList<Stall> stalls;
    ArrayList<IReviewed> reviewed;
    public ThemePark(ArrayList<Attraction> attractions,ArrayList<Stall>stalls ){
        this.attractions=attractions;
        this.stalls=stalls;
    }
    public ArrayList<IReviewed> getAllReviewed(){
        reviewed = new ArrayList<>();
        reviewed.addAll(attractions);
        reviewed.addAll(stalls);
        return reviewed;
    }
    public void visit(Visitor visitor , Attraction attraction){
        attraction.incrementVisitCount();
        visitor.addAttraction(attraction);
    }

}
