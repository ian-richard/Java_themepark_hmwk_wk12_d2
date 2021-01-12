package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class RollerCoaster extends Attraction implements ISecurity, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public Boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 12){
            if (visitor.getHeight() > 145){
                return TRUE;
            }
        }

        return FALSE;
    }
    public Double defaultPrice(){
        return 8.40;
    }

    public Double priceFor(Visitor visitor){
        if (visitor.getHeight() > 200){
        return defaultPrice() * 2.0;}
        else {
            return defaultPrice();}
    }
}
