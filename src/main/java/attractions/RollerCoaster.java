package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity , ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }
    public boolean isAllowedTo(Visitor visitor) {
        boolean checkheightCriteria =false ;
        if(visitor.getHeight()>=145 && visitor.getAge()>=12){
            checkheightCriteria =true;
        }
        return checkheightCriteria ;
    }

    @Override
    public double defaultPrice() {
        return 8.40 ;
    }

    @Override
    public double priceFor(Visitor visitor) {
       double ticketPrice = 0;
        if(visitor.getHeight()>=200){
            ticketPrice= defaultPrice()* 2;
        }
        else{
            ticketPrice =defaultPrice();
        }
        return ticketPrice;
    }
}
