package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    public Double defaultPrice(){
        return 4.50;
    }

    public Double priceFor(Visitor visitor){
        if (visitor.getAge() < 12){
            return defaultPrice() / 2.0;}
        else {
            return defaultPrice();}
    }

}
