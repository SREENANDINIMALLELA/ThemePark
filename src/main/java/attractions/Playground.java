package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class Playground extends Attraction implements ISecurity {

    public Playground(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        boolean checkAgeCriteria =false ;
        if(visitor.getAge()>=15){
            checkAgeCriteria =true;
        }
        return checkAgeCriteria ;
    }
}
