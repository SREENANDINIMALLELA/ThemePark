package stalls;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        boolean checkAgeCriteria =false ;
        if(visitor.getAge()>=18){
            checkAgeCriteria =true;
        }
        return checkAgeCriteria ;
    }



}
